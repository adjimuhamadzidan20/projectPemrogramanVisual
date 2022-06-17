package apk_datasilat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

// by sifa nur febriani
public class dataPelatih extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
//    String id;
//    String nama;
//    String Ttl;
//    String Jk;
//    String sbk;
    
    public dataPelatih() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TTL = new javax.swing.JLabel();
        JK = new javax.swing.JLabel();
        Sabuk = new javax.swing.JLabel();
        ttl = new javax.swing.JTextField();
        sabuk = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();
        listCari = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        namaPelatih = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        cbJK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelatih = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("DATA PELATIH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TTL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        TTL.setText("Tempat Tanggal Lahir");

        JK.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        JK.setText("Jenis Kelamin");

        Sabuk.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Sabuk.setText("Sabuk");

        sabuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sabukActionPerformed(evt);
            }
        });

        nama.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nama.setText("Nama Pelatih");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(0, 153, 153));
        btnCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(0, 153, 153));
        btnHapus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(0, 153, 153));
        btnKembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        listCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nama", "TTL", "JK", "Sabuk" }));

        jLabel6.setText("Cari");

        id.setText("ID");

        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TTL, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sabuk)
                                    .addComponent(JK)))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nama)
                            .addGap(36, 36, 36)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(id)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sabuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(ttl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaPelatih, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputId)
                    .addComponent(cbJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listCari, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputCari))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(listCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama)
                    .addComponent(namaPelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTL)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sabuk)
                    .addComponent(sabuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(768, 709));
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
            String sql = "SELECT * FROM dt_pelatih";
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
            String sql = "SELECT * FROM dt_pelatih WHERE " +listCari.getSelectedItem().toString()
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
    
    
    private void sabukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sabukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sabukActionPerformed

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
                    String sql = "UPDATE dt_pelatih SET Nama = '"+nama+"', TTL = '"+Ttl+"', JK = '"+Jk+"', Sabuk= '"+sbk+"' WHERE ID = '"+id+"'";

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
                    String sql = "DELETE FROM dt_pelatih WHERE ID = '"+inputId+"'";
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

        new Menu().setVisible(true);
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
            java.util.logging.Logger.getLogger(dataPelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataPelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataPelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataPelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataPelatih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JK;
    private javax.swing.JLabel Sabuk;
    private javax.swing.JLabel TTL;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbJK;
    private javax.swing.JLabel id;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
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
