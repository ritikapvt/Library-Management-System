import java.sql.*;
import javax.swing.*;

public class AddBooks extends javax.swing.JFrame {
    public AddBooks() {
        initComponents();
        setDefaultCloseOperation(AddBooks.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Books");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1381, 100));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Copies:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 440, 70));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Book ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 440, 70));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Title:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 440, 70));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Author:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 440, 70));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Category:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 440, 70));

        t5.setBackground(new java.awt.Color(248, 242, 236));
        t5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t5.setBorder(null);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 640, 70));

        t4.setBackground(new java.awt.Color(248, 242, 236));
        t4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t4.setBorder(null);
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 570, 640, 70));

        t3.setBackground(new java.awt.Color(248, 242, 236));
        t3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t3.setBorder(null);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 640, 70));

        t2.setBackground(new java.awt.Color(248, 242, 236));
        t2.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t2.setBorder(null);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 640, 70));

        t1.setBackground(new java.awt.Color(248, 242, 236));
        t1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        t1.setBorder(null);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 640, 70));

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

        jLabel1.setBackground(new java.awt.Color(248, 242, 236));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Books.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    String url = "jdbc:mysql://localhost:3306/library";
    String user = "root";
    String pwd = "Taphasvi@266";
    String insertQuery = "INSERT INTO BOOKS VALUES(?,?,?,?,?)";
    String updateQuery = "UPDATE BOOKS SET COPIES=COPIES+? WHERE TITLE=? AND CATEGORY=? AND AUTHOR=?";
    String id = t1.getText();
    String category = t2.getText();
    String title = t3.getText();
    String author = t4.getText();
    int copies = Integer.parseInt(t5.getText());
    try {
        Connection conn = DriverManager.getConnection(url, user, pwd);
        PreparedStatement checkStm = conn.prepareStatement(updateQuery);
        checkStm.setInt(1, copies);
        checkStm.setString(2, title);
        checkStm.setString(3, category);
        checkStm.setString(4, author);
        int rows = checkStm.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "One record updated successfully");
        } else {
            PreparedStatement insertStm = conn.prepareStatement(insertQuery);
            insertStm.setString(1, id);
            insertStm.setString(2, category);
            insertStm.setString(3, title);
            insertStm.setString(4, author);
            insertStm.setInt(5, copies);
            insertStm.execute();
            JOptionPane.showMessageDialog(this, "One record added successfully");
        }
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
