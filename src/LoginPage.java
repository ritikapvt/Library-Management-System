import java.sql.*;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    public LoginPage() {
        initComponents();
        login.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 860, 60));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 260, 40));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 260, 40));

        user.setBackground(new java.awt.Color(190, 170, 131));
        user.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 39));

        password.setBackground(new java.awt.Color(190, 170, 131));
        password.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 230, 40));

        login.setBackground(new java.awt.Color(245, 237, 218));
        login.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        login.setForeground(new java.awt.Color(102, 51, 0));
        login.setText("Login");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 870, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login Page.jpg"))); // NOI18N
        jLabel1.setText("     ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String url = "jdbc:mysql://localhost:3306/library";
        String mysqluser = "root";
        String mysqlpwd = "Taphasvi@266";
        String pswrd = new String (password.getPassword());
        String username = user.getText();
        String query = ("select PASSWORD from ADMIN where USER_ID ='"+username+"';");
        try {
            Connection conn = DriverManager.getConnection(url, mysqluser, mysqlpwd);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()) {
                String realpswrd = rs.getString("PASSWORD");
                if(realpswrd.equals(pswrd)) {
                    Dashboard dsh = new Dashboard();
                    dsh.setVisible(true);
                    this.dispose();
                }
                else {
                   JOptionPane.showMessageDialog(this, "Username Or Password Entered Is Wrong!");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Wrong Username!");
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
    }
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}