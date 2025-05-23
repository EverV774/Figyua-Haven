/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdd;

import javax.swing.*;
import clases.Validador;
import static java.awt.Color.BLACK;
import clases.Usuarios;
import static java.awt.Color.RED;
import java.util.ArrayList;

/**
 *
 * @author aless
 */
public class LoginEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Validador inicio=new Validador();
    ArrayList<Usuarios> ListaU=new ArrayList<>();
    
    public LoginEmpresa() {
        initComponents();
        
        JScrollPane scrollPane = new JScrollPane(panelPrincipal);
        this.setContentPane(scrollPane); // Reemplaza el contenido del JFrame con el JScrollPane
        this.setSize(850, 650);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        btnVer1.setVisible(false);
        btnVer3.setVisible(false);
        btnVer5.setVisible(false);
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingreso = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        Registro = new javax.swing.JDialog();
        JCalendario = new com.toedter.calendar.JDateChooser();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rMasculino = new javax.swing.JRadioButton();
        rFemenino = new javax.swing.JRadioButton();
        btnVaciar2 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        ErrorC2 = new javax.swing.JLabel();
        ErrorNombre = new javax.swing.JLabel();
        ErrorAP = new javax.swing.JLabel();
        ErrorAM = new javax.swing.JLabel();
        ErrorG = new javax.swing.JLabel();
        ErrorN = new javax.swing.JLabel();
        ErrorCorreo = new javax.swing.JLabel();
        ErrorC1 = new javax.swing.JLabel();
        txtContrasena2 = new javax.swing.JPasswordField();
        txtContrasena1 = new javax.swing.JPasswordField();
        btnVer = new javax.swing.JButton();
        btnVer1 = new javax.swing.JButton();
        btnVer2 = new javax.swing.JButton();
        btnVer3 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtUsu = new javax.swing.JTextField();
        ErrorUsu = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rCliente = new javax.swing.JRadioButton();
        rEmpleado = new javax.swing.JRadioButton();
        ErrorR = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        generoG = new javax.swing.ButtonGroup();
        rangoG = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        VaciarIn = new javax.swing.JButton();
        IngresarIn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        lblError3 = new javax.swing.JLabel();
        lblError1 = new javax.swing.JLabel();
        btnVer4 = new javax.swing.JButton();
        btnVer5 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();
        txtCO = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        Ingreso.setModal(true);
        Ingreso.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                IngresoWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout IngresoLayout = new javax.swing.GroupLayout(Ingreso.getContentPane());
        Ingreso.getContentPane().setLayout(IngresoLayout);
        IngresoLayout.setHorizontalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        IngresoLayout.setVerticalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Registro.setModal(true);
        Registro.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                RegistroWindowClosing(evt);
            }
        });
        Registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Registro.getContentPane().add(JCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 320, 40));
        Registro.getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 320, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Registro");
        Registro.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));
        Registro.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Apellido Paterno:");
        Registro.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
        Registro.getContentPane().add(txtAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 320, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Apellido Materno:");
        Registro.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));
        Registro.getContentPane().add(txtAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 320, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Género:");
        Registro.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Fecha de Nacimiento:");
        Registro.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Correo:");
        Registro.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));
        Registro.getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 320, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Contraseña:");
        Registro.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Verificar Contraseña:");
        Registro.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        generoG.add(rMasculino);
        rMasculino.setText("Hombre");
        rMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMasculinoActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(rMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

        generoG.add(rFemenino);
        rFemenino.setText("Mujer");
        Registro.getContentPane().add(rFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        btnVaciar2.setBackground(new java.awt.Color(255, 153, 153));
        btnVaciar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVaciar2.setText("Vaciar");
        btnVaciar2.setBorder(null);
        btnVaciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciar2ActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnVaciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 150, 40));

        btnAceptar.setBackground(new java.awt.Color(255, 153, 153));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, 150, 40));
        Registro.getContentPane().add(ErrorC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 320, 30));
        Registro.getContentPane().add(ErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 320, 20));
        Registro.getContentPane().add(ErrorAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 320, 20));
        Registro.getContentPane().add(ErrorAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 320, 20));
        Registro.getContentPane().add(ErrorG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 230, 20));
        Registro.getContentPane().add(ErrorN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 320, 20));
        Registro.getContentPane().add(ErrorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 320, 20));
        Registro.getContentPane().add(ErrorC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 320, 20));
        Registro.getContentPane().add(txtContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 320, 40));
        Registro.getContentPane().add(txtContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 320, 40));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo1.png"))); // NOI18N
        btnVer.setBorderPainted(false);
        btnVer.setContentAreaFilled(false);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, -1, 40));

        btnVer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo2.png"))); // NOI18N
        btnVer1.setBorderPainted(false);
        btnVer1.setContentAreaFilled(false);
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, -1, 40));

        btnVer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo1.png"))); // NOI18N
        btnVer2.setBorderPainted(false);
        btnVer2.setContentAreaFilled(false);
        btnVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer2ActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnVer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, -1, 40));

        btnVer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo2.png"))); // NOI18N
        btnVer3.setBorderPainted(false);
        btnVer3.setContentAreaFilled(false);
        btnVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer3ActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(btnVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, -1, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Usuario:");
        Registro.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        txtUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 320, 40));
        Registro.getContentPane().add(ErrorUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 320, 20));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Nombre(s):");
        Registro.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Rango:");
        Registro.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        rangoG.add(rCliente);
        rCliente.setText("Cliente");
        rCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rClienteActionPerformed(evt);
            }
        });
        Registro.getContentPane().add(rCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        rangoG.add(rEmpleado);
        rEmpleado.setText("Empleado");
        Registro.getContentPane().add(rEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));
        Registro.getContentPane().add(ErrorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 320, 20));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ca2.png"))); // NOI18N
        Registro.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 40, 50));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/u1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 40, 50));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/n1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 50));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/p1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 40, 50));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/m11.png"))); // NOI18N
        Registro.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, 60));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 40, 50));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/g1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 40, 50));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/r1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 40, 50));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 40, 50));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ca1.png"))); // NOI18N
        Registro.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 40, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diapositiva2.PNG"))); // NOI18N
        Registro.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VaciarIn.setBackground(new java.awt.Color(255, 153, 153));
        VaciarIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        VaciarIn.setText("Vaciar");
        VaciarIn.setBorder(null);
        panelPrincipal.add(VaciarIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 150, 40));

        IngresarIn.setBackground(new java.awt.Color(255, 153, 153));
        IngresarIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IngresarIn.setText("Ingresar");
        IngresarIn.setBorder(null);
        IngresarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarInActionPerformed(evt);
            }
        });
        panelPrincipal.add(IngresarIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Contraseña:");
        panelPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));
        panelPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 380, 40));
        panelPrincipal.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 380, 40));

        btnRegistro.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnRegistro.setText("Registrarse...");
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 100, -1));
        panelPrincipal.add(lblError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 380, 30));
        panelPrincipal.add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 380, 20));

        btnVer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo1.png"))); // NOI18N
        btnVer4.setBorderPainted(false);
        btnVer4.setContentAreaFilled(false);
        btnVer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer4ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 510, -1, 40));

        btnVer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojo2.png"))); // NOI18N
        btnVer5.setBorderPainted(false);
        btnVer5.setContentAreaFilled(false);
        btnVer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer5ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 510, -1, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo1.png"))); // NOI18N
        panelPrincipal.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, 200));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ca1.png"))); // NOI18N
        panelPrincipal.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 40, 50));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo1.png"))); // NOI18N
        panelPrincipal.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 430, -1, 290));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo1.png"))); // NOI18N
        panelPrincipal.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 140, -1, -1));
        panelPrincipal.add(lblError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 380, 20));
        panelPrincipal.add(txtCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 380, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setText("Correo:");
        panelPrincipal.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setText("Usuario:");
        panelPrincipal.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/u1.png"))); // NOI18N
        panelPrincipal.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 40, 50));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c1.png"))); // NOI18N
        panelPrincipal.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 40, 50));

        jLabel36.setBackground(new java.awt.Color(255, 255, 0));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diapositiva1.PNG"))); // NOI18N
        panelPrincipal.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMasculinoActionPerformed

    private void btnVaciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciar2ActionPerformed
        txtNombre.setText("");
        txtAP.setText("");
        txtAM.setText("");
        generoG.clearSelection();
        rangoG.clearSelection();
        JCalendario.setDate(null);
        txtCorreo.setText("");
        txtUsu.setText("");
        txtContrasena1.setText("");
        txtContrasena2.setText("");
        
        ErrorNombre.setText("");
        ErrorAP.setText("");
        ErrorAM.setText("");
        ErrorG.setText("");
        ErrorN.setText("");
        ErrorCorreo.setText("");
        ErrorC1.setText("");
        ErrorC2.setText("");
        ErrorUsu.setText("");
        ErrorR.setText("");
    }//GEN-LAST:event_btnVaciar2ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String n=txtNombre.getText();
        boolean rn=false;
        if (inicio.ValidarTexto(n)==true){
            rn=true;
            ErrorNombre.setText("");
            ErrorNombre.setForeground(BLACK); 
        }
        else {
            ErrorNombre.setText("El nombre debe incluir solo letras");
            ErrorNombre.setForeground(RED); 
        }
        boolean rap=false;
        String ap=txtAP.getText();
        if (inicio.ValidarTexto(ap)==true){
            rap=true;
            ErrorAP.setText("");
            ErrorAP.setForeground(BLACK); 
        }
        else {
            ErrorAP.setText("El Apellido debe incluir solo letras");
            ErrorAP.setForeground(RED); 
        }
        boolean ram=false;
        String am=txtAM.getText();
        if (inicio.ValidarTexto(am)==true){
            ram=true;
            ErrorAM.setText("");
            ErrorAM.setForeground(BLACK); 
        }
        else {
            ErrorAM.setText("El Apellido debe incluir solo letras");
            ErrorAM.setForeground(RED); 
        }
        
        boolean rg=false;
        String g="";
        
        if (generoG.getSelection()==null){
            ErrorG.setText("Debe elegir un género");
            ErrorG.setForeground(RED);
        }
        else {
            rg=true;
            ErrorG.setText("");
            ErrorG.setForeground(BLACK);
            if(rMasculino.isSelected()){
                g="Hombre";
            }
            if(rFemenino.isSelected()){
                g="Mujer";
            }
        }
        
        boolean rang=false;
        char r='c';
        
        if (rangoG.getSelection()==null){
            ErrorR.setText("Debe elegir un rango");
            ErrorR.setForeground(RED);
        }
        else {
            rang=true;
            ErrorG.setText("");
            ErrorG.setForeground(BLACK);
            if(rCliente.isSelected()){
                r='c';
            }
            if(rEmpleado.isSelected()){
                r='e';
            }
        }
        
        
        boolean rc=false;
        if (JCalendario.getDate()==null){
            ErrorN.setText("Debe elegir una fecha");
            ErrorN.setForeground(RED);
        }
        else {
            rc=true;
            ErrorN.setText("");
            ErrorN.setForeground(BLACK); 
        }
        
        boolean ru=false;
        if (inicio.validarCorreo(txtCorreo.getText().toLowerCase())==true){
            ru=true;
            ErrorCorreo.setText("");
            ErrorCorreo.setForeground(BLACK); 
        }
        else{
            ErrorCorreo.setText("El correo ingresado no tiene la estructura correcta");
            ErrorCorreo.setForeground(RED);
        }
        
        boolean rusu=false;
        if (!txtUsu.getText().equals("")){
            rusu=true;
            ErrorUsu.setText("");
            ErrorUsu.setForeground(BLACK); 
        }
        else{
            ErrorUsu.setText("El Usuario esta vacío");
            ErrorUsu.setForeground(RED);
        }
        
        boolean rc1=false;
        if(inicio.validarContrasena(txtContrasena1.getText())==true){
            rc1=true;
            ErrorC1.setText("");
            ErrorC1.setForeground(BLACK); 
        }
        else{
            ErrorC1.setText("La contraseña no tiene 8 caracteres");
            ErrorC1.setForeground(RED);
        }
        
        boolean rc2=false;
        if (!txtContrasena2.getText().equals(txtContrasena1.getText())||txtContrasena2.getText()==null){
            ErrorC2.setText("La contraseña no es la misma que la ingresada");
            ErrorC2.setForeground(RED);
        }
        else {
            rc2=true;
            ErrorC2.setText("");
            ErrorC2.setForeground(BLACK); 
        }
        
        if(rn==true&&rap==true&&ram==true&&rg==true&&rang==true&&rc==true&&ru==true&&rusu==true&&rc1==true&&rc2==true){
            Usuarios x=new Usuarios(n,ap,am,g,JCalendario.getDateFormatString(),txtCorreo.getText(),txtUsu.getText(),txtContrasena2.getText(),r);
            ListaU.add(x);
            if(Correos.enviarCorreoConPDF(txtCorreo.getText(), Correos.generarPDF(n, txtUsu.getText(), ap, am, txtCorreo.getText(), txtContrasena1.getText()))){
                JOptionPane.showMessageDialog(null, "Correo enviado");
            }
            Registro.setVisible(false);
            btnVaciar2.doClick();
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String Botones[]={"Cerrar","Cancelar"};
        int eleccion=JOptionPane.showOptionDialog(this,"¿Seguro que desea salir?","Titulo",0,0,null,Botones,this);
        if (eleccion==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void RegistroWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RegistroWindowClosing

    }//GEN-LAST:event_RegistroWindowClosing

    private void IngresoWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_IngresoWindowClosing

    }//GEN-LAST:event_IngresoWindowClosing

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        txtContrasena1.setEchoChar((char)0);
        btnVer.setVisible(false);
        btnVer1.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        txtContrasena1.setEchoChar('●');
        btnVer.setVisible(true);
        btnVer1.setVisible(false);
    }//GEN-LAST:event_btnVer1ActionPerformed

    private void btnVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer2ActionPerformed
        txtContrasena2.setEchoChar((char)0);
        btnVer2.setVisible(false);
        btnVer3.setVisible(true);
    }//GEN-LAST:event_btnVer2ActionPerformed

    private void btnVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer3ActionPerformed
        txtContrasena2.setEchoChar('●');
        btnVer2.setVisible(true);
        btnVer3.setVisible(false);
    }//GEN-LAST:event_btnVer3ActionPerformed

    private void rClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rClienteActionPerformed

    private void txtUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        Registro.setSize(1200, 800);
        Registro.setVisible(true); 
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void IngresarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarInActionPerformed

    private void btnVer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer5ActionPerformed
        // TODO add your handling code here:
        txtContrasena.setEchoChar('●');
        btnVer4.setVisible(true);
        btnVer5.setVisible(false);
    }//GEN-LAST:event_btnVer5ActionPerformed

    private void btnVer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer4ActionPerformed
        // TODO add your handling code here:
        txtContrasena.setEchoChar((char)0);
        btnVer4.setVisible(false);
        btnVer5.setVisible(true);
    }//GEN-LAST:event_btnVer4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorAM;
    private javax.swing.JLabel ErrorAP;
    private javax.swing.JLabel ErrorC1;
    private javax.swing.JLabel ErrorC2;
    private javax.swing.JLabel ErrorCorreo;
    private javax.swing.JLabel ErrorG;
    private javax.swing.JLabel ErrorN;
    private javax.swing.JLabel ErrorNombre;
    private javax.swing.JLabel ErrorR;
    private javax.swing.JLabel ErrorUsu;
    private javax.swing.JButton IngresarIn;
    private javax.swing.JDialog Ingreso;
    private com.toedter.calendar.JDateChooser JCalendario;
    private javax.swing.JDialog Registro;
    private javax.swing.JButton VaciarIn;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnVaciar2;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer2;
    private javax.swing.JButton btnVer3;
    private javax.swing.JButton btnVer4;
    private javax.swing.JButton btnVer5;
    private javax.swing.ButtonGroup generoG;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblError3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton rCliente;
    private javax.swing.JRadioButton rEmpleado;
    private javax.swing.JRadioButton rFemenino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.ButtonGroup rangoG;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtCO;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContrasena1;
    private javax.swing.JPasswordField txtContrasena2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsu;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}