package apk_datasilat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

// by sifa nur febriani
public class j_data_Pelatih extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
//    String id;
//    String nama;
//    String Ttl;
//    String Jk;
//    String sbk;
    
    public j_data_Pelatih() {
        initComponents();
        showData();
    }

    //reset
    private void reset(){
        inputId.setText("");
        namaPelatih.setText("");
        TTL.setText("");
        cbJK.setSelectedItem("");
        sabuk.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TTL = new javax.swing.JLabel();
        JK = new javax.swing.JLabel();
        Sabuk = new javax.swing.JLabel();
        ttl = new javax.swing.JTextField();
        sabuk = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        namaPelatih = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        cbJK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelatih = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        listCari = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        inputCari = new javax.swing.JTextField();
        btnCetakdata = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pelatih");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA PELATIH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, 20));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        TTL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TTL.setForeground(new java.awt.Color(255, 255, 255));
        TTL.setText("Tempat Tanggal Lahir");

        JK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JK.setForeground(new java.awt.Color(255, 255, 255));
        JK.setText("Jenis Kelamin");

        Sabuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sabuk.setForeground(new java.awt.Color(255, 255, 255));
        Sabuk.setText("Sabuk");

        nama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("Nama Pelatih");

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

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");

        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sabuk)
                    .addComponent(cbJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ttl)
                    .addComponent(namaPelatih)
                    .addComponent(inputId)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(TTL)
                            .addComponent(JK)
                            .addComponent(id)
                            .addComponent(Sabuk))
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TTL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sabuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sabuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(7, 7, 7)
                .addComponent(btnKembali)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 480));

        tabelPelatih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Pelatih", "TTL", "Jenis Kelamin", "Sabuk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPelatih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPelatihMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPelatih);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 580, 400));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/find.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, 40));

        listCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "TTL", "JK", "Sabuk" }));
        getContentPane().add(listCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));
        getContentPane().add(inputCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 120, -1));

        btnCetakdata.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakdata.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print.png"))); // NOI18N
        btnCetakdata.setText("Cetak Data");
        btnCetakdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakdataActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetakdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        setSize(new java.awt.Dimension(912, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //tampil data
    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama");
        tabel.addColumn("TTL");
        tabel.addColumn("JK");
        tabel.addColumn("Sabuk");
        
        //memanggil data dari DB
        try {
            String sql = "SELECT * FROM tb_pelatih";
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
            }
            tabelPelatih.setModel(tabel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //cari data
    private void searchData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama");
        tabel.addColumn("TTL");
        tabel.addColumn("JK");
        tabel.addColumn("Sabuk");
        
        //mencari data dari DB
        try {
            String sql = "SELECT * FROM tb_pelatih WHERE " +listCari.getSelectedItem().toString()
            + " LIKE '%" +inputCari.getText()+ "%'";
            Connection conn = (Connection)koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
         
            while(rs.next()){
                tabel.addRow(new Object [] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
                tabelPelatih.setModel(tabel);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id = inputId.getText();
        String nama = namaPelatih.getText();
        String Ttl = ttl.getText();
        String Jk = (String) cbJK.getSelectedItem();
        String sbk = sabuk.getText();
        
        //mengecek jika kolom input masih kosong
        if(id.equals("") || nama.equals("") || Ttl.equals("") || Jk.equals("") || sbk.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu","Informasi",JOptionPane.WARNING_MESSAGE);
        }
        //konfir
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Update Data ? ", "Konfirmasi" , JOptionPane.YES_NO_OPTION);

            if(konfir == 0){
                //mengubah data
                try {
                    String sql = "UPDATE tb_pelatih SET Nama = '"+nama+"', TTL = '"+Ttl+"', JK = '"+Jk+"', Sabuk= '"+sbk+"' WHERE ID = '"+id+"'";

                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Update berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String id = inputId.getText();
        String nama = namaPelatih.getText();
        String Ttl = ttl.getText();
        String Jk = (String) cbJK.getSelectedItem();
        String sbk = sabuk.getText();

        //mengecek jika kolo masih kosong
        if(id.equals("") || nama.equals("") || Ttl.equals("") || Jk.equals("") || sbk.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu","Informasi",JOptionPane.WARNING_MESSAGE);
        }
        //konfir
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Hapus Data ? ", "Konfirmasi" , JOptionPane.YES_NO_OPTION);

            if(konfir == 0){
                try {
                    String sql = "DELETE FROM tb_pelatih WHERE ID = '"+inputId+"'";
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Data berhasil terhapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    showData();
                    reset();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed

        new c_menu().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tabelPelatihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPelatihMouseClicked
        // TODO add your handling code here:
        int no = tabelPelatih.rowAtPoint(evt.getPoint());
        
        String id = tabelPelatih.getValueAt(no,0).toString();
        inputId.setText(id);
        
        String nama = tabelPelatih.getValueAt(no,1).toString();
        namaPelatih.setText(nama);
        
        String tempat = tabelPelatih.getValueAt(no,2).toString();
        ttl.setText(tempat);
        
        String jenkel = tabelPelatih.getValueAt(no,3).toString();
        cbJK.setSelectedItem(jenkel);
        
        String Sabuk = tabelPelatih.getValueAt(no,4).toString();
        sabuk.setText(Sabuk);
    }//GEN-LAST:event_tabelPelatihMouseClicked

    private void btnCetakdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakdataActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("report_pelatih.jasper"),
                null, koneksi.konek());

            JasperViewer.viewReport(JP);
        }

        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "cetak data gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnCetakdataActionPerformed

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
            java.util.logging.Logger.getLogger(j_data_Pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(j_data_Pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(j_data_Pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(j_data_Pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new j_data_Pelatih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JK;
    private javax.swing.JLabel Sabuk;
    private javax.swing.JLabel TTL;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetakdata;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbJK;
    private javax.swing.JLabel id;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listCari;
    private javax.swing.JLabel nama;
    private javax.swing.JTextField namaPelatih;
    private javax.swing.JTextField sabuk;
    private javax.swing.JTable tabelPelatih;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}
