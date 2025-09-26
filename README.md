# CRUD-TransaksiMobil-JavaSwing  

Aplikasi desktop sederhana berbasis **Java Swing** untuk mengelola data transaksi mobil sport.  
Proyek ini dibuat sebagai latihan/praktikum Object-Oriented Programming (OOP) dengan implementasi **CRUD** (Create, Read, Update, Delete) menggunakan database.  

---

## 🚗 Fitur Utama
- **Menampilkan data transaksi** dalam bentuk tabel (`JTable`)  
- **Tambah data baru** transaksi mobil (Insert)  
- **Update data** transaksi yang sudah ada  
- **Hapus data** transaksi dari database  
- **Koneksi database** menggunakan `JDBC`  
- **Konversi data ResultSet → TableModel** menggunakan `DbUtils`  

---

## 🛠️ Teknologi yang Digunakan
- **Java SE** (JDK 17 / 21 bisa jalan)  
- **Java Swing** (untuk GUI)  
- **PostgreSQL / MySQL** (bisa disesuaikan, default PostgreSQL)  
- **JDBC Driver**  

---

## 📂 Struktur Project
src/
└── FormTransaksi/
├── DataTransaksiMobil.java # JFrame utama (menampilkan data tabel transaksi)
├── DbUtils.java # Helper ResultSet → TableModel
├── InsertDialog.java # Dialog tambah data
├── UpdateDialog.java # Dialog update data
├── DeleteDialog.java # Dialog hapus data


---

## ⚙️ Cara Menjalankan
1. Clone repository ini  
   ```bash
   git clone https://github.com/username/CRUD-TransaksiMobil-JavaSwing.git
   cd CRUD-TransaksiMobil-JavaSwing
2. Import project ke NetBeans / IntelliJ IDEA
3. Pastikan sudah membuat database dengan tabel transaksi:
CREATE TABLE transaksi_mobil_sport (
    id_pembelian SERIAL PRIMARY KEY,
    merk_mobil VARCHAR(50),
    harga NUMERIC(15,2),
    tanggal_pembelian DATE,
    nama_pembeli VARCHAR(100)
);
4. Ubah konfigurasi koneksi database di file:
Connection conn = DriverManager.getConnection(koneksi, user, password);
5. Jalankan aplikasi → maka form transaksi akan tampil
