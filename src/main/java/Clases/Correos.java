/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Heber
 */
public class Correos{
    public static File generarPDF(String nombre, String apellido1, String apellido2, String correo, String pass){
        try {
            File file = new File("Agradecimiento.pdf");
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            
            Image imagen = Image.getInstance("imagenesL/Logo.jpg");
            imagen.scaleToFit(150, 150);
            imagen.setAlignment(Image.ALIGN_CENTER);
            document.add(imagen);
            
            document.add(new Paragraph("¡Gracias por registrarte, " + nombre + " " + apellido1 + " " + apellido2 + "!"));
            document.add(new Paragraph("Correo registrado: " + correo));
            document.add(new Paragraph("Contraseña: " + pass));
            document.add(new Paragraph("\nTe damos la bienvenida."));
            document.add(new Paragraph("\nAtentamente,"));
            document.add(new Paragraph("El equipo de Figyua Haven"));
            document.close();
            
            return file;
        } catch (DocumentException | IOException e){
            return null;
        }
    }
    
    public static File generarPDFRecibo(String tipo, ArrayList<String> list1, ArrayList<Double> list2, ArrayList<Integer> list3, double pago){
        try{
            String nombreArchivo = "Recibo.pdf";
            File file = new File(nombreArchivo);
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();

            Image imagen = Image.getInstance("imagenesL/Logo.jpg");
            imagen.scaleToFit(150, 150);
            imagen.setAlignment(Image.ALIGN_CENTER);
            document.add(imagen);

            Paragraph titulo = new Paragraph("Figyua Haven", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            Paragraph tip = new Paragraph("Tipo de Pago: " + tipo);
            tip.setAlignment(Element.ALIGN_CENTER);
            document.add(tip);

            document.add(new Paragraph(" "));

            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            tabla.setWidths(new float[]{2.5f, 1.5f, 1.5f, 2f, 1.5f, 2f});

            // Encabezados
            String[] encabezados = {"Nombre", "Sin IVA", "IVA (16%)", "Precio Total", "Cantidad", "Total Línea"};
            for (String enc : encabezados){
                PdfPCell celda = new PdfPCell(new Phrase(enc));
                celda.setBackgroundColor(Color.LIGHT_GRAY);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabla.addCell(celda);
            }

            double total = 0.0;
            for (int i = 0; i < list1.size(); i++){
                String nombre = list1.get(i);
                double precio = list2.get(i); // precio CON IVA
                int cantidad = list3.get(i);

                double precioSI = precio / 1.16;
                double iva = precio - precioSI;
                double totalLinea = precio * cantidad;
                total += totalLinea;

                tabla.addCell(nombre);
                tabla.addCell(String.format("$%.2f", precioSI));
                tabla.addCell(String.format("$%.2f", iva));
                tabla.addCell(String.format("$%.2f", precio));
                tabla.addCell(String.valueOf(cantidad));
                tabla.addCell(String.format("$%.2f", totalLinea));
            }
            document.add(tabla);

            Paragraph tot = new Paragraph("Total a Pagar: $" + total, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
            tot.setAlignment(Element.ALIGN_RIGHT);
            document.add(tot);
            tot = new Paragraph("Pagó: $" + pago, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
            tot.setAlignment(Element.ALIGN_RIGHT);
            document.add(tot);
            double fin = pago - total;
            tot = new Paragraph("Cambio: $" + fin, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14));
            tot.setAlignment(Element.ALIGN_RIGHT);
            document.add(tot);

            Paragraph fecha = new Paragraph("Fecha: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
            fecha.setAlignment(Element.ALIGN_RIGHT);
            document.add(fecha);

            document.close();
            return file;

        } catch (DocumentException | IOException e){
            return null;
        }
    }
    
    public static boolean enviarCorreoConPDF(String destinatario, File archivoAdjunto){
        System.setProperty("jdk.tls.client.protocols", "TLSv1.2");
        final String remitente = "figyuahaven647@gmail.com";
        final String clave = "zdcu bktx iwko lycm"; // Contraseña de aplicación

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remitente, clave);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject("¡Gracias por registrarte!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Adjunto encontrarás tu comprobante de registro.");

            MimeBodyPart attachmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource(archivoAdjunto);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName(archivoAdjunto.getName());

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);
            System.out.println("Enviando correo a: " + destinatario);
            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace(); // muestra el error exacto en consola
            return false;
        }
    }
    
    public static boolean enviarCorreoConPDFPago(String destinatario, File archivoAdjunto){
        System.setProperty("jdk.tls.client.protocols", "TLSv1.2");
        final String remitente = "figyuahaven647@gmail.com";
        final String clave = "zdcu bktx iwko lycm"; // Contraseña de aplicación

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remitente, clave);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject("¡Gracias por tu Compra!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Adjunto encontrarás tu Recibo.");

            MimeBodyPart attachmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource(archivoAdjunto);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName(archivoAdjunto.getName());

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);
            System.out.println("Enviando correo a: " + destinatario);
            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace(); // muestra el error exacto en consola
            return false;
        }
    }
    
    public static String encriptarM(String contraseña){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contraseña.getBytes());
            StringBuilder hexString = new StringBuilder();
            
            for(byte b : hash){
                hexString.append(String.format("%02x", b));
            }
            
            return hexString.toString();
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }
    
    public static String encriptar(String texto){
        StringBuilder resultado = new StringBuilder();
        int desplazamiento = 3; //desplazamiento tipo César
        
        for(char c : texto.toCharArray()){
            // Solo letras y dígitos
            if (Character.isLetterOrDigit(c)){
                char base = Character.isUpperCase(c) ? 'A' : (Character.isLowerCase(c) ? 'a' : '0');
                int limite = Character.isDigit(c) ? 10 : 26;
                char nuevo = (char) (base + (c - base + desplazamiento) % limite);
                resultado.append(nuevo);
            } else{
                // Otros caracteres se agregan tal cual
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }
}
