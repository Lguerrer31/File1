/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz_grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author lguerrer17
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        txtres = new javax.swing.JTextField();
        cmdCal = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox<>();
        lblOperacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbltitle.setText("Operaciones");
        getContentPane().add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setText("Primer Número");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setText("Segundo Número");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel4.setText("Resultado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));
        getContentPane().add(txtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, -1));
        getContentPane().add(txtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 50, -1));

        txtres.setEditable(false);
        txtres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresActionPerformed(evt);
            }
        });
        getContentPane().add(txtres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, -1));

        cmdCal.setText("Calcular");
        cmdCal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmdCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalActionPerformed(evt);
            }
        });
        cmdCal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdCalKeyPressed(evt);
            }
        });
        getContentPane().add(cmdCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 70, 30));

        cmdDelete.setText("Borrar");
        cmdDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(cmdDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, 30));

        cmb.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "Division" }));
        cmb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 70, -1));

        lblOperacion.setText("Operación");
        getContentPane().add(lblOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresActionPerformed

    private void cmdCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalActionPerformed
        // TODO add your handling code here:
        String n1, n2, resul;
        double num1, num2, operacion;
        int opc;
        
        n1 = txtn1.getText();
        n2 = txtn2.getText();
        
        if (txtn1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite por favor el número 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtn1.requestFocusInWindow();
        }
        
        else if (txtn2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite por favor el número 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtn2.requestFocusInWindow();
        } 
        
        else{
            
        num1 = Double.parseDouble(txtn1.getText());
        num2 = Double.parseDouble(txtn2.getText());
        opc=cmb.getSelectedIndex();
        
        switch(opc){
            case 0:
                operacion = num1 + num2;
            break;
            case 1:
                operacion = num1 - num2;
            break;
            case 2:
                operacion = num1 * num2;
            break;
            case 3:
               operacion = num1 / num2;
            break;
            default:
                operacion = 0;
            break;
        }
        resul = String.valueOf(operacion);
        txtres.setText(resul);
        }
    }//GEN-LAST:event_cmdCalActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        txtn1.setText("");
        txtn2.setText("");
        txtres.setText("");
        txtn1.requestFocusInWindow();
        cmb.setSelectedIndex(0);
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdCalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdCalKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdCalKeyPressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JButton cmdCal;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtres;
    // End of variables declaration//GEN-END:variables
}
