import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class A_loading_bar extends javax.swing.JFrame {

    /**
     * Creates new form loading_bar
     */
    public A_loading_bar() {
        initComponents();
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingbar = new javax.swing.JProgressBar();
        persen = new javax.swing.JLabel();
        persen1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pencak Silat Satria Bangsa");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 790, -1));

        persen.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setText("0%");
        jPanel1.add(persen, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        persen1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        persen1.setText("Loading..");
        jPanel1.add(persen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        jLabel2.setText("ORGANISASI PERGURUAN PENCAK SILAT SATRIA BANGSA ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        jLabel3.setText("SISTEM INFORMASI PENDATAAN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(A_loading_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_loading_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_loading_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_loading_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        A_loading_bar load = new A_loading_bar();
        load.setVisible(true);
        
        try {
            for(int i = 0; i < 100; i++) {
                Thread.sleep(40);
                load.persen.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
            }
            
            new B_login_page().setVisible(true);
            load.dispose();
        } catch(InterruptedException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel persen;
    private javax.swing.JLabel persen1;
    // End of variables declaration//GEN-END:variables
}
