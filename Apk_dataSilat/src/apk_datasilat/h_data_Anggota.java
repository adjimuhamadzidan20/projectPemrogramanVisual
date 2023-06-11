package apk_datasilat;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

// by adji muhamad zidan
public class h_data_Anggota extends javax.swing.JFrame {
    // var kolom input
    String id;
    String nama;
    String gender;
    String cabang;
    String sabuk;
    private Object res;
    
    // reset isi kolom input
    private void reset() {
        inputID.setText("");
        inputNama.setText("");
        inputJenKel.setSelectedItem("");
        inputCabang.setText("");
        inputSabuk.setText("");
    }
    
    // menampilkan isi data
    private void showData() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama");
        tabel.addColumn("JK");
        tabel.addColumn("Cabang");
        tabel.addColumn("Sabuk");
        
        // memanggil semua data dari DB
        try {
            String sql = "SELECT * FROM tb_pendaftaran";
            java.sql.Connection conn = (Connection)koneksi.konek();
            java.sql.Statement stat = conn.createStatement();
            java.sql.ResultSet res = stat.executeQuery(sql);
            
            while(res.next()) {
                tabel.addRow(new Object[] {
                    res.getString(1), 
                    res.getString(2), 
                    res.getString(3),
                    res.getString(4), 
                    res.getString(5)
                });
            }
            
            tabelAnggota.setModel(tabel);       
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // mencari isi data 
    private void searchData() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama");
        tabel.addColumn("JK");
        tabel.addColumn("Cabang");
        tabel.addColumn("Sabuk");
        
        // mencari data dari DB
        try {
            String sql = "SELECT * FROM tb_pendaftaran WHERE " +listCari.getSelectedItem().toString()
            + " LIKE '%" +inputCari.getText()+ "%'";
            
            java.sql.Connection conn = (Connection)koneksi.konek();
            java.sql.Statement stat = conn.createStatement();
            java.sql.ResultSet res = stat.executeQuery(sql);
            
            while(res.next()) {
                tabel.addRow(new Object[] {
                    res.getString(1), 
                    res.getString(2), 
                    res.getString(3),
                    res.getString(4), 
                    res.getString(5)
                });
            }
            
            tabelAnggota.setModel(tabel);       
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }   
    
    public h_data_Anggota (){
        initComponents();
        showData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabAnggota = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        inputJenKel = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        inputCabang = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        inputSabuk = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelAnggota = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        listCari = new javax.swing.JComboBox<>();
        inputCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnCetakdata = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        tabAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "cabang", "Jenis Kelamin", "sabuk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabAnggota);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Anggota");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA ANGGOTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 204, 255));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/apus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(255, 255, 255));
        btnKembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/kembalii.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ID");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nama");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Jenis Kelamin");

        inputJenKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cabang");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sabuk");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputID)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputNama)
                    .addComponent(inputJenKel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputCabang)
                    .addComponent(inputSabuk)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputJenKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(inputSabuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 480));

        tabelAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Jenis Kelamin", "Cabang", "Sabuk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAnggotaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelAnggota);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 590, 400));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cari");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        listCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "JK", "Cabang", "Sabuk" }));
        getContentPane().add(listCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 130, -1));
        getContentPane().add(inputCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 130, -1));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/find.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 100, 40));

        btnCetakdata.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakdata.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print.png"))); // NOI18N
        btnCetakdata.setText("Cetak Data");
        btnCetakdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakdataActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetakdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        setSize(new java.awt.Dimension(899, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // button update
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        id = inputID.getText();
        nama = inputNama.getText();
        gender = (String) inputJenKel.getSelectedItem();
        cabang = inputCabang.getText();
        sabuk = inputSabuk.getText();
        
        // mengecek jika kolom input masih kosong
        if(id.equals("") || nama.equals("") || gender.equals("") || cabang.equals("") || sabuk.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu", "Informasi", JOptionPane.WARNING_MESSAGE);
        }
        
        else {
            // konfirmasi
            int konfir = JOptionPane.showConfirmDialog(null, "Update Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if(konfir == 0) {
                // mengedit / mengubah data
                try {
                    String sql = "UPDATE tb_pendaftaran SET Nama = '"+nama+"', JK = '"+gender+"', Cabang = '"+cabang+"', Sabuk = '"+sabuk+"' WHERE ID = '"+id+"'";
                    java.sql.Connection conn = (Connection)koneksi.konek();
                    java.sql.PreparedStatement stat = conn.prepareStatement(sql);
                    stat.execute();

                    JOptionPane.showMessageDialog(null, "Update berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                }

                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }          
    }//GEN-LAST:event_btnUpdateActionPerformed

    // button cari / search
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        searchData();
    }//GEN-LAST:event_btnCariActionPerformed

    // button hapus
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        id = inputID.getText();
        
        // mengecek jika kolom input masih kosong
        if(id.equals("") || nama.equals("") || gender.equals("") || cabang.equals("") || sabuk.equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu", "Informasi", JOptionPane.WARNING_MESSAGE);
        }
        
        else {
            // konfirmasi
            int konfir = JOptionPane.showConfirmDialog(null, "Hapus Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
            if(konfir == 0) {
                // menghapus data
                try {
                    String sql = "DELETE FROM tb_pendaftaran WHERE ID = '"+id+"'";
                    java.sql.Connection conn = (Connection)koneksi.konek();
                    java.sql.PreparedStatement stat = conn.prepareStatement(sql);
                    stat.execute();

                    JOptionPane.showMessageDialog(null, "Data berhasil terhapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                }

                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
               
    }//GEN-LAST:event_btnHapusActionPerformed

    // button kembali
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        
        // menuju ke halaman menu
        new c_menu().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnKembaliActionPerformed

    // tabel data anggota dan di klik dengan cursor
    private void tabelAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAnggotaMouseClicked
        int no = tabelAnggota.rowAtPoint(evt.getPoint());
        
        String id = tabelAnggota.getValueAt(no, 0).toString();
        inputID.setText(id);
        
        String nama = tabelAnggota.getValueAt(no, 1).toString();
        inputNama.setText(nama);
        
        String jenkel = tabelAnggota.getValueAt(no, 2).toString();
        inputJenKel.setSelectedItem(jenkel);
        
        String cabang = tabelAnggota.getValueAt(no, 3).toString();
        inputCabang.setText(cabang);
        
        String sabuk = tabelAnggota.getValueAt(no, 4).toString();
        inputSabuk.setText(sabuk);
              
    }//GEN-LAST:event_tabelAnggotaMouseClicked
    
    // cetak data / report
    private void btnCetakdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakdataActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("report_anggota.jasper"),
            null, koneksi.konek());

            JasperViewer.viewReport(JP);
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "cetak data gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }  
        
    }//GEN-LAST:event_btnCetakdataActionPerformed

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
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new h_data_Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetakdata;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputCabang;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputID;
    private javax.swing.JComboBox<String> inputJenKel;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputSabuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> listCari;
    private javax.swing.JTable tabAnggota;
    private javax.swing.JTable tabelAnggota;
    // End of variables declaration//GEN-END:variables

}
