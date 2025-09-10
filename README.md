# Post-Test1
# 👟 **Sistem Manajemen Koleksi Sepatu Digital: Laporan Program**

## 1. Pendahuluan: Mengapa Program Ini Penting?

Program **CRUDApp** adalah solusi berbasis konsol yang efisien untuk mengelola koleksi sepatu secara digital. Alih-alih menggunakan metode manual, program ini menawarkan antarmuka intuitif untuk melakukan operasi fundamental **CRUD (Create, Read, Update, Delete)**.

Dirancang dengan prinsip **Pemrograman Berorientasi Objek (OOP)**, aplikasi ini memastikan struktur kode yang bersih, mudah dikembangkan, dan stabil.

---

## 2. Alur Interaksi Pengguna: Navigasi Terpandu

Interaksi dengan program ini didesain sebagai percakapan yang logis, memandu pengguna melalui setiap langkah dengan jelas.

### **a. Menu Utama: Pusat Komando**

Saat program diluncurkan, Anda akan disambut dengan menu utama yang menjadi titik awal navigasi.

**Tampilan:**

## 🔄 Alur Program  

Agar lebih mudah dipahami, berikut adalah penjelasan **alur kerja program CRUD Sepatu**:  

1. **Program Dimulai**  
   - Program menampilkan menu utama berisi pilihan:  
     ```
     1. Tambah Sepatu
     2. Tampilkan Semua Sepatu
     3. Perbarui Sepatu
     4. Hapus Sepatu
     5. Keluar
     ```  

2. **Pengguna Memilih Menu**  
   - Program meminta input berupa angka sesuai dengan pilihan menu.  
   - Jika pengguna memasukkan input yang salah (misalnya huruf), program akan menampilkan pesan error dan kembali ke menu.  

3. **Aksi Berdasarkan Pilihan**  
   - **Tambah Sepatu** → Program meminta data (nama, merk, warna, ukuran), lalu menambahkannya ke koleksi.  
   - **Tampilkan Semua Sepatu** → Program menampilkan seluruh daftar sepatu yang ada. Jika kosong, akan muncul pesan "Koleksi sepatu masih kosong."  
   - **Perbarui Sepatu** → Pengguna memilih nomor sepatu, lalu memasukkan data baru untuk menggantikan data lama.  
   - **Hapus Sepatu** → Pengguna memilih nomor sepatu yang ingin dihapus dari koleksi.  
   - **Keluar** → Program berhenti dengan pesan terima kasih.  

4. **Perulangan (Loop)**  
   - Setelah menyelesaikan satu aksi (kecuali keluar), program akan kembali ke menu utama dan menunggu input berikutnya.  
   - Hal ini terus berulang sampai pengguna memilih menu **Keluar (5)**.  

---

### 📊 Flowchart Alur Program  

Untuk memvisualisasikan alur logika program, berikut flowchart dalam format **Mermaid** (otomatis bisa ter-render di GitHub / VSCode dengan ekstensi Mermaid):  

```mermaid
flowchart TD
    A[Mulai] --> B[Tampilkan Menu]
    B --> C{Pilihan User}
    
    C -->|1. Tambah Sepatu| D[Input nama, merk, warna, ukuran]
    D --> B
    
    C -->|2. Tampilkan Sepatu| E[Tampilkan semua koleksi]
    E --> B
    
    C -->|3. Perbarui Sepatu| F[Pilih nomor sepatu & input data baru]
    F --> B
    
    C -->|4. Hapus Sepatu| G[Pilih nomor sepatu untuk dihapus]
    G --> B
    
    C -->|5. Keluar| H[Selesai]
    
    C -->|Pilihan lain| I[Pesan 'Pilihan tidak valid']
    I --> B

## 📋 Ringkasan Alur Program dalam Bentuk Tabel  

Selain penjelasan naratif dan flowchart, berikut tabel ringkas untuk memudahkan memahami alur menu program:  

| Menu Pilihan | Deskripsi Aksi | Output/Respon Program |
|--------------|----------------|------------------------|
| **1. Tambah Sepatu** | Pengguna mengisi data sepatu: nama, merk, warna, ukuran. | Sepatu baru ditambahkan ke koleksi, ditampilkan pesan **"Sepatu berhasil ditambahkan!"** |
| **2. Tampilkan Semua Sepatu** | Menampilkan daftar semua sepatu dalam koleksi. | Jika koleksi kosong → **"Koleksi sepatu masih kosong."** |
| **3. Perbarui Sepatu** | Pengguna memilih nomor sepatu, lalu mengisi data baru. | Data sepatu diperbarui → **"Sepatu berhasil diperbarui!"** |
| **4. Hapus Sepatu** | Pengguna memilih nomor sepatu yang ingin dihapus. | Sepatu dihapus dari koleksi → **"Sepatu berhasil dihapus."** |
| **5. Keluar** | Menghentikan program. | Program menampilkan **"Terima kasih, program selesai."** |
| **Input salah** | Jika pengguna memasukkan angka di luar 1–5 atau karakter non-angka. | Program menampilkan **"Pilihan tidak valid."** lalu kembali ke menu utama. |

---

📌 Dengan tabel ini, pembaca bisa langsung melihat gambaran umum alur program tanpa harus membaca panjang lebar.

# 👟 Sistem Manajemen Koleksi Sepatu Digital: Laporan Program  

---

## 1. Pendahuluan: Mengapa Program Ini Penting?  

Program **CRUDApp** adalah solusi berbasis konsol yang efisien untuk mengelola koleksi sepatu secara digital.  
Alih-alih menggunakan metode manual, program ini menawarkan **antarmuka intuitif** untuk melakukan operasi fundamental **CRUD (Create, Read, Update, Delete)**.  

Dirancang dengan prinsip **Pemrograman Berorientasi Objek (OOP)**, aplikasi ini memastikan struktur kode yang bersih, mudah dikembangkan, serta stabil.  

---

## 2. Alur Interaksi Pengguna: Navigasi Terpandu  

Interaksi dengan program ini didesain sebagai **percakapan yang logis**, memandu pengguna melalui setiap langkah dengan jelas.  

### a. Menu Utama: Pusat Komando  
Saat program dijalankan, pengguna disambut dengan menu navigasi:  


