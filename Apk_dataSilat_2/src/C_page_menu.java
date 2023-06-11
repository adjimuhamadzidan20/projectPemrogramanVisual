import javax.swing.JOptionPane;

public class C_page_menu extends javax.swing.JFrame {

    public C_page_menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pendaftaranCabang = new javax.swing.JToggleButton();
        dataAnggota = new javax.swing.JToggleButton();
        dataCabang = new javax.swing.JToggleButton();
        daftarPelatih = new javax.swing.JToggleButton();
        daftarKeuangan = new javax.swing.JToggleButton();
        dataPelatih = new javax.swing.JToggleButton();
        pendaftaran = new javax.swing.JToggleButton();
        dataTanding = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pendaftaranCabang.setBackground(new java.awt.Color(255, 255, 255));
        pendaftaranCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/daftar.png"))); // NOI18N
        pendaftaranCabang.setText("Pendaftaran Cabang");
        pendaftaranCabang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pendaftaranCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranCabangActionPerformed(evt);
            }
        });
        getContentPane().add(pendaftaranCabang, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 170, 50));

        dataAnggota.setBackground(new java.awt.Color(255, 255, 255));
        dataAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/anggota.png"))); // NOI18N
        dataAnggota.setText("Data Anggota");
        dataAnggota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(dataAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 160, 50));

        dataCabang.setBackground(new java.awt.Color(255, 255, 255));
        dataCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/cabang.png"))); // NOI18N
        dataCabang.setText("Data Cabang");
        dataCabang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCabangActionPerformed(evt);
            }
        });
        getContentPane().add(dataCabang, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 160, 50));

        daftarPelatih.setBackground(new java.awt.Color(255, 255, 255));
        daftarPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/daftar.png"))); // NOI18N
        daftarPelatih.setText("Pendaftaran Pelatih");
        daftarPelatih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daftarPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarPelatihActionPerformed(evt);
            }
        });
        getContentPane().add(daftarPelatih, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 170, 50));

        daftarKeuangan.setBackground(new java.awt.Color(255, 255, 255));
        daftarKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/duit.png"))); // NOI18N
        daftarKeuangan.setText("Daftar Keuangan");
        daftarKeuangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daftarKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKeuanganActionPerformed(evt);
            }
        });
        getContentPane().add(daftarKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 170, 50));

        dataPelatih.setBackground(new java.awt.Color(255, 255, 255));
        dataPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/coch.png"))); // NOI18N
        dataPelatih.setText("Data Pelatih");
        dataPelatih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPelatihActionPerformed(evt);
            }
        });
        getContentPane().add(dataPelatih, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 160, 50));

        pendaftaran.setBackground(new java.awt.Color(255, 255, 255));
        pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/daftar.png"))); // NOI18N
        pendaftaran.setText("Pendaftaran Anggota");
        pendaftaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(pendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 170, 50));

        dataTanding.setBackground(new java.awt.Color(255, 255, 255));
        dataTanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/fight.png"))); // NOI18N
        dataTanding.setText("Data Tanding");
        dataTanding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataTanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTandingActionPerformed(evt);
            }
        });
        getContentPane().add(dataTanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 160, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Selamat Datang Di Aplikasi Manajemen Data Internal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/WhatsApp_Image_2022-05-26_at_2.14.39_PM-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("Perguruan Pencak Silat Satria Bangsa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/exit.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pendaftaranCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranCabangActionPerformed
        // menuju halaman form cabang
        new E_form_cabang().setVisible(true);
        dispose();
    }//GEN-LAST:event_pendaftaranCabangActionPerformed

    private void dataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnggotaActionPerformed
        // menuju halaman data anggota
        new G_data_anggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataAnggotaActionPerformed

    private void dataCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCabangActionPerformed
        // menuju halaman data cabang
        new H_data_cabang().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataCabangActionPerformed

    private void daftarPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarPelatihActionPerformed
        new F_form_pelatih().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarPelatihActionPerformed

    private void daftarKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKeuanganActionPerformed
        // menuju halaman form keuangan
        new K_data_keuangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarKeuanganActionPerformed

    private void dataPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPelatihActionPerformed
        // menuju halaman data pelatih
        new I_data_pelatih().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataPelatihActionPerformed

    private void pendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranActionPerformed
        // menuju halaman form pendaftaran
        new D_form_anggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_pendaftaranActionPerformed

    private void dataTandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTandingActionPerformed
        new J_data_tanding().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataTandingActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // konfirmasi
        int konfir = JOptionPane.showConfirmDialog(null, "Yakin ingin log out?", "Konfimasi", JOptionPane.YES_NO_OPTION);

        if(konfir == 0) {
            new B_login_page().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(C_page_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_page_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_page_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_page_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_page_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JToggleButton daftarKeuangan;
    private javax.swing.JToggleButton daftarPelatih;
    private javax.swing.JToggleButton dataAnggota;
    private javax.swing.JToggleButton dataCabang;
    private javax.swing.JToggleButton dataPelatih;
    private javax.swing.JToggleButton dataTanding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton pendaftaran;
    private javax.swing.JToggleButton pendaftaranCabang;
    // End of variables declaration//GEN-END:variables
}
