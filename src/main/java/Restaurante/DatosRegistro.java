package Restaurante;

import java.awt.Color;

public class DatosRegistro extends javax.swing.JFrame {

    public DatosRegistro() {
        initComponents();
        ajustarApariencia();
    }
    public void ajustarApariencia(){        
        this.setTitle("Registro de restaurante");
        this.setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);
        chck_lunes.setBackground(Color.WHITE);
        chck_martes.setBackground(Color.WHITE);
        chck_miercoles.setBackground(Color.WHITE);
        chck_jueves.setBackground(Color.WHITE);
        chck_viernes.setBackground(Color.WHITE);
        chck_sabado.setBackground(Color.WHITE);
        chck_domingo.setBackground(Color.WHITE);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bienvenido = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        lbl_contrasena = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        Registrar = new javax.swing.JButton();
        lbl_instrucciones = new javax.swing.JLabel();
        lbl_rpcontrasena = new javax.swing.JLabel();
        txt_passConfirm = new javax.swing.JPasswordField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JFormattedTextField();
        lbl_correo = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        lbl_correo1 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_correo2 = new javax.swing.JLabel();
        chck_lunes = new javax.swing.JCheckBox();
        txt_Hlunes = new javax.swing.JFormattedTextField();
        lbl_correo3 = new javax.swing.JLabel();
        lbl_correo4 = new javax.swing.JLabel();
        chck_miercoles = new javax.swing.JCheckBox();
        txt_Hmartes = new javax.swing.JFormattedTextField();
        txt_Hmiercoles = new javax.swing.JFormattedTextField();
        chck_martes = new javax.swing.JCheckBox();
        chck_jueves = new javax.swing.JCheckBox();
        txt_Hjueves = new javax.swing.JFormattedTextField();
        chck_viernes = new javax.swing.JCheckBox();
        txt_Hviernes = new javax.swing.JFormattedTextField();
        chck_sabado = new javax.swing.JCheckBox();
        txt_Hsabado = new javax.swing.JFormattedTextField();
        chck_domingo = new javax.swing.JCheckBox();
        txt_Hdomingo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1371, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_bienvenido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lbl_bienvenido.setText("Registro de restaurante");

        lbl_nombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_nombre.setText("Nombre");

        text_nombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });

        lbl_contrasena.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_contrasena.setText("Nueva contraseña:");

        txt_pass.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_pass.setName("Contra"); // NOI18N
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        lbl_instrucciones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_instrucciones.setText("Ingrese los datos a continuación...");

        lbl_rpcontrasena.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_rpcontrasena.setText("Repita su contraseña:");

        txt_passConfirm.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_passConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passConfirmActionPerformed(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_telefono.setText("Teléfono");

        txt_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txt_telefono.setToolTipText("");
        txt_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_telefono.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        lbl_correo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_correo.setText("Correo");

        txt_correo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        lbl_correo1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_correo1.setText("Dirección");

        txt_direccion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        lbl_correo2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_correo2.setText("Horario");

        chck_lunes.setText("Lunes");

        try {
            txt_Hlunes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Hlunes.setAutoscrolls(false);
        txt_Hlunes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_HlunesPropertyChange(evt);
            }
        });

        lbl_correo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_correo3.setText("Día");

        lbl_correo4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_correo4.setText("Apertura - Cierre");

        chck_miercoles.setText("Miércoles");

        try {
            txt_Hmartes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_Hmiercoles.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chck_martes.setText("Martes");

        chck_jueves.setText("Jueves");

        try {
            txt_Hjueves.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chck_viernes.setText("Viernes");

        try {
            txt_Hviernes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chck_sabado.setText("Sábado");

        try {
            txt_Hsabado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chck_domingo.setText("Domingo");

        try {
            txt_Hdomingo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## - ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(lbl_bienvenido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(lbl_nombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_instrucciones)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_passConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(chck_domingo)
                                            .addGap(31, 31, 31)
                                            .addComponent(txt_Hdomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_contrasena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_rpcontrasena)
                                .addGap(174, 174, 174))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl_correo1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbl_correo2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_correo3)
                                                    .addComponent(chck_miercoles)
                                                    .addComponent(chck_martes)
                                                    .addComponent(chck_lunes))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(13, 13, 13)
                                                        .addComponent(lbl_correo4))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txt_Hmiercoles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                        .addComponent(txt_Hmartes, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_Hlunes, javax.swing.GroupLayout.Alignment.LEADING)))))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chck_viernes)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(chck_jueves))
                                            .addComponent(chck_sabado))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_Hviernes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(txt_Hjueves, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Hsabado, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(0, 269, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl_telefono)
                                        .addGap(183, 183, 183))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lbl_correo))
                                    .addComponent(txt_correo))))
                        .addGap(407, 407, 407))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbl_bienvenido)
                .addGap(56, 56, 56)
                .addComponent(lbl_instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_correo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_correo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_correo3)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chck_domingo)
                                    .addComponent(txt_Hdomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(chck_miercoles))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chck_jueves)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chck_viernes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chck_sabado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Hjueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt_Hviernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Hsabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_correo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Hlunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chck_lunes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Hmartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chck_martes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Hmiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contrasena)
                    .addComponent(lbl_rpcontrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(Registrar)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed

    }//GEN-LAST:event_text_nombreActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        
    }//GEN-LAST:event_RegistrarActionPerformed

    private void txt_passConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passConfirmActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_HlunesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_HlunesPropertyChange
       
    }//GEN-LAST:event_txt_HlunesPropertyChange

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JCheckBox chck_domingo;
    private javax.swing.JCheckBox chck_jueves;
    private javax.swing.JCheckBox chck_lunes;
    private javax.swing.JCheckBox chck_martes;
    private javax.swing.JCheckBox chck_miercoles;
    private javax.swing.JCheckBox chck_sabado;
    private javax.swing.JCheckBox chck_viernes;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_correo1;
    private javax.swing.JLabel lbl_correo2;
    private javax.swing.JLabel lbl_correo3;
    private javax.swing.JLabel lbl_correo4;
    private javax.swing.JLabel lbl_instrucciones;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rpcontrasena;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JFormattedTextField txt_Hdomingo;
    private javax.swing.JFormattedTextField txt_Hjueves;
    private javax.swing.JFormattedTextField txt_Hlunes;
    private javax.swing.JFormattedTextField txt_Hmartes;
    private javax.swing.JFormattedTextField txt_Hmiercoles;
    private javax.swing.JFormattedTextField txt_Hsabado;
    private javax.swing.JFormattedTextField txt_Hviernes;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_passConfirm;
    private javax.swing.JFormattedTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
