/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        // --- Nomor 1: Daftar Belanja ---
        System.out.println("=== NOMOR 1: ANALISIS DAFTAR BELANJA ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Gula");
        
        System.out.println("Daftar awal           : " + daftarBelanja);
        daftarBelanja.remove(1); // Menghapus item ke-2 (indeks 1 = Minyak Goreng)
        System.out.println("Daftar setelah dihapus: " + daftarBelanja);
        System.out.println("Jumlah akhir item     : " + daftarBelanja.size() + " item\n");

        // --- Nomor 2: Nilai Terbesar ---
        System.out.println("=== NOMOR 2: ANALISIS NILAI TERBESAR ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); nilai.add(95); nilai.add(60); nilai.add(88); nilai.add(75);
        System.out.println("Daftar nilai masuk    : " + nilai);
        
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Nilai Terbesar di dalam list: " + max + "\n");

        // --- Nomor 3: Nama Berawalan Huruf 'A' ---
        System.out.println("=== NOMOR 3: FILTER NAMA BERAWALAN 'A' ===");
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);
        
        System.out.println("Semua data nama: " + nama);
        System.out.println("Nama yang berawalan huruf 'A':");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    } // Penutup method main
} // Penutup class