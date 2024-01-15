package ProjectMe;

import java.util.ArrayList;
import java.util.Scanner;

class Pembelian {
    private String namaBarang;
    private double harga;
    private int jumlah;

    public Pembelian(String namaBarang, double harga, int jumlah) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + namaBarang + ", Harga: " + harga + ", Jumlah: " + jumlah + ", Total Harga: "
                + getTotalHarga();
    }
}

class Transaksi {
    private ArrayList<Pembelian> daftarPembelian = new ArrayList<>();

    public void tambahPembelian(Pembelian pembelian) {
        daftarPembelian.add(pembelian);
    }

    public void tampilkanTransaksi() {
        for (Pembelian pembelian : daftarPembelian) {
            System.out.println(pembelian);
        }
    }

    public double getTotalTransaksi() {
        double totalTransaksi = 0;
        for (Pembelian pembelian : daftarPembelian) {
            totalTransaksi += pembelian.getTotalHarga();
        }
        return totalTransaksi;
    }
}

public class Testas {
    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama barang (selesai untuk mengakhiri): ");
            String namaBarang = scanner.next();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();

            System.out.print("Masukkan jumlah barang: ");
            int jumlah = scanner.nextInt();

            Pembelian pembelian = new Pembelian(namaBarang, harga, jumlah);
            transaksi.tambahPembelian(pembelian);
        }

        System.out.println("\nDetail Transaksi:");
        transaksi.tampilkanTransaksi();

        System.out.println("\nTotal Transaksi: " + transaksi.getTotalTransaksi());

        // Tutup scanner setelah digunakan
        scanner.close();
    }
}
