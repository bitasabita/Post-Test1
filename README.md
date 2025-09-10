# Post-Test1

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Tsabitah Kawiswara        | 2409116099    | Sistem Informasi C|


--- 
# 👟 **Sistem Manajemen Koleksi Sepatu Digital**
--- 
## 1.✨Pendahuluan: Mengapa Program Ini Penting?

Bayangkan Anda punya banyak sepatu dari sneakers favorit, pantofel kerja, sampai sandal santai tetapi semua datanya hanya tersimpan di kepala atau catatan manual. Lama-lama pasti bingung: "Sepatu mana saja yang sudah saya punya? Warna dan ukurannya apa? Atau apakah ada data yang keliru?"

Di sinilah CRUDApp hadir sebagai solusi.
CRUDApp adalah program berbasis konsol yang dirancang untuk mengelola koleksi sepatu secara digital. Dengan mengusung prinsip Pemrograman Berorientasi Objek (OOP), program ini tidak hanya efisien tetapi juga terstruktur rapi, mudah dipahami, dan bisa dikembangkan di masa depan.

Alih-alih repot dengan catatan manual, CRUDApp menawarkan sistem interaktif yang bisa:

➕ Menambah koleksi baru (Create)

📖 Melihat daftar sepatu yang tersimpan (Read)

✏️ Memperbarui data jika ada kesalahan (Update)

❌ Menghapus sepatu yang tidak relevan lagi (Delete)

Dengan kata lain, program ini adalah asisten digital pribadi Anda dalam merapikan koleksi sepatu.

--- 

## 2.🔄 Alur Program 

Interaksi dengan program ini didesain sebagai percakapan yang logis, memandu pengguna melalui setiap langkah dengan jelas.

### **a.🏠Menu Utama**

Saat program pertama kali dijalankan, Anda akan langsung disambut oleh Menu Utama.
Di sinilah semua perjalanan dimulai. Menu berfungsi sebagai peta navigasi, tempat Anda memilih aksi apa yang ingin dilakukan: menambah sepatu, melihat koleksi, memperbarui data, atau menghapus sepatu.

➡️ Bisa dibilang, menu ini adalah "ruang kontrol" tempat Anda memberi instruksi pertama.


**Tampilan:**

<img width="325" height="123" alt="image" src="https://github.com/user-attachments/assets/4cd21aee-1fa2-4916-b890-041304ca02da" />
--- 

### **b.➕Membangun Koleksi: Operasi Create**

Pernah beli sepatu baru dan ingin langsung mencatatnya?
Itulah fungsi dari Create. Pilih opsi nomor 1

Saat memilih opsi ini, program akan mengajak Anda masuk ke mode input data. Anda cukup memasukkan detail sepatu:

~ Nama

~ Merek

~ Warna

~ Ukuran

Setelah selesai, data ini langsung diolah menjadi objek sepatu baru yang disimpan di memori. Dengan begitu, setiap sepatu dalam koleksi Anda punya identitas digital unik.

➡️ Ibaratnya, setiap kali menambahkan sepatu, Anda sedang "memajang" sepatu baru di rak digital.


**Tampilan:**

<img width="416" height="210" alt="image" src="https://github.com/user-attachments/assets/5ad6c59e-4249-48b6-a39a-b938b0bc0973" />
--- 

### **c.📖 Mengintip Isi Koleksi: Operasi Read**

Ingin tahu koleksi sepatu yang sudah tersimpan? Pilihlah opsi Read di nomor 2

Program akan menampilkan daftar sepatu dalam format terstruktur, lengkap dengan nomor urut agar mudah dikenali. Proses ini bekerja dengan cara mengiterasi (berjalan satu per satu) seluruh objek yang ada di memori, lalu menampilkannya di layar.

➡️ Hasilnya? Anda mendapat gambaran yang jelas: sepatu apa saja yang sudah ada, tanpa harus mengingat satu per satu.


**Tampilan:**

<img width="535" height="197" alt="image" src="https://github.com/user-attachments/assets/aa03c513-cf5d-48d7-a7da-5c524cb3cc43" />
--- 

