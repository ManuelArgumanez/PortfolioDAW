/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package actividad.pkg5.pkg1;

/**
 * Ventana para calcular el indice de masa corporal (IMC).
 * El usuario escribe su altura y peso, y el programa muestra el resultado.
 *
 * @author usutarde
 */
public class MiVentanaIMC extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MiVentanaIMC.class.getName());

    /**
     * Crea la ventana del IMC.
     */
    public MiVentanaIMC() {
        initComponents();
    }

    /**
     * Prepara los elementos de la ventana.
     * NetBeans crea esta parte del codigo de forma automatica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_altura = new javax.swing.JLabel();
        lb_peso = new javax.swing.JLabel();
        lb_genero = new javax.swing.JLabel();
        lb_tipo = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_altura = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        cb_genero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_altura.setText("Altura (cm):");

        lb_peso.setText("Peso (kg):");

        lb_genero.setText("Género");

        lb_tipo.setText("Tipo de peso:");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesoActionPerformed(evt);
            }
        });

        txt_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoActionPerformed(evt);
            }
        });

        cb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mujer", "Hombre" }));
        cb_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_generoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_altura)
                                .addGap(98, 98, 98)
                                .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_peso)
                                    .addComponent(lb_genero)
                                    .addComponent(lb_tipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_peso)
                                    .addComponent(cb_genero, 0, 136, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_calcular)
                                .addGap(45, 45, 45)
                                .addComponent(jButton2))
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_altura)
                            .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_peso)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_genero)
                    .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tipo)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btn_calcular))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento de la lista de genero. No tiene acciones añadidas.
     * @param evt evento de la lista
     */
    private void cb_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_generoActionPerformed

    /**
     * Evento del cuadro donde se muestra el tipo de peso.
     * @param evt evento del cuadro de texto
     */
    private void txt_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoActionPerformed

    /**
     * Evento del cuadro donde se escribe el peso.
     * @param evt evento del cuadro de texto
     */
    private void txt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesoActionPerformed

    /**
     * Calcula el IMC usando la altura y el peso escritos.
     * Despues muestra un texto segun el resultado.
     *
     * @param evt evento al pulsar Calcular
     */
    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        try{
        int a = Integer.parseInt(txt_altura.getText());
        int p= Integer.parseInt(txt_peso.getText());
        double t= (p*10000)/(a*a);
        
    if (t < 18) {
        txt_tipo.setText("Peso por debajo de lo normal");
    } else if (t < 25) {
        txt_tipo.setText("Peso normal");
    } else if (t < 30) {
        txt_tipo.setText("Preobeso");
    } else if (t < 35) {
        txt_tipo.setText("Obesidad de 2º grado");
    } else if (t < 40) {
        txt_tipo.setText("Obesidad de 3º grado (premórbida)");
    } else {
        txt_tipo.setText("Obesidad de 4º grado (mórbida)");
    }
        }catch (NumberFormatException e){
            txt_tipo.setText("Datos introducidos no validos");
        }
    }//GEN-LAST:event_btn_calcularActionPerformed

    /**
     * Cierra el programa al pulsar el boton de salir.
     * @param evt evento al pulsar el boton
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Abre directamente la ventana del IMC.
     *
     * @param args argumentos del programa (no se utilizan)
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MiVentanaIMC().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JComboBox<String> cb_genero;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_altura;
    private javax.swing.JLabel lb_genero;
    private javax.swing.JLabel lb_peso;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
