import java.sql.*;
import javax.swing.*; 

public class EditAdmin extends javax.swing.JFrame {
    public EditAdmin() {
        initComponents();
        setDefaultCloseOperation(EditAdmin.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Updated Value:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1381, 90));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edit:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1381, 90));

        jComboBox1.setBackground(new java.awt.Color(248, 242, 236));
        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USER_ID", "NAME", "PASSWORD", "CONTACT" }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 243, 980, 100));

        t1.setBackground(new java.awt.Color(248, 242, 236));
        t1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(null);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 970, 100));

        update.setBackground(new java.awt.Color(245, 237, 218));
        update.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 440, 80));

        cancel.setBackground(new java.awt.Color(245, 237, 218));
        cancel.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 440, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Edit Admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String pwd = "Taphasvi@266";
        String id = t1.getText();
        String column = jComboBox1.getSelectedItem().toString();
        String query = "update admin set "+column+" = '"+id+"';";
        try{
            Connection conn = DriverManager.getConnection(url, user,pwd);
            Statement stmt = conn.createStatement();
            int rows=stmt.executeUpdate(query);
            if(rows>0){
               JOptionPane.showMessageDialog(this, "Credentials Updated Successfully");
            }
            t1.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
