package apk_datasilat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

// by sifa nur febriani
public class g_form_DaftarKeuangan extends javax.swing.JFrame {

    //statement
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
//    var kolom inputan
            String id;
            String nama;
            String bulan;
            String ket;
            
     //reset
            private void reset(){
                txtID.setText("");
                txtNama.setText("");
                cbBln.setSelectedItem("");
                
            }
    //show data
            private void showData(){
                Object [] baris = {"ID","Nama","Bulan","Keterangan"};
                tabel = new DefaultTableModel(null, baris);
                
                //memanggil semua data dari DB
                try {
                    String sql = "SELECT * FROM tb_datakeuangan";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    
                    while(rs.next()){
                        tabel.addRow(new Object[] {
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)
                            
                        });
                        tabUang.setModel(tabel);
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    
            
    //search data
            private void searchData(){
                Object [] baris = {"ID","Nama","Bulan","Keterangan"};
                tabel = new DefaultTableModel();
                
                //mencari data dari db 
                try {
                    String sql = "SELECT * FROM tb_datakeuangan WHERE " +listCari.getSelectedItem().toString()
            + " LIKE '%" +txtCari.getText()+ "%'";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    
                    while(rs.next()){
                        tabel.addRow(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            
                        });
                        tabUang.setModel(tabel);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    public g_form_DaftarKeuangan() {
        initComponents();
        showData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listCari = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        cbBln = new javax.swing.JComboBox<>();
        btnKembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtBln = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabUang = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        btnCetakdata = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran Keuangan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PENDAFTARAN KEUANGAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        listCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nama", "Bulan", "Keterangan" }));
        getContentPane().add(listCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cari");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 110, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bulan");

        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/saves.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
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

        cbBln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "Novenber", "Desember" }));
        cbBln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBlnActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbBln, javax.swing.GroupLayout.Alignment.LEADING, 0, 249, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBln, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKembali)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 460));

        tabUang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Bulan", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabUang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabUang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 590, 380));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        setSize(new java.awt.Dimension(926, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
        //mengecek jika kolom masih kosong
        try {
            int jawab;
             
            if((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data ?","Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION)) == 0){
               String sql = "DELETE FROM tb_datakeuangan WHERE id = '"+txtID.getText()+"'";
               PreparedStatement st = conn.prepareStatement(sql);
               st.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
               reset();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e);
        }
        showData();
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       
        //mengecek jika kolom input masih kosong
        if(txtID.equals("") || txtNama.equals("") || cbBln.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong","Informasi",JOptionPane.WARNING_MESSAGE);
        }
        else {
            //konfirmasi
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            
            if(konfir == 0){
                
                try {
            String sql ="INSERT INTO tb_datakeuangan values(?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtID.getText());
            st.setString(2, txtNama.getText());
            st.setString(3, (String) cbBln.getSelectedItem());
            st.setString(4, txtBln.getText());
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            reset();
            
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data Gagal Disimpan" +e);
        }
        showData();
        
            }
        }      
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       
       new c_menu().setVisible(true);
       dispose();
          
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tabUangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUangMouseClicked
        // TODO add your handling code here:
        txtID.setText(tabUang.getValueAt(tabUang.getSelectedRow(), 0).toString());
        txtNama.setText(tabUang.getValueAt(tabUang.getSelectedRow(), 1).toString());
        cbBln.setSelectedItem(tabUang.getValueAt(tabUang.getSelectedRow(), 2).toString());
       txtBln.setText(tabUang.getValueAt(tabUang.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabUangMouseClicked

    private void cbBlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBlnActionPerformed
        // TODO add your handling code here:
        switch(cbBln.getSelectedIndex()){
            case 0 : txtBln.setText("Sudah Membayar");
            break;
            case 1 : txtBln.setText("Sudah Membayar");
            break;
            case 2 : txtBln.setText("Sudah Membayar");
            break;
            case 3 : txtBln.setText("Sudah Membayar");
            break;
            case 4 : txtBln.setText("Sudah Membayar");
            break;
            case 5 : txtBln.setText("Sudah Membayar");
            break;
            case 6 : txtBln.setText("Sudah Membayar");
            break;
            case 7 : txtBln.setText("Sudah Membayar");
            break;
            case 8 : txtBln.setText("Sudah Membayar");
            break;
            case 9 : txtBln.setText("Sudah Membayar");
            break;
            case 10 : txtBln.setText("Sudah Membayar");
            break;
            default: txtBln.setText("Sudah Membayar");
            break;
        }
        
    }//GEN-LAST:event_cbBlnActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        searchData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCetakdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakdataActionPerformed
        try {
            JasperPrint JP = JasperFillManager.fillReport(getClass().getResourceAsStream("report_keuangan.jasper"),
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
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(g_form_DaftarKeuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new g_form_DaftarKeuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetakdata;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbBln;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listCari;
    private javax.swing.JTable tabUang;
    private javax.swing.JTextField txtBln;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
