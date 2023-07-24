import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class J_data_tanding extends javax.swing.JFrame {
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
    
    public J_data_tanding() {
        initComponents();
        showData();
        tampilcb_anggota();
        tampilcb_cabang();
        tampilcb_pelatih();
        
        // merubah format tanggal 
        Locale locale = new Locale ("id","ID");
        Locale.setDefault(locale);
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
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
        fcari.setText("");
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
    private void cari(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Tanding");
        tabel.addColumn("Nama Anggota");
        tabel.addColumn("Nama Cabang");
        tabel.addColumn("Nama Pelatih");
        tabel.addColumn("Jadwal Tanding");
        tabel.addColumn("Nama Tanding");
        
        try {
            String sql = "SELECT id_tanding, data_anggota.nama_anggota, data_cabang.nama_cabang, data_pelatih.nama_pelatih, jadwal_tanding, nama_tanding FROM data_tanding "
                    + "INNER JOIN data_anggota ON data_tanding.id_anggota = data_anggota.id_anggota INNER JOIN data_cabang ON data_tanding.id_cabang = data_cabang.id_cabang INNER JOIN "
                    + "data_pelatih ON data_tanding.id_pelatih = data_pelatih.id_pelatih WHERE nama_anggota LIKE '%" +fcari.getText()+"%' OR nama_cabang LIKE '%" +fcari.getText()+"%' "
                    + "OR nama_pelatih LIKE '%" +fcari.getText()+"%' OR jadwal_tanding LIKE '%" +fcari.getText()+ "%' OR nama_tanding LIKE '%" +fcari.getText()+"%'";
            Connection conn = (Connection)koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
                 tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
            });
            tab_tanding.setModel(tabel);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_tanding = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_anggota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        fnamaanggota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_cabang = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fnamacabang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_pelatih = new javax.swing.JComboBox<>();
        fnamapelatih = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jadwal_tanding = new javax.swing.JTextField();
        nama_tanding = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        fcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_tanding = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Tanding");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 107, 107));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA TANDING");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(471, 471, 471))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1090, 60));

        jPanel3.setBackground(new java.awt.Color(255, 107, 107));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Tanding");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Anggota");

        cb_anggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -- Pilih ID Anggota --" }));
        cb_anggota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_anggotaItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nama Anggota");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Cabang");

        cb_cabang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Cabang --" }));
        cb_cabang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_cabangItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama Cabang");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Pelatih");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama Pelatih");

        cb_pelatih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih ID Pelatih --" }));
        cb_pelatih.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_pelatihItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jadwal Tanding");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Pertandingan");

        jPanel6.setBackground(new java.awt.Color(255, 107, 107));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnamacabang, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_pelatih, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fnamapelatih)
                            .addComponent(cb_cabang, 0, 226, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jadwal_tanding)
                            .addComponent(nama_tanding)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(40, 40, 40)
                        .addComponent(fnamaanggota))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_anggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_tanding, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_anggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fnamaanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_cabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fnamacabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fnamapelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jadwal_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nama_tanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 380, 540));

        btn_kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 110, 40));

        jPanel4.setBackground(new java.awt.Color(255, 107, 107));

        cari.setBackground(new java.awt.Color(255, 255, 255));
        cari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/find.png"))); // NOI18N
        cari.setText("Cari");
        cari.setBorder(null);
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
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

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cari Data Tanding");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fcari)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_cetak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 690, -1));

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
        tab_tanding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_tandingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_tanding);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 690, 410));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        setSize(new java.awt.Dimension(1150, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        idtanding = id_tanding.getText();
        idanggota = (String)cb_anggota.getSelectedItem();
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
                    String sql = "UPDATE data_tanding SET id_anggota = '" +idanggota+ "', id_cabang = '" +idcabang+ "', id_pelatih = '" +idpelatih+ "', jadwal_tanding = '" +jadwal+ "' , "
                            + "nama_tanding = '" +nama+ "' WHERE data_tanding.id_tanding = "+ idtanding;
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
                    showData();
                    reset();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        idtanding = id_tanding.getText();
        
        if(idtanding.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan dihapus","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan Data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(konfir == 0){
                try {
                    String sql = "DELETE FROM data_tanding WHERE id_tanding="+idtanding;
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    showData();
                    reset();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        cari();
        reset();
    }//GEN-LAST:event_cariActionPerformed

    private void tab_tandingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_tandingMouseClicked
        // TODO add your handling code here:
        int no = tab_tanding.rowAtPoint(evt.getPoint());
        
        String idtanding = tab_tanding.getValueAt(no, 0).toString();
        id_tanding.setText(idtanding);
        String idanggota = tab_tanding.getValueAt(no, 1).toString();
        fnamaanggota.setText(idanggota);
        String idcabang = tab_tanding.getValueAt(no, 2).toString();
        fnamacabang.setText(idcabang);
        String idpelatih = tab_tanding.getValueAt(no, 3).toString();
        fnamapelatih.setText(idpelatih);
        String jadwal = tab_tanding.getValueAt(no, 4).toString();
        jadwal_tanding.setText(jadwal);
        String nama = tab_tanding.getValueAt(no, 5).toString();
        nama_tanding.setText(nama);
    }//GEN-LAST:event_tab_tandingMouseClicked

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

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        idtanding = id_tanding.getText();
        idanggota = (String)cb_anggota.getSelectedItem();
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
                    
                    JOptionPane.showMessageDialog(null, "Data tanding berhasil tersimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

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
            java.util.logging.Logger.getLogger(J_data_tanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_data_tanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_data_tanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_data_tanding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new J_data_tanding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JButton cari;
    private javax.swing.JComboBox<String> cb_anggota;
    private javax.swing.JComboBox<String> cb_cabang;
    private javax.swing.JComboBox<String> cb_pelatih;
    private javax.swing.JTextField fcari;
    private javax.swing.JTextField fnamaanggota;
    private javax.swing.JTextField fnamacabang;
    private javax.swing.JTextField fnamapelatih;
    private javax.swing.JTextField id_tanding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jadwal_tanding;
    private javax.swing.JTextField nama_tanding;
    private javax.swing.JTable tab_tanding;
    // End of variables declaration//GEN-END:variables
}