### **d.✏️Koreksi dan Perbaikan: Operasi Update**

Kadang ada kesalahan input—misalnya warna tertulis "Biru" padahal seharusnya "Hitam".
Tenang, Anda tidak perlu menghapus dan menambahkan ulang.

Dengan memilih opsi Update di nomor 3, Anda cukup:

Memilih nomor urut sepatu yang ingin diperbaiki.
Memasukkan data baru yang benar.

Program kemudian akan langsung mengganti atribut lama dengan yang baru, tanpa menghapus seluruh objek.

➡️ Ibaratnya, Anda hanya mengganti label sepatu di rak, bukan membuang sepatu lama.

Setelah update, Anda bisa kembali ke menu Read untuk memastikan perubahan sudah tersimpan.

**Tampilan saat ingin memperbarui data:**

<img width="428" height="125" alt="image" src="https://github.com/user-attachments/assets/3dd22994-4015-42cd-aba3-abd21fa2c675" />

**Tampilan sebelum diubah:**

<img width="448" height="76" alt="image" src="https://github.com/user-attachments/assets/f2934882-be4c-417a-8a00-bf7848777e7e" />

Untuk melihat atau memastikan lagi apakah data sepatu sudah terubah, bisa kembali ke opsi 2 untuk melihat kembali daftar setelah di ubah

**Tampilan setelah diubah:**

<img width="532" height="82" alt="image" src="https://github.com/user-attachments/assets/2055812b-62d6-467b-9860-750290f433bb" />
--- 

### **e.❌Merapikan Koleksi: Operasi Delete**

Ada sepatu yang sudah rusak atau tidak lagi relevan?
Opsi Delete siap membantu dengan memilih nomor 4.

Caranya mirip dengan update: Anda memilih nomor urut sepatu yang ingin dihapus. Setelah dikonfirmasi, program akan menghapus objek tersebut secara permanen dari daftar.

➡️ Sama seperti membersihkan rak sepatu fisik, fitur ini menjaga koleksi digital Anda tetap rapi dan teratur.


**Tampilan sebelum dihapus:**

<img width="552" height="79" alt="image" src="https://github.com/user-attachments/assets/92777487-f9dd-4d6e-a907-9e2091ddde0b" />

**Tampilan saat ingin menghapus salah satu koleksi sepatu:**

<img width="428" height="162" alt="image" src="https://github.com/user-attachments/assets/dd05b716-2506-4e6d-814b-b4ffbe8dd091" />

**Tampilan setelah salah satu koleksi sepatu sudah di hapus:**

<img width="432" height="59" alt="image" src="https://github.com/user-attachments/assets/650a9941-35dc-4d0e-866b-ecdc372cdb59" />
--- 

### **f.🏠Main Menu: Navigasi Utama Program**

Ada kalanya Anda sudah selesai menggunakan aplikasi dan ingin menutupnya dengan aman.
Di situlah opsi 5 (Keluar) berfungsi.

Caranya sederhana: Anda cukup mengetik angka 5 pada menu utama.
Setelah itu, program akan langsung menghentikan semua proses dan menampilkan pesan penutup


**Tampilan:**

<img width="408" height="140" alt="image" src="https://github.com/user-attachments/assets/c667b2a8-1949-4e4e-ae6e-b666c48f6e46" />
--- 

## 3.🎯 Kesimpulan

CRUDApp 👟 adalah aplikasi sederhana berbasis konsol yang membantu mengelola koleksi sepatu secara digital melalui fitur Create ➕, Read 📖, Update ✏️, dan Delete ❌. Dengan struktur kode berbasis OOP, program ini berjalan teratur dan mudah dipahami, sehingga cocok digunakan baik untuk latihan pemrograman maupun kebutuhan sederhana sehari-hari. Singkatnya, CRUDApp adalah contoh nyata bagaimana teknologi dapat membuat pengelolaan data jadi lebih praktis, rapi, dan efisien ⚡.




































