package apk_datasilat;
import javax.swing.JOptionPane;

public class c_menu extends javax.swing.JFrame {

    public c_menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pendaftaran = new javax.swing.JToggleButton();
        dataAnggota = new javax.swing.JToggleButton();
        pendaftaranCabang = new javax.swing.JToggleButton();
        dataCabang = new javax.swing.JToggleButton();
        daftarPelatih = new javax.swing.JToggleButton();
        dataPelatih = new javax.swing.JToggleButton();
        daftarKeuangan = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Menu Utama");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM INFORMASI PENDATAAN ORGANISASI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/WhatsApp_Image_2022-05-26_at_2.14.39_PM-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 240, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERGURUAN PENCAK SILAT SATRIA BANGSA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/exit.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, 40));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        pendaftaran.setBackground(new java.awt.Color(255, 255, 255));
        pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/daftar.png"))); // NOI18N
        pendaftaran.setText("Pendaftaran Anggota");
        pendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranActionPerformed(evt);
            }
        });

        dataAnggota.setBackground(new java.awt.Color(255, 255, 255));
        dataAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/anggota.png"))); // NOI18N
        dataAnggota.setText("Data Anggota");
        dataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnggotaActionPerformed(evt);
            }
        });

        pendaftaranCabang.setBackground(new java.awt.Color(255, 255, 255));
        pendaftaranCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/daftar.png"))); // NOI18N
        pendaftaranCabang.setText("Pendaftaran Cabang");
        pendaftaranCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranCabangActionPerformed(evt);
            }
        });

        dataCabang.setBackground(new java.awt.Color(255, 255, 255));
        dataCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/cabang.png"))); // NOI18N
        dataCabang.setText("Data Cabang");
        dataCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCabangActionPerformed(evt);
            }
        });

        daftarPelatih.setBackground(new java.awt.Color(255, 255, 255));
        daftarPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/daftar.png"))); // NOI18N
        daftarPelatih.setText("Pendaftaran Pelatih");
        daftarPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarPelatihActionPerformed(evt);
            }
        });

        dataPelatih.setBackground(new java.awt.Color(255, 255, 255));
        dataPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/coch.png"))); // NOI18N
        dataPelatih.setText("Data Pelatih");
        dataPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPelatihActionPerformed(evt);
            }
        });

        daftarKeuangan.setBackground(new java.awt.Color(255, 255, 255));
        daftarKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/duit.png"))); // NOI18N
        daftarKeuangan.setText("Daftar Keuangan");
        daftarKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKeuanganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendaftaranCabang, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(dataCabang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataPelatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftarKeuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftarPelatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendaftaranCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daftarPelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daftarKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 480));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // button pendaftaran cabang
    private void pendaftaranCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranCabangActionPerformed
        // menuju halaman form cabang
        new e_form_Cabang().setVisible(true);
        dispose();        
    }//GEN-LAST:event_pendaftaranCabangActionPerformed

    // button data anggota
    private void dataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnggotaActionPerformed
        // menuju halaman data anggota
        new h_data_Anggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataAnggotaActionPerformed

    // button log out
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       
        // konfirmasi
        int konfir = JOptionPane.showConfirmDialog(null, "Yakin ingin log out?", "Konfimasi", JOptionPane.YES_NO_OPTION);
        
        if(konfir == 0) {
            new b_loginPage().setVisible(true);
            dispose();
        }     
         
    }//GEN-LAST:event_btnLogoutActionPerformed

    // button pendaftaran
    private void pendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranActionPerformed
        // menuju halaman form pendaftaran
        new d_formPendaftaran().setVisible(true);
        dispose();

    }//GEN-LAST:event_pendaftaranActionPerformed

    // button data pelatih
    private void dataPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPelatihActionPerformed
        // menuju halaman data pelatih
        new j_data_Pelatih().setVisible(true);
        dispose();

    }//GEN-LAST:event_dataPelatihActionPerformed

    // button daftar keuangan
    private void daftarKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKeuanganActionPerformed
        // menuju halaman form keuangan
        new g_form_DaftarKeuangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarKeuanganActionPerformed

    // button daftar pelatih
    private void daftarPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarPelatihActionPerformed
        new f_form_Pelatih().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarPelatihActionPerformed

    // button data cabang
    private void dataCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCabangActionPerformed
        // menuju halaman data cabang
        new i_data_Cabang().setVisible(true);
        dispose();

    }//GEN-LAST:event_dataCabangActionPerformed

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
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new c_menu().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton pendaftaran;
    private javax.swing.JToggleButton pendaftaranCabang;
    // End of variables declaration//GEN-END:variables
}
