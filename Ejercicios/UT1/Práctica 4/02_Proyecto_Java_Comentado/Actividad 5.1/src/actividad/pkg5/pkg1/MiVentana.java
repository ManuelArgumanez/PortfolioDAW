/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package actividad.pkg5.pkg1;

import javax.swing.DefaultListModel;

/**
 * Ventana de una calculadora sencilla.
 * Permite sumar, restar, multiplicar y dividir dos numeros.
 *
 * @author usutarde
 */
public class MiVentana extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MiVentana.class.getName());
    
    private DefaultListModel dlmCalculadora;

    /**
     * Crea la ventana y prepara sus componentes.
     */
    public MiVentana() {
        initComponents();
        dlmCalculadora= new DefaultListModel();
    }

    /**
     * Prepara los botones, cuadros de texto y demas elementos de la ventana.
     * Este metodo lo genera NetBeans automaticamente y no se modifica.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_btn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_op1 = new javax.swing.JLabel();
        lb_op2 = new javax.swing.JLabel();
        txt_op1 = new javax.swing.JTextField();
        txt_op2 = new javax.swing.JTextField();
        rbtn_sumar = new javax.swing.JRadioButton();
        rbtn_restar = new javax.swing.JRadioButton();
        rbtn_multiplicar = new javax.swing.JRadioButton();
        rbtn_dividir = new javax.swing.JRadioButton();
        lb_resultado = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lb_datos = new javax.swing.JLabel();
        lb_operacion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_archivo = new javax.swing.JMenu();
        mn_editar = new javax.swing.JMenu();
        mn_programas = new javax.swing.JMenu();
        mn_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_op1.setText("Operando 1");

        lb_op2.setText("Operando 2");

        txt_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_op1ActionPerformed(evt);
            }
        });

        txt_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_op2ActionPerformed(evt);
            }
        });

        grupo_btn.add(rbtn_sumar);
        rbtn_sumar.setText("Sumar");
        rbtn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_sumarActionPerformed(evt);
            }
        });

        grupo_btn.add(rbtn_restar);
        rbtn_restar.setText("Restar");

        grupo_btn.add(rbtn_multiplicar);
        rbtn_multiplicar.setText("Multiplicar");

        grupo_btn.add(rbtn_dividir);
        rbtn_dividir.setText("Dividir");

        lb_resultado.setText("Resultado");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        lb_datos.setText("Datos:");

        lb_operacion.setText("Operación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(rbtn_sumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_restar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_multiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_dividir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btn_calcular)
                        .addGap(54, 54, 54)
                        .addComponent(btn_salir)))
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_op1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_op2))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_op1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txt_op2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lb_resultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_operacion)
                            .addComponent(lb_datos))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lb_datos)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_op1)
                    .addComponent(txt_op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_op2)
                    .addComponent(txt_op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lb_operacion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_sumar)
                    .addComponent(rbtn_restar)
                    .addComponent(rbtn_multiplicar)
                    .addComponent(rbtn_dividir))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_resultado)
                    .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular)
                    .addComponent(btn_salir))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        mn_archivo.setText("Archivo");
        jMenuBar1.add(mn_archivo);

        mn_editar.setText("Editar");
        jMenuBar1.add(mn_editar);

        mn_programas.setText("Programas");
        jMenuBar1.add(mn_programas);

        mn_ayuda.setText("Ayuda");
        jMenuBar1.add(mn_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento del primer cuadro de texto. De momento no hace nada.
     * @param evt evento del cuadro de texto
     */
    private void txt_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_op1ActionPerformed

    /**
     * Evento de seleccionar la suma.
     * @param evt evento del boton de suma
     */
    private void rbtn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_sumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_sumarActionPerformed

    /**
     * Evento del segundo cuadro de texto. De momento no hace nada.
     * @param evt evento del cuadro de texto
     */
    private void txt_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_op2ActionPerformed

    /**
     * Lee los dos numeros y calcula la operacion que se ha seleccionado.
     * Si escribimos letras en lugar de numeros, muestra un aviso.
     *
     * @param evt evento al pulsar el boton Calcular
     */
    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        try {
    int n = Integer.parseInt(txt_op1.getText());
    int n2 = Integer.parseInt(txt_op2.getText());

    if (rbtn_sumar.isSelected()) {
        double s = n + n2;
        txt_resultado.setText("" + s);
    }

    if (rbtn_restar.isSelected()) {
        double r = n - n2;
        txt_resultado.setText("" + r);
    }

    if (rbtn_multiplicar.isSelected()) {
        double m = n * n2;
        txt_resultado.setText("" + m);
    }

    if (rbtn_dividir.isSelected()) {
        double d = n / n2;
        txt_resultado.setText("" + d);
    }

} catch (NumberFormatException e) {
    txt_resultado.setText("DATOS INTRODUCIDOS NO NUMÉRICOS");
}
    }//GEN-LAST:event_btn_calcularActionPerformed

    /**
     * Cierra el programa al pulsar el boton Salir.
     * @param evt evento al pulsar el boton
     */
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * Abre directamente la ventana de la calculadora.
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
        java.awt.EventQueue.invokeLater(() -> new MiVentana().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup grupo_btn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_datos;
    private javax.swing.JLabel lb_op1;
    private javax.swing.JLabel lb_op2;
    private javax.swing.JLabel lb_operacion;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JMenu mn_archivo;
    private javax.swing.JMenu mn_ayuda;
    private javax.swing.JMenu mn_editar;
    private javax.swing.JMenu mn_programas;
    private javax.swing.JRadioButton rbtn_dividir;
    private javax.swing.JRadioButton rbtn_multiplicar;
    private javax.swing.JRadioButton rbtn_restar;
    private javax.swing.JRadioButton rbtn_sumar;
    private javax.swing.JTextField txt_op1;
    private javax.swing.JTextField txt_op2;
    private javax.swing.JTextField txt_resultado;
    // End of variables declaration//GEN-END:variables
}
