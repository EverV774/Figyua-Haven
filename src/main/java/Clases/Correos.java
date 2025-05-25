/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;

import java.io.*;
import java.net.URL;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author Heber
 */
public class Correos{
    public static File generarPDF(String nombre, String us, String apellido1, String apellido2, String correo, String pass){
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
            document.add(new Paragraph("\nUsuario: " + us));
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
}
