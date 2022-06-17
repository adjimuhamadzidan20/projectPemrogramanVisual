import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class datatanding extends javax.swing.JFrame {
    String idanggota;
    String idcabang;
    String idpelatih;
    String idtanding;
    String jadwal;
    String nama;
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
    public datatanding() {
        initComponents();
        showData();
        tampilcb_anggota();
        tampilcb_cabang();
        tampilcb_pelatih();
    }
    
    private void reset(){
        id_tanding.setText("");
        fnamaanggota.setText("");
        cb_anggota.setSelectedItem("");
        cb_cabang.setSelectedItem("");
        cb_pelatih.setSelectedItem("");
        fnamacabang.setText("");
        fnamapelatih.setText("");
        jadwal_tanding.setText("");
        nama_tanding.setText("");
    }
    
    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Tanding");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Nama Cabang");
        tabel.addColumn("Nama Pelatih");
        tabel.addColumn("Jadwal Tanding");
        tabel.addColumn("Nama Tanding");
        
        try {
            String sql = "SELECT "
                         +"id_tanding, "
                         +"data_anggota.nama_anggota, "
                         +"data_cabang.nama_cabang, " 
                         +"data_pelatih.nama_pelatih, " 
                         +"jadwal_tanding,  " 
                         +"nama_tanding "
                         +"FROM data_anggota, data_cabang,data_pelatih,data_tanding " 
                         +"WHERE "
                         +"data_anggota.id_anggota = data_tanding.id_anggota "
                         +"AND " 
                         +"data_cabang.id_cabang = data_tanding.id_cabang "
                         +"AND " 
                         +"data_pelatih.id_pelatih = data_tanding.id_pelatih";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tabel.addRow(new Object[] {
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6)
                });
                tab_tanding.setModel(tabel);
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
        jLabel6 = new javax.swing.JLabel();
        id_tanding = new javax.swing.JTextField();
        fnamaanggota = new javax.swing.JTextField();
        fnamacabang = new javax.swing.JTextField();
        fnamapelatih = new javax.swing.JTextField();
        jadwal_tanding = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_tanding = new javax.swing.JTable();
        cb_pelatih = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_cabang = new javax.swing.JComboBox<>();
        cb_anggota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nama_tanding = new javax.swing.JTextField();
        btn_cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setText("DATA PELATIH");

        jLabel2.setText("ID Tanding");

        jLabel3.setText("ID Anggota");

        jLabel4.setText("ID Cabang");

        jLabel5.setText("ID Pelatih");

        jLabel6.setText("Jadwal Tanding");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        tab_tanding.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Tanding", "Nama Anggota", "Nama Cabang", "Nama Pelatih", "Jadwal Tanding", "Nama Tanding"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_tanding);

        cb_pelatih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Pelatih --" }));
        cb_pelatih.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_pelatihItemStateChanged(evt);
            }
        });

        jLabel7.setText("Nama Pelatih");

        jLabel8.setText("Nama Cabang");

        cb_cabang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Cabang --" }));
        cb_cabang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cabangItemStateChanged(evt);
            }
        });

        cb_anggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih ID Anggota --" }));
        cb_anggota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_anggotaItemStateChanged(evt);
            }
        });

        jLabel9.setText("Nama Anggota");

        jLabel10.setText("Nama Pertandingan");

        btn_cetak.setText("Cetak");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_simpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_reset))
                                    .addComponent(id_tanding)
                                    .addComponent(fnamaanggota)
                                    .addComponent(fnamacabang)
                                    .addComponent(fnamapelatih)
                                    .addComponent(jadwal_tanding)
                                    .addComponent(cb_pelatih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_cabang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_anggota, 0, 166, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nama_tanding)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(483, 483, 483))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cetak)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cetak)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(fnamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cb_cabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnamacabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnamapelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jadwal_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(nama_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan)
                            .addComponent(btn_reset))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

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

        setSize(new java.awt.Dimension(1111, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        idtanding = id_tanding.getText();
        idanggota = (String) cb_anggota.getSelectedItem();
        idcabang = (String)cb_cabang.getSelectedItem();
        idpelatih = (String)cb_pelatih.getSelectedItem();
        jadwal = jadwal_tanding.getText();
        nama = nama_tanding.getText();
        
        if(idtanding.equals("") || idanggota.equals("") || idcabang.equals("") || idpelatih.equals("") || jadwal.equals("") || nama.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong" , "Informasi",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (konfir == 0 ){
                try {
                    String sql = "INSERT INTO data_tanding VALUES ('"+idtanding+"','"+idanggota+"','"+idcabang+"','"+idpelatih+"','"+jadwal+"','"+nama+"')";
                    Connection conn = (Connection)koneksi.konek();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data tanding berhasil ditambahkan","Informasi",JOptionPane.INFORMATION_MESSAGE);
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

    private void cb_anggotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_anggotaItemStateChanged
        // TODO add your handling code here:
        try {
            if(cb_anggota.getSelectedIndex() == 0){
             fnamaanggota.setText("");
            }
            else{
                Statement st = conn.createStatement();
                String sql = "SELECT nama_anggota FROM data_anggota WHERE id_anggota='"+cb_anggota.getSelectedItem()+"'";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    fnamaanggota.setText(rs.getString("nama_anggota"));
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_anggotaItemStateChanged

    private void cb_cabangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_cabangItemStateChanged
        // TODO add your handling code here:
        try {
            if(cb_cabang.getSelectedIndex() == 0){
                fnamacabang.setText("");
            }
            else{
                Statement st = conn.createStatement();
                String sql = "SELECT nama_cabang FROM data_cabang WHERE id_cabang='"+cb_cabang.getSelectedItem()+"'";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    fnamacabang.setText(rs.getString("nama_cabang"));
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_cabangItemStateChanged

    private void cb_pelatihItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_pelatihItemStateChanged
        // TODO add your handling code here:
        try {
            if(cb_pelatih.getSelectedIndex() == 0){
                fnamapelatih.setText("");
            }
            else{
                Statement st = conn.createStatement();
                String sql = "SELECT nama_pelatih FROM data_pelatih WHERE id_pelatih='"+cb_pelatih.getSelectedItem()+"'";
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next()){
                    fnamapelatih.setText(rs.getString("nama_pelatih"));
                }
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_pelatihItemStateChanged

    // cetak data
    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("data_tanding.jasper"),
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
    public void tampilcb_cabang(){
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT id_cabang FROM data_cabang order by id_cabang ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                cb_cabang.addItem(rs.getString("id_cabang"));
         
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (Exception e) {
        }
    }
    public void tampilcb_pelatih(){
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT id_pelatih FROM data_pelatih order by id_pelatih ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                cb_pelatih.addItem(rs.getString("id_pelatih"));
         
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
            java.util.logging.Logger.getLogger(datatanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datatanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datatanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datatanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datatanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cb_anggota;
    private javax.swing.JComboBox<String> cb_cabang;
    private javax.swing.JComboBox<String> cb_pelatih;
    private javax.swing.JTextField fnamaanggota;
    private javax.swing.JTextField fnamacabang;
    private javax.swing.JTextField fnamapelatih;
    private javax.swing.JTextField id_tanding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jadwal_tanding;
    private javax.swing.JTextField nama_tanding;
    private javax.swing.JTable tab_tanding;
    // End of variables declaration//GEN-END:variables
}
