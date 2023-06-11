package apk_datasilat;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

// by sifa nur febriani
public class i_data_Cabang extends javax.swing.JFrame {
   
    //var kolom input
    String id;
    String namacabang;
    String PenanggungJawab;
    String jmlAnggota;
    String latihan;
    private Object res;
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
    //reset isi kolom input
    private void reset(){
        inputID.setText("");
        namaCabang.setText("");
        PJ.setText("");
        jmlAgt.setText("");
        lat.setText("");
    }

    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama Cabang");
        tabel.addColumn("Penanggung Jawab");
        tabel.addColumn("Jumlah Anggota");
        tabel.addColumn("Jadwal Latihan");
        
        //memanggil data dari DB
        try {
            String sql = "SELECT * FROM tb_cabang";
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while(rs.next()) {
               tabel.addRow(new Object[]{
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
               });
           }
           tabelCabang.setModel(tabel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //mencari isi data 
    private void searchData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID");
        tabel.addColumn("Nama_Cabang");
        tabel.addColumn("PJ");
        tabel.addColumn("Jumlah_Anggota");
        tabel.addColumn("Jadwal_Latihan");
        
        //mencari data dari DB
        try {
            String sql = "SELECT * FROM tb_cabang WHERE " +listCari.getSelectedItem().toString()
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
                tabelCabang.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
    }
    
    public i_data_Cabang() {
        initComponents();
        showData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PJ = new javax.swing.JTextField();
        jmlAgt = new javax.swing.JTextField();
        lat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        namaCabang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        listCari = new javax.swing.JComboBox<>();
        inputCari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCabang = new javax.swing.JTable();
        btnCetakdata = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Cabang");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA CABANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penanggung Jawab");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Anggota");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jadwal Latihan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Cabang");

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputID)
                    .addComponent(namaCabang)
                    .addComponent(PJ)
                    .addComponent(jmlAgt)
                    .addComponent(lat)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaCabang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jmlAgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, 460));

        listCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama_Cabang", "PJ", "Jumlah_Anggota", "Jadwal_Latihan" }));
        getContentPane().add(listCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 120, -1));
        getContentPane().add(inputCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cari");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/find.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 100, 40));

        jScrollPane1.setBorder(null);

        tabelCabang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Cabang", "Penanggung Jawab", "Jumlah Anggota", "Jadwal Latihan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelCabang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCabangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCabang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 570, 380));

        btnCetakdata.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakdata.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCetakdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print.png"))); // NOI18N
        btnCetakdata.setText("Cetak Data");
        btnCetakdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakdataActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetakdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        setSize(new java.awt.Dimension(917, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        id = inputID.getText();
        namacabang = namaCabang.getText();
        PenanggungJawab = PJ.getText();
        jmlAnggota = jmlAgt.getText();
        latihan = lat.getText();
        
        //mengecek jika kolom input masih kosong
        if(id.equals("") || namacabang.equals("") || PenanggungJawab.equals("") || jmlAnggota.equals("") || latihan.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu","Informasi",JOptionPane.WARNING_MESSAGE);
        }
        //konfir
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Update Data ? ", "Konfirmasi" , JOptionPane.YES_NO_OPTION);
            
            if(konfir == 0){
                //mengubah data
                try {
                   String sql = "UPDATE pendaftaran SET Nama_Cabang = '"+namacabang+"', PJ = '"+PJ+"', Jumlah_Anggota = '"+jmlAnggota+"', Jadwal_Latihan= '"+latihan+"' WHERE ID = '"+id+"'"; 
                  
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
        id = inputID.getText();
        
        //mengecek jika kolo masih kosong
        if(id.equals("") || namacabang.equals("") || PenanggungJawab.equals("") || jmlAnggota.equals("") || latihan.equals("")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih data terlebih dahulu","Informasi",JOptionPane.WARNING_MESSAGE);
        }
        //konfir
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Update Data ? ", "Konfirmasi" , JOptionPane.YES_NO_OPTION);
            
            if(konfir == 0){
                try {
                    String sql = "DELETE FROM pendaftaran WHERE ID = '"+id+"'";
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
                                
    private void tabelCabangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCabangMouseClicked
        // TODO add your handling code here:
        //tabel data cabang diklik dengan mouse
        int no = tabelCabang.rowAtPoint(evt.getPoint());

        String id = tabelCabang.getValueAt(no,0).toString();
        inputID.setText(id);

        String namacabang = tabelCabang.getValueAt(no,1).toString();
        namaCabang.setText(namacabang);

        String PenanggungJawab = tabelCabang.getValueAt(no,2).toString();
        PJ.setText(PenanggungJawab);

        String jmlAnggota = tabelCabang.getValueAt(no,3).toString();
        jmlAgt.setText(jmlAnggota);

        String latihan = tabelCabang.getValueAt(no,4).toString();
        lat.setText(latihan);

    }//GEN-LAST:event_tabelCabangMouseClicked

    private void btnCetakdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakdataActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("report_cabang.jasper"),
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
            java.util.logging.Logger.getLogger(i_data_Cabang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(i_data_Cabang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(i_data_Cabang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(i_data_Cabang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new i_data_Cabang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PJ;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetakdata;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jmlAgt;
    private javax.swing.JTextField lat;
    private javax.swing.JComboBox<String> listCari;
    private javax.swing.JTextField namaCabang;
    private javax.swing.JTable tabelCabang;
    // End of variables declaration//GEN-END:variables
}
