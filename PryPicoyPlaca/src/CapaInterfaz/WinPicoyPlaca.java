/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaz;

import CapaDatos.ClsPicoyPlaca;
import java.awt.Color;

/**
 *
 * @author dell
 */
public class WinPicoyPlaca extends javax.swing.JFrame {

    String placa;
    String fecha;
    String hora;
    ClsPicoyPlaca p;
    
    public WinPicoyPlaca() {
        initComponents();
        this.getContentPane().setBackground(Color.CYAN);
        TextPrompt p =new TextPrompt("AAA-111", TxtNump);
        TextPrompt f =new TextPrompt("dd/mm/aaa", TxtFecha);
        TextPrompt h =new TextPrompt("24:00", TxtHora);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNump = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        TxtHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pico y Placa");
        setBackground(new java.awt.Color(153, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCalcular.setBackground(new java.awt.Color(204, 204, 255));
        BtnCalcular.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 195, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Calculadora de Pico y Placa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 11, -1, 37));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Placa: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, 23));

        TxtNump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumpActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNump, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 54, 152, 24));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 97, -1, 23));
        getContentPane().add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 98, 152, 24));
        getContentPane().add(TxtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 141, 152, 24));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Hora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 140, -1, 23));

        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        BtnLimpiar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, -1, -1));

        BtnSalir.setBackground(new java.awt.Color(204, 204, 255));
        BtnSalir.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 195, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CapaInterfaz/pico-y-placa.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 500, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumpActionPerformed
        
    }//GEN-LAST:event_TxtNumpActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        placa=TxtNump.getText();
        fecha=TxtFecha.getText();
        hora=TxtHora.getText();
        
        p=new ClsPicoyPlaca(placa, fecha, hora);
        
        p.numplaca(placa);
        p.fecha(fecha);
        p.hora(hora);
        
        
        
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtFecha.setText(null);
        TxtHora.setText(null);
        TxtNump.setText(null);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(WinPicoyPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPicoyPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPicoyPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPicoyPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPicoyPlaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtHora;
    private javax.swing.JTextField TxtNump;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
