import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pendaftaranCabang = new javax.swing.JToggleButton();
        dataAnggota = new javax.swing.JToggleButton();
        dataCabang = new javax.swing.JToggleButton();
        daftarPelatih = new javax.swing.JToggleButton();
        daftarKeuangan = new javax.swing.JToggleButton();
        dataPelatih = new javax.swing.JToggleButton();
        pendaftaran = new javax.swing.JToggleButton();
        dataTanding = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pendaftaranCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daftar.png"))); // NOI18N
        pendaftaranCabang.setText("Pendaftaran Cabang");
        pendaftaranCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranCabangActionPerformed(evt);
            }
        });

        dataAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anggota.png"))); // NOI18N
        dataAnggota.setText("Data Anggota");
        dataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnggotaActionPerformed(evt);
            }
        });

        dataCabang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabang.png"))); // NOI18N
        dataCabang.setText("Data Cabang");
        dataCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCabangActionPerformed(evt);
            }
        });

        daftarPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daftar.png"))); // NOI18N
        daftarPelatih.setText("Pendaftaran Pelatih");
        daftarPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarPelatihActionPerformed(evt);
            }
        });

        daftarKeuangan.setBackground(new java.awt.Color(255, 255, 255));
        daftarKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duit.png"))); // NOI18N
        daftarKeuangan.setText("Daftar Keuangan");
        daftarKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKeuanganActionPerformed(evt);
            }
        });

        dataPelatih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coch.png"))); // NOI18N
        dataPelatih.setText("Data Pelatih");
        dataPelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPelatihActionPerformed(evt);
            }
        });

        pendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daftar.png"))); // NOI18N
        pendaftaran.setText("Pendaftaran");
        pendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftaranActionPerformed(evt);
            }
        });

        dataTanding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fight.png"))); // NOI18N
        dataTanding.setText("Data Tanding");
        dataTanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTandingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pendaftaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataAnggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendaftaranCabang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataCabang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daftarPelatih)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPelatih, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daftarKeuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTanding)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(pendaftaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataCabang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(daftarPelatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataPelatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(daftarKeuangan)
                        .addComponent(dataTanding, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pendaftaranCabang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(dataAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1210, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang Di Aplikasi Manajemen Data Internal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp_Image_2022-05-26_at_2.14.39_PM-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Perguruan Pencak Silat Satria Bangsa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 480, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\CodingJava\\relasidb\\src\\bg.jpeg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // button pendaftaran
    private void pendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranActionPerformed
        // menuju halaman form pendaftaran
        new formAnggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_pendaftaranActionPerformed

    // button pendaftaran cabang
    private void pendaftaranCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftaranCabangActionPerformed
        // menuju halaman form cabang
        new formCabang().setVisible(true);
        dispose();
    }//GEN-LAST:event_pendaftaranCabangActionPerformed

    // button data anggota
    private void dataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnggotaActionPerformed
        // menuju halaman data anggota
        new dataanggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_dataAnggotaActionPerformed

    // button data cabang
    private void dataCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCabangActionPerformed
        // menuju halaman data cabang
        new datacabang().setVisible(true);
        dispose();         
    }//GEN-LAST:event_dataCabangActionPerformed

    // button daftar keuangan
    private void daftarKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKeuanganActionPerformed
        // menuju halaman form keuangan
        new datakeuangan().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarKeuanganActionPerformed

    // button data pelatih
    private void dataPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPelatihActionPerformed
        // menuju halaman data pelatih
        new datapelatih().setVisible(true);
        dispose();     
    }//GEN-LAST:event_dataPelatihActionPerformed

    // button log out
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       
        // konfirmasi
        int konfir = JOptionPane.showConfirmDialog(null, "Yakin ingin log out?", "Konfimasi", JOptionPane.YES_NO_OPTION);
        
        if(konfir == 0) {
            new login().setVisible(true);
            dispose();
        }     
         
    }//GEN-LAST:event_btnLogoutActionPerformed

    // button daftar pelatih
    private void daftarPelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarPelatihActionPerformed
        new formPelatih().setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarPelatihActionPerformed

    private void dataTandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTandingActionPerformed
       new datatanding().setVisible(true);
       dispose();
    }//GEN-LAST:event_dataTandingActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton pendaftaran;
    private javax.swing.JToggleButton pendaftaranCabang;
    // End of variables declaration//GEN-END:variables
}
