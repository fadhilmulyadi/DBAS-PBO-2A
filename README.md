# DBAS-PBO-2A
## Deskripsi Proyek

Proyek ini adalah sebuah permainan berbasis Java yang dinamakan **Dynamic Block Allocation System**. Permainan ini terinspirasi oleh permainan klasik Tetris, di mana pemain harus mengatur blok-blok yang jatuh untuk membentuk garis horizontal tanpa celah. Pemain dapat menggerakkan dan memutar blok untuk mengisi ruang yang tersedia. Permainan ini juga dilengkapi dengan efek suara dan musik latar untuk meningkatkan pengalaman bermain.

## Struktur Class

Berikut adalah struktur class yang terdapat dalam proyek ini:

- **main**
  - `Main`: Kelas utama yang menjalankan aplikasi dan mengatur jendela permainan.
  - `GamePanel`: Kelas yang mengatur panel permainan, termasuk pengaturan tampilan dan loop permainan.
  - `InputHandler`: Kelas yang menangani input dari keyboard untuk menggerakkan blok.
  - `PlayManager`: Kelas yang mengelola logika permainan, termasuk pengaturan blok, pengecekan garis yang dihapus, dan skor.
  - `Soound`: Kelas yang mengatur pemutaran efek suara dan musik latar.

- **mino**
  - `Block`: Kelas yang merepresentasikan blok dalam permainan.
  - `Mino`: Kelas dasar untuk semua jenis blok (tetromino) yang memiliki metode untuk mengatur posisi dan memeriksa tabrakan.
  - `Mino_Bar`, `Mino_L1`, `Mino_L2`, `Mino_Square`, `Mino_T`, `Mino_Z1`, `Mino_Z2`: Kelas-kelas yang merepresentasikan berbagai bentuk tetromino yang berbeda.

## Cara Menjalankan Program

Untuk menjalankan program ini, ikuti langkah-langkah berikut:

1. **Persyaratan**: Pastikan Anda memiliki Java Development Kit (JDK) terinstal di komputer Anda. Anda dapat mengunduhnya dari [situs resmi Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Kompilasi**: Buka terminal atau command prompt, navigasikan ke direktori proyek, dan jalankan perintah berikut untuk mengkompilasi semua file Java:
   ```bash
   javac main/*.java mino/*.java
   ```

3. **Menjalankan Program**: Setelah kompilasi selesai, jalankan program dengan perintah berikut:
   ```bash
   java main.Main
   ```

# Kontrol Permainan

Dalam permainan **Dynamic Block Allocation System**, Anda dapat mengontrol blok yang jatuh menggunakan keyboard. Berikut adalah penjelasan lengkap mengenai kontrol permainan:

## Kontrol Dasar

- **Tombol Panah Atas (↑)**: 
  - **Fungsi**: Memutar blok saat ini.
  - **Deskripsi**: Menekan tombol ini akan memutar blok ke arah yang sesuai, memungkinkan Anda untuk menyesuaikan posisi blok agar lebih cocok dengan ruang yang tersedia.

- **Tombol Panah Bawah (↓)**: 
  - **Fungsi**: Menurunkan blok saat ini.
  - **Deskripsi**: Menekan tombol ini akan membuat blok bergerak ke bawah satu langkah. Jika blok tidak menyentuh bagian bawah atau blok statis lainnya, blok akan turun.

- **Tombol Panah Kiri (←)**: 
  - **Fungsi**: Menggerakkan blok ke kiri.
  - **Deskripsi**: Menekan tombol ini akan memindahkan blok saat ini ke kiri satu langkah, selama tidak ada tabrakan dengan batas kiri atau blok statis lainnya.

- **Tombol Panah Kanan (→)**: 
  - **Fungsi**: Menggerakkan blok ke kanan.
  - **Deskripsi**: Menekan tombol ini akan memindahkan blok saat ini ke kanan satu langkah, selama tidak ada tabrakan dengan batas kanan atau blok statis lainnya.

## Kontrol Tambahan

- **Tombol Spasi**: 
  - **Fungsi**: Menjeda dan melanjutkan permainan.
  - **Deskripsi**: Menekan tombol spasi akan menghentikan permainan jika sedang berjalan. Jika permainan dijeda, menekan tombol spasi lagi akan melanjutkan permainan. Saat permainan dijeda, musik latar akan berhenti, dan saat dilanjutkan, musik akan diputar kembali.

## Catatan

- **Posisi Blok**: Pastikan untuk memutar dan menggerakkan blok dengan bijak agar dapat mengisi ruang yang tersedia tanpa meninggalkan celah. Jika blok tidak dapat ditempatkan dengan benar, permainan akan berakhir.
  
- **Cherry On Top**: Setiap kali Anda memutar atau menggerakkan blok, efek suara akan diputar untuk memberikan umpan balik kepada pemain.

Selamat bermain! Barudak, Well!
