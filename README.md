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

4. **Kontrol Permainan**:
   - Gunakan tombol panah (↑, ↓, ←, →) untuk menggerakkan dan memutar blok.
   - Tekan tombol spasi untuk menjeda permainan.

Selamat bermain!
