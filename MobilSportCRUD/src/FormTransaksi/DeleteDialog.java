
package FormTransaksi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteDialog extends javax.swing.JDialog {
    private String idAwal;

    String koneksi = "jdbc:postgresql://localhost:5432/TugasPbo";
    String user = "postgres";
    String password = "amelcantik";

    // Konstruktor DeleteDialog
    public DeleteDialog(Frame parent, boolean modal, String idAwal, String merk, String harga, String tanggal, String nama) {
        super(parent, modal);
        initComponents();
        
        this.idAwal = idAwal;

        txtIdPembelian.setText(idAwal);
        txtMerk.setText(merk);
        txtHarga.setText(harga);
        txtTanggal.setText(tanggal);
        txtNama.setText(nama);

        // biar tidak bisa diedit
        txtIdPembelian.setEditable(false);
        txtMerk.setEditable(false);
        txtHarga.setEditable(false);
        txtTanggal.setEditable(false);
        txtNama.setEditable(false);

    }
    public DeleteDialog(Frame parent, boolean modal, String idAwal) {
         super(parent, modal);
         initComponents();
         this.idAwal = idAwal;
         txtIdPembelian.setText(idAwal);
         // Kosongkan atau atur nilai default untuk field lainnya jika hanya ID yang tersedia
         txtMerk.setText(""); 
         txtHarga.setText("");
         txtTanggal.setText("");
         txtNama.setText("");
         
         // Set non-editable
         txtIdPembelian.setEditable(false);
         txtMerk.setEditable(false);
         txtHarga.setEditable(false);
         txtTanggal.setEditable(false);
         txtNama.setEditable(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Menggunakan konstruktor lengkap dengan data dummy
                DeleteDialog dialog = new DeleteDialog(new javax.swing.JFrame(), true, "ID001", "Ferrari", "5000000000", "2024-01-01", "Budi");
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
        btnTidak = new javax.swing.JButton();
        btnYa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Pembelian");

        jLabel6.setText("yakin ingin menghapus data ini? ");

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

        btnTidak.setText("Tidak");
        btnTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakActionPerformed(evt);
            }
        });

        btnYa.setText("Ya");
        btnYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaActionPerformed(evt);
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
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnYa)
                        .addGap(76, 76, 76)
                        .addComponent(btnTidak)
                        .addGap(95, 95, 95)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTidak)
                    .addComponent(btnYa))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakActionPerformed
        dispose();
    }//GEN-LAST:event_btnTidakActionPerformed

    private void btnYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaActionPerformed
        String sql = "DELETE FROM transaksi_mobil_sport WHERE id_pembelian=?";
        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idAwal);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                 JOptionPane.showMessageDialog(this, "Data dengan ID " + idAwal + " berhasil dihapus!");
            } else {
                 JOptionPane.showMessageDialog(this, "Data dengan ID " + idAwal + " tidak ditemukan.");
            }
           
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal hapus: " + ex.getMessage());
        } 
    }//GEN-LAST:event_btnYaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTidak;
    private javax.swing.JButton btnYa;
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
