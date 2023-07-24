import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class B_login_page extends javax.swing.JFrame {
    
    // var inputan
    String username;
    String password;

    public B_login_page() {
        initComponents();
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputUser = new javax.swing.JTextField();
        labelUser = new javax.swing.JLabel();
        inputPass = new javax.swing.JPasswordField();
        labelPass = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        introText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titleLogin1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Login Admin");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(225, 149, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 200, 30));

        labelUser.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        labelUser.setText("Username");
        jPanel1.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));
        jPanel1.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 200, 30));

        labelPass.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        labelPass.setText("Password");
        jPanel1.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        btnSignIn.setBackground(new java.awt.Color(255, 255, 255));
        btnSignIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 200, 40));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 200, 40));

        introText.setBackground(new java.awt.Color(255, 255, 255));
        introText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        introText.setText("SELAMAT DATANG");
        jPanel1.add(introText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/WhatsApp_Image_2022-05-26_at_2.14.39_PM-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, 240));

        titleLogin1.setBackground(new java.awt.Color(255, 255, 255));
        titleLogin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLogin1.setText("LOG IN");
        jPanel1.add(titleLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(877, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // button sign in / login
    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        username = inputUser.getText();
        password = inputPass.getText();
        
        // username = admin123
        // password = 123
        
        // mengecek apakah user & pass sesuai apa tidak
        if(username.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username dan password tidak boleh kosong", "Informasi", JOptionPane.WARNING_MESSAGE);  
        }
        
        else if(username.equals("admin123") && password.equals("123")) {
            JOptionPane.showMessageDialog(null, "login berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            
            // masuk / pindah halaman menuju bagian menu
            new C_page_menu().setVisible(true);
            dispose();
        }
        
        // jika username & password tidak sesuai
        else{
            JOptionPane.showMessageDialog(null, "Username dan password tidak valid", "Informasi", JOptionPane.ERROR_MESSAGE);
        }               
    }//GEN-LAST:event_btnSignInActionPerformed

    // button reset
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // mengosongkan inputan
        inputUser.setText("");
        inputPass.setText("");      
        
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(B_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B_login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel introText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel titleLogin1;
    // End of variables declaration//GEN-END:variables
}
