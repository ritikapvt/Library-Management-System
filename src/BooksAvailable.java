import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class BooksAvailable extends javax.swing.JFrame {
    public BooksAvailable() {
        initComponents();
        setDefaultCloseOperation(BooksAvailable.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        fetch = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(229, 214, 190));
        jTable2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Category", "Name", "Author", "Copies"
            }
        ));
        jTable2.setOpaque(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 600));

        fetch.setBackground(new java.awt.Color(245, 237, 218));
        fetch.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        fetch.setForeground(new java.awt.Color(255, 255, 255));
        fetch.setText("Fetch");
        fetch.setBorderPainted(false);
        fetch.setContentAreaFilled(false);
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });
        getContentPane().add(fetch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 750, 440, 80));

        back.setBackground(new java.awt.Color(245, 237, 218));
        back.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 750, 440, 80));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BooksAvailable.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String pwd = "Taphasvi@266";
        String query = "SELECT *FROM BOOKS;";
        try {
            Connection conn = DriverManager.getConnection(url,user,pwd);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String bookid =rs.getString("BOOK_ID");
                String category = rs.getString("CATEGORY");
                String title = rs.getString("TITLE");
                String author = rs.getString("AUTHOR");
                String copies = rs.getString("COPIES");
                model.addRow(new Object[] {bookid, category, title, author, copies});
            }
            rs.close();
            stm.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }//GEN-LAST:event_fetchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(BooksAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksAvailable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksAvailable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton fetch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
