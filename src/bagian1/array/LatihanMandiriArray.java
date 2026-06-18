/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author HP
 */
public class LatihanMandiriArray {
     public static void main(String[] args) {
        // --- Nomor 1: Suhu Tertinggi dan Terendah ---
        System.out.println("=== Nomor 1: Analisis Suhu ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Suhu Tertinggi: " + max + "°C");
        System.out.println("Suhu Terendah : " + min + "°C\n");

        // --- Nomor 2: Nama Hari Lebih dari 5 Huruf ---
        System.out.println("=== Nomor 2: Nama Hari > 5 Huruf ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        System.out.println();

        // --- Nomor 3: Menghitung Angka Genap ---
        System.out.println("=== Nomor 3: Hitung Bilangan Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah angka genap: " + genap);
    }
}