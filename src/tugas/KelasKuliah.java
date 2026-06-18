/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }

    public int dapatkanJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    public void tampilkanSemua() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-12s %-12s %-10s %-12s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-12s %-12s %-10.2f %-12s\n", m.getNpm(), m.getNama(), m.getNilai(), status);
        }
        System.out.println("--------------------------------------------------");
    }
}