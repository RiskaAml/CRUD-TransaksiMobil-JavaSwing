package FormTransaksi;

// 1. Untuk GUI dan JOptionPane
import javax.swing.*; 

// 2. Untuk operasi Database (Connection, DriverManager, PreparedStatement, SQLException)
import java.sql.*; 

// 3. Untuk Logging (Level, Logger) - Wajib untuk Logger.getLogger().log(Level.SEVERE, ...)
import java.util.logging.Level;
import java.util.logging.Logger;

// 4. (Opsional, tapi seringkali dibutuhkan)
import java.awt.*;
import java.awt.event.*;


public class InsertDialog extends javax.swing.JDialog {
    String koneksi = "jdbc:postgresql://localhost:5432/TugasPbo";
    String user = "postgres";
    String password = "amelcantik";
    
    public InsertDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPembelian = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Pembelian");

        jLabel2.setText("Merk Mobil");

        jLabel3.setText("Harga");

        jLabel4.setText("Tanggal");

        jLabel5.setText("Nama Pembeli");

        txtMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMerkActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert Data");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel6.setText("Masukkan Nilai Baru");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsert)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdPembelian)
                                    .addComponent(txtMerk)
                                    .addComponent(txtHarga)
                                    .addComponent(txtTanggal)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel6)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String id = txtIdPembelian.getText().trim();
        String merk = txtMerk.getText().trim();
        String hargaStr = txtHarga.getText().trim();
        String tanggalStr = txtTanggal.getText().trim();
        String nama = txtNama.getText().trim();

        // 1. Validasi Input Kosong
        if (id.isEmpty() || merk.isEmpty() || hargaStr.isEmpty() || tanggalStr.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi semua field!");
            return;
        }

        double harga;
        java.sql.Date sqlDate;
        try {
            // 2. Validasi Format Data
            harga = Double.parseDouble(hargaStr);
            // Format tanggal harus YYYY-MM-DD
            sqlDate = java.sql.Date.valueOf(tanggalStr); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format salah. Harga harus berupa angka.");
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Format Tanggal salah. Gunakan format YYYY-MM-DD.");
            return;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Format salah. Harga=angka, Tanggal=YYYY-MM-DD");
             return;
        }


        String sql = "INSERT INTO transaksi_mobil_sport (id_pembelian, merk_mobil, harga, tanggal_pembelian, nama_pembeli) VALUES (?,?,?,?,?)";
        // Menggunakan try-with-resources untuk memastikan Connection dan PreparedStatement tertutup
        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, id);
            pstmt.setString(2, merk);
            pstmt.setDouble(3, harga);
            pstmt.setDate(4, sqlDate);
            pstmt.setString(5, nama);
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
            dispose();
        } catch (SQLException ex) {
            // Log error lengkap di console dan tampilkan pesan user-friendly
            Logger.getLogger(InsertDialog.class.getName()).log(Level.SEVERE, null, ex);
            
            // Cek apakah error karena ID duplikat (asumsi id_pembelian adalah Primary Key)
            if (ex.getSQLState().startsWith("23")) { // SQLState 23xxx adalah Integrity Constraint Violation
                 JOptionPane.showMessageDialog(this, "Gagal insert: ID Pembelian sudah ada atau ada kesalahan data lainnya.", "Error Database", JOptionPane.ERROR_MESSAGE);
            } else {
                 JOptionPane.showMessageDialog(this, "Gagal insert: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertDialog dialog = new InsertDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdPembelian;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
