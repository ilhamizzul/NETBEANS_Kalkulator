/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilham Izzul
 */
public class Frame3 extends javax.swing.JFrame {

    /**
     * Creates new form Frame3
     */
    public Frame3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bil2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Bil1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Hasilkurang = new javax.swing.JButton();
        Hasilkali = new javax.swing.JButton();
        Hasilbagi = new javax.swing.JButton();
        Hasiltambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 110, 14);

        jLabel3.setText("Bilangan 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(104, 50, 60, 14);
        getContentPane().add(Bil2);
        Bil2.setBounds(190, 100, 50, 30);

        jLabel4.setText("Bilangan 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(104, 100, 60, 14);

        Bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bil1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bil1);
        Bil1.setBounds(190, 50, 50, 30);

        jLabel2.setText("Operator");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 140, 60, 14);

        Hasilkurang.setText("-");
        Hasilkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilkurangActionPerformed(evt);
            }
        });
        getContentPane().add(Hasilkurang);
        Hasilkurang.setBounds(280, 160, 60, 40);

        Hasilkali.setText("X");
        Hasilkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilkaliActionPerformed(evt);
            }
        });
        getContentPane().add(Hasilkali);
        Hasilkali.setBounds(70, 160, 60, 40);

        Hasilbagi.setText(":");
        Hasilbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilbagiActionPerformed(evt);
            }
        });
        getContentPane().add(Hasilbagi);
        Hasilbagi.setBounds(140, 160, 60, 40);

        Hasiltambah.setText("+");
        Hasiltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasiltambahActionPerformed(evt);
            }
        });
        getContentPane().add(Hasiltambah);
        Hasiltambah.setBounds(210, 160, 60, 40);

        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 210, 34, 14);
        getContentPane().add(Hasil);
        Hasil.setBounds(150, 240, 100, 40);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bil1ActionPerformed

    private void HasilkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilkaliActionPerformed
        double bil1 = Double.parseDouble(Bil1.getText());
        double bil2 = Double.parseDouble(Bil2.getText());
        double hasilkali = bil1 * bil2;
        
        Hasil.setText(String.valueOf(hasilkali));
    }//GEN-LAST:event_HasilkaliActionPerformed

    private void HasilbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilbagiActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bil1.getText());
        double bil2 = Double.parseDouble(Bil2.getText());
        double hasilbagi = bil1 / bil2;
        
        Hasil.setText(String.valueOf(hasilbagi));
    }//GEN-LAST:event_HasilbagiActionPerformed

    private void HasiltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasiltambahActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bil1.getText());
        double bil2 = Double.parseDouble(Bil2.getText());
        double hasiltambah = bil1 + bil2;
        
        Hasil.setText(String.valueOf(hasiltambah));
    }//GEN-LAST:event_HasiltambahActionPerformed

    private void HasilkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilkurangActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bil1.getText());
        double bil2 = Double.parseDouble(Bil2.getText());
        double hasilkurang = bil1 - bil2;
        
        Hasil.setText(String.valueOf(hasilkurang));
    }//GEN-LAST:event_HasilkurangActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bil1;
    private javax.swing.JTextField Bil2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hasilbagi;
    private javax.swing.JButton Hasilkali;
    private javax.swing.JButton Hasilkurang;
    private javax.swing.JButton Hasiltambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
