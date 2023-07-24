import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class G_data_anggota extends javax.swing.JFrame {
    String id;
    String nama;
    String jenkel;
    String ttl;
    String alamat;
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
    public G_data_anggota() {
        initComponents();
        showData();
        
        // merubah format tanggal 
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
    }
    
    private void reset(){
        id_anggota.setText("");
        nama_anggota.setText("");
        jk.setSelectedItem("");
        ttl_anggota.setText("");
        alamat_anggota.setText("");
    }
    
    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Anggota");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Jenis Kelamin");
        tabel.addColumn("Tempat Tanggal Lahir");
        tabel.addColumn("Alamat");
        
        try {
            String sql = "SELECT * FROM data_anggota";
            Connection conn = (Connection)koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tabel.addRow(new Object []{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
                tab_anggota.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // mencari isi data 
    private void searchData() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Anggota");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Jenis Kelamin");
        tabel.addColumn("Tempat Tanggal Lahir");
        tabel.addColumn("Alamat");
        
        // mencari data dari DB
        try {
            String sql = "SELECT * FROM data_anggota WHERE nama_anggota LIKE '%" +fcari.getText()+ "%'";
            
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
            
            tab_anggota.setModel(tabel);       
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_anggota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_anggota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jk = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ttl_anggota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_anggota = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_anggota = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        fcari = new javax.swing.JTextField();
        btn_cetak = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Anggota");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 107, 107));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA ANGGOTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(377, 377, 377))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 940, 80));

        jPanel3.setBackground(new java.awt.Color(255, 107, 107));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Anggota");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Anggota");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Kelamin");

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Jenis Kelamin --", "Laki Laki", "Perempuan" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempat Tanggal Lahir");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");

        alamat_anggota.setColumns(20);
        alamat_anggota.setRows(5);
        jScrollPane1.setViewportView(alamat_anggota);

        jPanel4.setBackground(new java.awt.Color(255, 107, 107));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_anggota)
                            .addComponent(id_anggota)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ttl_anggota, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ttl_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 438));

        tab_anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Anggota", "Nama Anggota", "Jenis Kelamin", "Tempat Tanggal Lahir", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_anggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_anggota);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 168, 550, 370));

        jPanel5.setBackground(new java.awt.Color(255, 107, 107));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(fcari, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fcari, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btn_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 550, 60));

        btn_kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.setBorder(null);
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 610));

        setSize(new java.awt.Dimension(993, 644));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // btn reset
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed
    
   
    // btn update data
    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        id = id_anggota.getText();
        nama = nama_anggota.getText();
        jenkel =(String) jk.getSelectedItem();
        ttl = ttl_anggota.getText();
        alamat = alamat_anggota.getText();
        
        if(id.equals("") || nama.equals("") || jenkel.equals("") || ttl.equals("") || alamat.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!" , "Informasi",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            //confir
            int konfir = JOptionPane.showConfirmDialog(null, "Update data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (konfir == 0 ){
                try {
                    String sql = "UPDATE data_anggota SET nama_anggota = '"+nama+"', jen_kel = '"+jenkel+"', ttl = '"+ttl+"', alamat = '"+alamat+"' WHERE id_anggota = '"+id+"'";
                    Connection conn = (Connection)koneksi.konek();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data anggota berhasil terupdate","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_ubahActionPerformed
    
    // btn hapus data
    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        id = id_anggota.getText();
        nama = nama_anggota.getText();
        jenkel =(String) jk.getSelectedItem();
        ttl = ttl_anggota.getText();
        alamat = alamat_anggota.getText();
        
        if(id.equals("") || nama.equals("") || jenkel.equals("") || ttl.equals("") || alamat.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!" , "Informasi",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            //confir
            int konfir = JOptionPane.showConfirmDialog(null, "Hapus data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (konfir == 0 ){
                try {
                    String sql = "DELETE FROM data_anggota WHERE id_anggota = '"+id+"'";
                    Connection conn = (Connection)koneksi.konek();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data anggota berhasil terhapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed
    
    // btn cetak 
    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("data_anggota.jasper"),
            null, koneksi.konek());
            
            JasperViewer.viewReport(JP);
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }//GEN-LAST:event_btn_cetakActionPerformed
    
    // btn cari data
    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        searchData();
    }//GEN-LAST:event_btn_cariActionPerformed

    // memilih data dalam tabel
    private void tab_anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_anggotaMouseClicked
        int no = tab_anggota.rowAtPoint(evt.getPoint());
        
        String id = tab_anggota.getValueAt(no, 0).toString();
        id_anggota.setText(id);
        
        String nama = tab_anggota.getValueAt(no, 1).toString();
        nama_anggota.setText(nama);
        
        String jenkel = tab_anggota.getValueAt(no, 2).toString();
        jk.setSelectedItem(jenkel);
        
        String cabang = tab_anggota.getValueAt(no, 3).toString();
        ttl_anggota.setText(cabang);
        
        String sabuk = tab_anggota.getValueAt(no, 4).toString();
        alamat_anggota.setText(sabuk);
    }//GEN-LAST:event_tab_anggotaMouseClicked

    // btn kembali
    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        new C_page_menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(G_data_anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_data_anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_data_anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_data_anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_data_anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat_anggota;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_ubah;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField fcari;
    private javax.swing.JTextField id_anggota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JTextField nama_anggota;
    private javax.swing.JTable tab_anggota;
    private javax.swing.JTextField ttl_anggota;
    // End of variables declaration//GEN-END:variables
}
