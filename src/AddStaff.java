import java.sql.*;
import javax.swing.*;

public class AddStaff extends javax.swing.JFrame {
    public AddStaff() {
        initComponents();
        setDefaultCloseOperation(AddStaff.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Staff");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1381, 100));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 440, 90));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 440, 90));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Staff ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 440, 90));

        t1.setBackground(new java.awt.Color(248, 242, 236));
        t1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t1.setBorder(null);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 640, 90));

        t2.setBackground(new java.awt.Color(248, 242, 236));
        t2.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t2.setBorder(null);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 640, 90));

        t3.setBackground(new java.awt.Color(248, 242, 236));
        t3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t3.setBorder(null);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 640, 90));

        add.setBackground(new java.awt.Color(245, 237, 218));
        add.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorderPainted(false);
        add.setContentAreaFilled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 770, 440, 90));

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
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 770, 440, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Staff.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    String url = "jdbc:mysql://localhost:3306/library";
    String user = "root";
    String pwd = "Taphasvi@266";
    String query = "insert INTO STAFF values(?,?,?)";
        String id = t1.getText();
        String name = t2.getText();
        int contact = Integer.parseInt(t3.getText());
        try{
            Connection conn = DriverManager.getConnection(url, user, pwd);
                PreparedStatement stm = conn.prepareCall(query);
                stm.setString(1, id);
                stm.setString(2, name);
                stm.setInt(3, contact);
                stm.execute();
                JOptionPane.showMessageDialog(this, "One staff added successfully");
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
