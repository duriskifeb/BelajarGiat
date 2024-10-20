package WesLah;

import java.util.Scanner;

public class IntegrasiContoh {

    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        // Menghitung hasil integrasi (penjumlahan dalam contoh ini)
        double hasil = integrasi(angkaPertama, angkaKedua);

        System.out.println("Hasil integrasi: " + hasil);

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengintegrasikan dua angka (penjumlahan)
    public static double integrasi(double a, double b) {
        return a + b;
    }
}
