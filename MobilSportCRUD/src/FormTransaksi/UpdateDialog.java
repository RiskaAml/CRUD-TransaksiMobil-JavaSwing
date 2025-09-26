
package FormTransaksi;
import java.awt.Frame;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UpdateDialog extends javax.swing.JDialog {
    String koneksi = "jdbc:postgresql://localhost:5432/TugasPbo";
    String user = "postgres";
    String password = "amelcantik";
    String idAwal;
    
    //Konstructor utama
    public UpdateDialog(java.awt.Frame parent, boolean modal, String id, String merk, String harga, 
                    String tanggal, String nama) {
        super(parent, modal);
        initComponents();
        
        idAwal = id;
        
        txtIdPembelian.setText(id);
        txtMerk.setText(merk);
        txtHarga.setText(harga);
        txtTanggal.setText(tanggal);
        txtNama.setText(nama);
        
        txtIdPembelian.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPembelian = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Pembelian");

        jLabel6.setText("Masukkan Nilai Baru");

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

        btnUpdate.setText("Update Data");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnUpdate)
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = txtIdPembelian.getText().trim();
        String merk = txtMerk.getText().trim();
        String hargaStr = txtHarga.getText().trim();
        String tanggalStr = txtTanggal.getText().trim();
        String nama = txtNama.getText().trim();

        // Validasi input
        if (id.isEmpty() || merk.isEmpty() || hargaStr.isEmpty() || tanggalStr.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }

        double harga;
        java.sql.Date sqlDate;
        try {
            harga = Double.parseDouble(hargaStr);
            // Format tanggal harus YYYY-MM-DD
            sqlDate = java.sql.Date.valueOf(tanggalStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format Harga salah. Masukkan angka.");
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Format Tanggal salah. Gunakan format YYYY-MM-DD.");
            return;
        }

        String sql = "UPDATE transaksi_mobil_sport SET merk_mobil=?, harga=?, tanggal_pembelian=?, nama_pembeli=? WHERE id_pembelian=?";
        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, merk);
            pstmt.setDouble(2, harga);
            pstmt.setDate(3, sqlDate);
            pstmt.setString(4, nama);
            pstmt.setString(5, idAwal); // Menggunakan ID asli untuk WHERE clause
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal update: Data ID " + idAwal + " tidak ditemukan.");
            }
            
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDialog.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal update: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Menggunakan konstruktor dengan parameter dummy untuk testing
                UpdateDialog dialog = new UpdateDialog(new javax.swing.JFrame(), true, 
                                                       "ID001", "Lamborghini", "1000000000", 
                                                       "2024-05-20", "Dummy Name");
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
    private javax.swing.JButton btnUpdate;
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
