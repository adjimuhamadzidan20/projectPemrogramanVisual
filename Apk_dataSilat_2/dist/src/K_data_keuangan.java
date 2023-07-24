import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class K_data_keuangan extends javax.swing.JFrame {
    String namaAnggota;
    String ket;
    String uang;
    String idanggota;
    String bulan;
    String nama;
    String kete;
    
    public Statement st;
    public ResultSet rs;
    Connection conn = koneksi.konek();
    
    public K_data_keuangan() {
        initComponents();
        showData();
        tampilcb_anggota();
        
        // merubah format tanggal 
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
    }
    
    private void reset(){
        fuang.setText("");
        cb_anggota.setSelectedItem("");
        fnama.setText("");
        cb_bulan.setSelectedItem("");
        fket.setText("");  
    }
    
    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Keuangan");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Bulan");
        tabel.addColumn("Keterangan");
        
        try {
            
            String sql = "SELECT "
                        + "id_uang, "
                        + "data_anggota.nama_anggota, "
                        + "bulan, "
                        + "keterangan "
                        + "FROM data_anggota, data_keuangan "
                        + "WHERE "
                        + "data_anggota.id_anggota = data_keuangan.id_anggota ";
            
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        tabel.addRow(new Object[] {
                           rs.getString(1),
                           rs.getString(2),
                           rs.getString(3),
                           rs.getString(4)
                        });
                        tab_uang.setModel(tabel);
                    }
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    private void cari(){      
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Keuangan");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Bulan");
        tabel.addColumn("Keterangan");
        
        try {
            String sql = "SELECT id_uang, data_anggota.nama_anggota, bulan, keterangan FROM data_keuangan INNER JOIN data_anggota "
                    + "ON data_keuangan.id_anggota = data_anggota.id_anggota WHERE nama_anggota LIKE '%" +fcari.getText()+ "%'";
            Connection conn = (Connection)koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tabel.addRow(new Object [] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                });
                tab_uang.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fuang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_anggota = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_bulan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        fket = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fcari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_uang = new javax.swing.JTable();
        btn_kembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Keuangan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 107, 107));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA KEUANGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 19, 810, 80));

        jPanel3.setBackground(new java.awt.Color(255, 107, 107));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Keuangan");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Anggota");

        cb_anggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Anggota --" }));
        cb_anggota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_anggotaItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Anggota");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bulan");

        cb_bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Bulan--", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cb_bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bulanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Keterangan");

        jPanel5.setBackground(new java.awt.Color(255, 107, 107));

        btn_simpan.setBackground(new java.awt.Color(255, 255, 255));
        btn_simpan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/simpan.png"))); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setBorder(null);
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(255, 255, 255));
        btn_reset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.setBorder(null);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_ubah.setBackground(new java.awt.Color(255, 255, 255));
        btn_ubah.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/update.png"))); // NOI18N
        btn_ubah.setText("Update");
        btn_ubah.setBorder(null);
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 255, 255));
        btn_hapus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/apus.png"))); // NOI18N
        btn_hapus.setText("Delete");
        btn_hapus.setBorder(null);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(fuang))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fket)
                            .addComponent(cb_bulan, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                            .addComponent(fnama, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(cb_anggota, 0, 209, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 340, 390));

        jPanel4.setBackground(new java.awt.Color(255, 107, 107));

        btn_cari.setBackground(new java.awt.Color(255, 255, 255));
        btn_cari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/find.png"))); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.setBorder(null);
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_cetak.setBackground(new java.awt.Color(255, 255, 255));
        btn_cetak.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_cetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/print.png"))); // NOI18N
        btn_cetak.setText("Cetak");
        btn_cetak.setBorder(null);
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cari Nama Anggota");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fcari)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 460, -1));

        tab_uang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Keuangan", "Nama Anggota", "Bulan", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_uang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_uangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_uang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 460, 310));

        btn_kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.setBorder(null);
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        uang = fuang.getText();
        idanggota = (String)cb_anggota.getSelectedItem();
        namaAnggota = fnama.getText();
        bulan = (String)cb_bulan.getSelectedItem();
        ket = fket.getText();
        
        if(uang.equals("") || idanggota.equals("") || bulan.equals("") || ket.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan Data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfir == 0){
                try {
                    String sql = "INSERT INTO data_keuangan VALUES ('"+uang+"','"+idanggota+"','"+bulan+"','"+ket+"')";
                    Connection conn = (Connection)koneksi.konek();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil tersimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
            }
        } 
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void cb_bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bulanActionPerformed
        // TODO add your handling code here:
        if(cb_bulan.getSelectedIndex() == 0){
            nama = "Januari";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 1){
            nama = "Februari";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 2){
            nama = "Maret";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 3){
            nama = "April";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 4){
            nama = "Mei";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 5){
            nama = "Juni";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 6){
            nama = "Juli";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 7){
            nama = "Agustus";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 8){
            nama = "September";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 9){
            nama = "Oktober";
            ket = "Sudah Bayar";
        }
        else if(cb_bulan.getSelectedIndex() == 10){
            nama = "November";
            ket = "Sudah Bayar";
        }
        else if (cb_bulan.getSelectedIndex() == 11){
            nama = "Desember";
            ket = "Sudah Bayar";
        }
        fket.setText(ket);
        
    }//GEN-LAST:event_cb_bulanActionPerformed

    private void cb_anggotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_anggotaItemStateChanged
        // TODO add your handling code here:
        try {
            if(cb_anggota.getSelectedIndex() == 0){
                fnama.setText("");
                
            }else{
                Statement st = conn.createStatement();
                String sql ="SELECT nama_anggota FROM data_anggota WHERE id_anggota='"+cb_anggota.getSelectedItem()+"'";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    fnama.setText(rs.getString("nama_anggota"));
                }
            }
        } 
        catch (Exception e) {
        }
    }//GEN-LAST:event_cb_anggotaItemStateChanged

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        uang = fuang.getText();
        idanggota = (String)cb_anggota.getSelectedItem();
        namaAnggota = fnama.getText();
        bulan = (String)cb_bulan.getSelectedItem();
        ket = fket.getText();
        
        if(uang.equals("") || idanggota.equals("") || bulan.equals("") || ket.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } 
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan Data? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfir == 0){
                try {
                    String sql;
                    sql = "UPDATE data_keuangan SET id_anggota = '"+ idanggota +"', bulan = '"+ bulan +"' WHERE data_keuangan.id_uang = " +uang;
                    Connection conn = (Connection)koneksi.konek();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");
                    showData();
                    reset();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void tab_uangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_uangMouseClicked
        // TODO add your handling code here:
        int no = tab_uang.rowAtPoint(evt.getPoint());
        
        String uang = tab_uang.getValueAt(no, 0).toString();
        fuang.setText(uang);
        String namaAnggota = tab_uang.getValueAt(no, 1).toString();
        fnama.setText(namaAnggota);
        String bulan = tab_uang.getValueAt(no, 2).toString();
        cb_bulan.setSelectedItem(bulan);
        String ket = tab_uang.getValueAt(no, 3).toString();
        fket.setText(ket);
        
        
    }//GEN-LAST:event_tab_uangMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        uang = fuang.getText();
        
         if(uang.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang ingin di hapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } 
         else{
             int konfir = JOptionPane.showConfirmDialog(null, "Simpan Data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfir == 0){
                try {
                    String sql = "DELETE FROM data_keuangan WHERE id_uang="+uang;
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil di hapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
         }
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("data_keuangan.jasper"),
                null, koneksi.konek());

            JasperViewer.viewReport(JP);
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        new C_page_menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed
    
    public void tampilcb_anggota(){
            try {
                Statement st = conn.createStatement();
                String sql = "SELECT id_anggota FROM data_anggota order by id_anggota ASC";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    cb_anggota.addItem(rs.getString("id_anggota"));

                }
                rs.last();
                int jumlahdata = rs.getRow();
                rs.first();

            } catch (Exception e) {
            }
        }
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
            java.util.logging.Logger.getLogger(K_data_keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(K_data_keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(K_data_keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(K_data_keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new K_data_keuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> cb_anggota;
    private javax.swing.JComboBox<String> cb_bulan;
    private javax.swing.JTextField fcari;
    private javax.swing.JTextField fket;
    private javax.swing.JTextField fnama;
    private javax.swing.JTextField fuang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab_uang;
    // End of variables declaration//GEN-END:variables
}
