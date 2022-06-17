import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class datakeuangan extends javax.swing.JFrame {
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
    
    public datakeuangan() {
        initComponents();
        showData();
        tampilcb_anggota();
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
            String sql = "SELECT id_uang, data_anggota.nama_anggota, bulan, keterangan FROM data_anggota, data_keuangan WHERE data_anggota.id_anggota=data_keuangan.id_anggota AND data_keuangan.id_uang= "+fcari.getText();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_anggota = new javax.swing.JComboBox<>();
        fnama = new javax.swing.JTextField();
        cb_bulan = new javax.swing.JComboBox<>();
        fket = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_uang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        fuang = new javax.swing.JTextField();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        fcari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        listcari = new javax.swing.JComboBox<>();
        btn_cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Keuangan");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DATA KEUANGAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 6, -1, -1));

        jLabel2.setText("ID Anggota");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setText("Nama Anggota");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setText("Bulan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setText("Keterangan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        cb_anggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Anggota --" }));
        cb_anggota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_anggotaItemStateChanged(evt);
            }
        });
        jPanel1.add(cb_anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));
        jPanel1.add(fnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        cb_bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Bulan--", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cb_bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bulanActionPerformed(evt);
            }
        });
        jPanel1.add(cb_bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, -1));
        jPanel1.add(fket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, -1));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 780, 227));

        jLabel6.setText("ID Keuangan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(fuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        btn_ubah.setText("Update");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        btn_hapus.setText("Delete");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));
        jPanel1.add(fcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 190, -1));

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 60, 20));

        listcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Keuangan" }));
        jPanel1.add(listcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 190, -1));

        btn_cetak.setText("Cetak");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

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
                    
                    JOptionPane.showMessageDialog(null, "Data keuangan berhasil tersimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } 
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Ubah Data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfir == 0){
                try {
                    String sql;
                    sql = "UPDATE data_keuangan SET bulan='"+bulan+"' WHERE data_keuangan.id_uang =" +uang;
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
             int konfir = JOptionPane.showConfirmDialog(null, "Hapus Data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(datakeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datakeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datakeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datakeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datakeuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_hapus;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listcari;
    private javax.swing.JTable tab_uang;
    // End of variables declaration//GEN-END:variables
}
