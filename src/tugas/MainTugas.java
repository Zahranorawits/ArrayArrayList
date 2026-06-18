/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
// Nama : Fatimatuzzahra
// NPM  : 2410010610


/**
 *
 * @author HP
 */
public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Menyimpan daftar nama matkul di Array dan menampilkannya
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Pemrograman Web", "Logika Fuzzy"};
        System.out.println("==============================================");
        System.out.println("          SISTEM INFORMASI AKADEMIK           ");
        System.out.println("==============================================");
        System.out.println("Daftar Mata Kuliah Diambil:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(" [" + (i + 1) + "] " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        // Poin 5: Input minimal 5 data mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "240101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "240102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "240103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "240104", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "240105", 45.0));

        System.out.println("=== ANALISIS DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Kelas   : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println("Total Mahasiswa Terdaftar: " + kelas.dapatkanJumlahMahasiswa());
        System.out.println();

        // Poin 6: Menambahkan satu data mahasiswa baru secara dinamis
        System.out.println("[SISTEM] Memasukkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Farhan", "240106", 80.0));
        System.out.println();

        // Menampilkan kembali analisis tabel terbaru setelah ada penambahan data
        System.out.println("=== ANALISIS DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println("Total Mahasiswa Terbaru : " + kelas.dapatkanJumlahMahasiswa());
    }
}