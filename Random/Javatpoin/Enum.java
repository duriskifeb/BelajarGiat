package Javatpoin;
import java.util.Scanner;

// Deklarasi enum
enum Hari {
    SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
}

public class Enum {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan hari (SENIN, SELASA, ..., MINGGU): ");
        String inputHari = scanner.nextLine().toUpperCase(); // Mengonversi input menjadi huruf besar

        // Memeriksa apakah input sesuai dengan nilai enum
        try {
            Hari hariIni = Hari.valueOf(inputHari);
            
            // Menggunakan enum dalam switch statement
            switch (hariIni) {
                case SENIN:
                    System.out.println("Hari ini adalah Senin");
                    break;
                case SELASA:
                    System.out.println("Hari ini adalah Selasa");
                    break;
                case RABU:
                    System.out.println("Hari ini adalah Rabu");
                    break;
                case KAMIS:
                    System.out.println("Hari ini adalah Kamis");
                    break;
                case JUMAT:
                    System.out.println("Hari ini adalah Jumat");
                    break;
                case SABTU:
                    System.out.println("Hari ini adalah Sabtu");
                    break;
                case MINGGU:
                    System.out.println("Hari ini adalah Minggu");
                    break;
                default:
                    System.out.println("Hari ini tidak diketahui");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan nama hari dengan benar.");
        } finally {
            scanner.close();
        }
    }
}
