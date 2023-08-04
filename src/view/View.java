/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marioosuna
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
       setSize(800,400);
       setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        btn_yes = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿QUIERES SER MI NOVIA?");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        jPanelButtons.setBackground(new java.awt.Color(255, 204, 204));
        jPanelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_yes.setBackground(new java.awt.Color(255, 51, 153));
        btn_yes.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_yes.setText("SÍ");
        btn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yesActionPerformed(evt);
            }
        });
        jPanelButtons.add(btn_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 100, 38));

        btn_no.setBackground(new java.awt.Color(255, 51, 153));
        btn_no.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btn_no.setText("NO");
        btn_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_noMouseEntered(evt);
            }
        });
        jPanelButtons.add(btn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, 38));

        getContentPane().add(jPanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_noMouseEntered
        // TODO add your handling code here:
        int buttonNoWidth = jPanelButtons.getWidth() - btn_no.getWidth();
        int buttonNoHeight = jPanelButtons.getHeight() - btn_no.getHeight();
        int x = (int) Math.round(buttonNoWidth * Math.random());
        int y = (int) Math.round(buttonNoHeight * Math.random());
        btn_no.setLocation(x, y);
    }//GEN-LAST:event_btn_noMouseEntered

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "sabía que dirias que sí :3"); 
        JOptionPane.showMessageDialog(null, "MARAVILLOSA JUGADA 8)");
        System.exit(0);
    }//GEN-LAST:event_btn_yesActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelButtons;
    // End of variables declaration//GEN-END:variables
}
