package FormTransaksi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    
public class DataTransaksiMobil extends javax.swing.JFrame {

    // DB config
    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/TugasPbo";
    String user = "postgres";
    String password = "amelcantik";

    public DataTransaksiMobil() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Driver tidak ditemukan: " + e.getMessage());
        }
        initComponents();
        showTable();
    }
    
    private void clear() {
        DefaultTableModel model = (DefaultTableModel) tabelTransaksi.getModel();
        model.setRowCount(0); // hapus semua data di tabel
    }
    
    public void showTable() {
        String sql = "SELECT id_pembelian, nama_pembeli, merk_mobil, harga, tanggal_pembelian "
                   + "FROM transaksi_mobil_sport ORDER BY id_pembelian";
        DefaultTableModel model = new DefaultTableModel(new String[]{
            "ID Transaksi", "Merk Mobil", "Harga", "Tanggal Pembelian", "Nama Pembeli"
        }, 0);

        try (Connection conn = DriverManager.getConnection(koneksi, user, password);
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getString("id_pembelian"),
                    rs.getString("merk_mobil"),
                    rs.getDouble("harga"),
                    rs.getDate("tanggal_pembelian"),
                    rs.getString("nama_pembeli")
                };
                model.addRow(row);
            }
            tabelTransaksi.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(DataTransaksiMobil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal load data: " + ex.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Transaksi Mobil Sport");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Merk Mobil", "Harga", "Tanggal Pembelian", "Nama Pembeli"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 510, 230));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormTransaksi/WhatsApp Image 2025-09-19 at 7.55.38 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -140, 820, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        InsertDialog dialog = new InsertDialog(this, true); 
        dialog.setVisible(true);
        showTable(); // refresh setelah dialog ditutup

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tabelTransaksi.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang mau diupdate dulu!");
            return;
        }

        // ambil data dari tabel untuk dikirim ke dialog
        String id = tabelTransaksi.getValueAt(row, 0).toString();
        String merk = tabelTransaksi.getValueAt(row, 1).toString();
        String harga = tabelTransaksi.getValueAt(row, 2).toString();
        String tanggal = tabelTransaksi.getValueAt(row, 3).toString();
        String nama = tabelTransaksi.getValueAt(row, 4).toString();

        UpdateDialog dialog = new UpdateDialog(this, true, id, merk, harga, tanggal, nama);
        dialog.setVisible(true);
        showTable(); // refresh setelah dialog ditutup

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tabelTransaksi.getSelectedRow();
        if (selectedRow != -1) {
            String id = tabelTransaksi.getValueAt(selectedRow, 0).toString();
            // Ambil data lain untuk ditampilkan di dialog konfirmasi
            String merk = tabelTransaksi.getValueAt(selectedRow, 1).toString();
            String harga = Double.toString((Double) tabelTransaksi.getValueAt(selectedRow, 2));
            String tanggal = String.valueOf(tabelTransaksi.getValueAt(selectedRow, 3));
            String nama = tabelTransaksi.getValueAt(selectedRow, 4).toString();
            
            DeleteDialog dialog = new DeleteDialog(this, true, id, merk, harga, tanggal, nama);
            dialog.setVisible(true);
            showTable(); // refresh
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
       
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTransaksiMobil().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
