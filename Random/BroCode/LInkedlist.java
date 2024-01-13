package BroCode;

import java.util.LinkedList;
import java.util.Scanner;

class TiketKonser {
    String namaKonser;
    int harga;

    public TiketKonser(String namaKonser, int harga) {
        this.namaKonser = namaKonser;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Konser: " + namaKonser + ", Harga: " + harga;
    }
}

public class LInkedlist {
    public static void main(String[] args) {
        LinkedList<TiketKonser> daftarTiket = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa tiket konser ke dalam LinkedList
        daftarTiket.add(new TiketKonser(
            "Konser A", 
            100000));
        daftarTiket.add(new TiketKonser(
            "Konser B", 
            80000));
        daftarTiket.add(new TiketKonser(
            "Konser C", 
            120000));

        // Menampilkan daftar tiket
        System.out.println("Daftar Tiket Konser:");
        for (TiketKonser tiket : daftarTiket) {
            System.out.println(tiket);
        }

        // Proses pembelian tiket
        System.out.print("\nMasukkan nama konser yang akan dibeli: ");
        String konserYangDibeli = scanner.nextLine();

        // Mencari tiket berdasarkan nama konser
        TiketKonser tiketDibeli = null;
        for (TiketKonser tiket : daftarTiket) {
            if (tiket.namaKonser.equalsIgnoreCase(konserYangDibeli)) {
                tiketDibeli = tiket;
                break;
            }
        }

        // Menampilkan hasil pembelian
        if (tiketDibeli != null) {
            System.out.println("\nAnda telah membeli tiket:");
            System.out.println(tiketDibeli);
        } else {
            System.out.println("\nMaaf, tiket untuk konser tersebut tidak ditemukan.");
        }

        scanner.close();
    }
}
