public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1381, 100));

        b2.setBackground(new java.awt.Color(245, 237, 218));
        b2.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(102, 102, 0));
        b2.setText("Add Books");
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 430, 90));

        b3.setBackground(new java.awt.Color(245, 237, 218));
        b3.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(102, 102, 0));
        b3.setText("Remove Books");
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 593, 440, 80));

        b1.setBackground(new java.awt.Color(245, 237, 218));
        b1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(102, 102, 0));
        b1.setText("Available Books");
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 430, 90));

        b6.setBackground(new java.awt.Color(245, 237, 218));
        b6.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b6.setForeground(new java.awt.Color(102, 102, 0));
        b6.setText("Remove Staff");
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 593, 430, 80));

        b5.setBackground(new java.awt.Color(245, 237, 218));
        b5.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b5.setForeground(new java.awt.Color(102, 102, 0));
        b5.setText("Add Staff");
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 453, 430, 90));

        b4.setBackground(new java.awt.Color(245, 237, 218));
        b4.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b4.setForeground(new java.awt.Color(102, 102, 0));
        b4.setText("Staff Details");
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 430, 90));

        b7.setBackground(new java.awt.Color(242, 242, 242));
        b7.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        b7.setForeground(new java.awt.Color(51, 51, 51));
        b7.setText("Edit Admin");
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 723, 430, 80));

        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dashboard.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        BooksAvailable books = new BooksAvailable();
        books.setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        RemoveStaff rems = new RemoveStaff();
        rems.setVisible(true);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       AddStaff astaff = new AddStaff();
       astaff.setVisible(true);
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        EditAdmin admin = new EditAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        AddBooks add = new AddBooks();
        add.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        StaffAvailable staff = new StaffAvailable();
        staff.setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        RemoveBooks rem = new RemoveBooks();
        rem.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
