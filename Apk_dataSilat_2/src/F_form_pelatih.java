import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
public class F_form_pelatih extends javax.swing.JFrame {
    String id;
    String nama;
    String JK;
    String alamatpl;
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabel;
    Connection conn = koneksi.konek();
    
    public F_form_pelatih() {
        initComponents();
        showData();
        
        // ikon aplikasi
        Image icon = new ImageIcon(this.getClass().getResource("/image_asset/logologin.png")).getImage();
        this.setIconImage(icon);
    }
    
    private void reset(){
        id_pelatih.setText("");
        nama_pelatih.setText("");
        jenkel.setSelectedItem("");
        alamat.setText("");
    }
    private void showData(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Pelatih");
        tabel.addColumn("Nama Pelatih");
        tabel.addColumn("Jenis Kelamin");
        tabel.addColumn("Alamat Pelatih");
        
        try {
            String sql = "SELECT * FROM data_pelatih";
            Connection conn = (Connection)koneksi.konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                });
                tab_pelatih.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_pelatih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_pelatih = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jenkel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_pelatih = new javax.swing.JTable();
        btn_kembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pelatih");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 107, 107));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PELATIH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, 782, 80));

        jPanel3.setBackground(new java.awt.Color(255, 107, 107));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pelatih");

        id_pelatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pelatihActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pelatih");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Kelamin");

        jenkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Jenis Kelamin --", "Laki Laki", "Perempuan" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat Pelatih");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nama_pelatih, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                        .addComponent(id_pelatih)
                                        .addComponent(jenkel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_pelatih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jenkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, 370));

        tab_pelatih.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pelatih", "Nama Pelatih", "Jenis Kelamin", "Alamat Pelatih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_pelatih);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 110, 450, 370));

        btn_kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembali.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btn_kembali.setText("Kembali");
        btn_kembali.setBorder(null);
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_asset/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        id = id_pelatih.getText();
        nama = nama_pelatih.getText();
        JK = (String)jenkel.getSelectedItem();
        alamatpl = alamat.getText();
        if(id.equals("") || nama.equals("") || JK.equals("")|| alamatpl.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong" , "Informasi",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int konfir = JOptionPane.showConfirmDialog(null, "Simpan data ? ","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (konfir == 0 ){
                try {
                     String sql = "INSERT INTO data_pelatih VALUES ('"+id+"','"+nama+"','"+JK+"','"+alamatpl+"')";
                     Connection conn = (Connection)koneksi.konek();
                     PreparedStatement st = conn.prepareStatement(sql);
                        st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data pelatih berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
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

    private void id_pelatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pelatihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pelatihActionPerformed

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
            java.util.logging.Logger.getLogger(F_form_pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_form_pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_form_pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_form_pelatih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_form_pelatih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField id_pelatih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jenkel;
    private javax.swing.JTextField nama_pelatih;
    private javax.swing.JTable tab_pelatih;
    // End of variables declaration//GEN-END:variables
}
