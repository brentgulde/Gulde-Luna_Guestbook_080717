/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmUpdate.java
 *
 * Created on Aug 7, 2017, 2:52:42 PM
 */
package com.guestbook.app;

/**
 *
 * @author 3rd Year Account
 */
public class FrmUpdate extends javax.swing.JFrame {

    /** Creates new form FrmUpdate */
    public FrmUpdate() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateid = new javax.swing.JTextField();
        updatename = new javax.swing.JTextField();
        btnupdate3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateemail = new javax.swing.JTextField();
        updatecontact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 142, 32, 15);
        getContentPane().add(updateid);
        updateid.setBounds(23, 92, 30, 20);
        getContentPane().add(updatename);
        updatename.setBounds(23, 168, 130, 20);

        btnupdate3.setText("Update");
        btnupdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate3);
        btnupdate3.setBounds(20, 210, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("UPDATE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 11, 66, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 71, 12, 15);

        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 70, 150, 14);

        jLabel5.setText("CONTACTNO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 120, 130, 14);
        getContentPane().add(updateemail);
        updateemail.setBounds(130, 90, 110, 20);
        getContentPane().add(updatecontact);
        updatecontact.setBounds(130, 140, 90, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\NetBeans 7.0.1\\Luna_Guestbook_080717\\src\\com\\guestbook\\app\\dc.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-310, 0, 930, 300);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-599)/2, (screenSize.height-338)/2, 599, 338);
    }// </editor-fold>//GEN-END:initComponents

private void btnupdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate3ActionPerformed
        // TODO add your handling code here:
         if(SQLite.openDB()){
            int id = Integer.parseInt(this.updateid.getText());
            String name = this.updatename.getText();
            String email = this.updateemail.getText();
            String contactno = this.updatecontact.getText();
            String set = "name="+"'"+name+"'"+","+"email="+"'"+email+"'"+","+"contactno="+"'"+contactno+"'";
            if(SQLite.update("guestbook", set, id)){
                javax.swing.JOptionPane.showMessageDialog(null, "Guest has been updated!");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!");
            }
            SQLite.closeDB();
        }
}//GEN-LAST:event_btnupdate3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmUpdate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField updatecontact;
    private javax.swing.JTextField updateemail;
    private javax.swing.JTextField updateid;
    private javax.swing.JTextField updatename;
    // End of variables declaration//GEN-END:variables
}
