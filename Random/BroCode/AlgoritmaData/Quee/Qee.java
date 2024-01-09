package BroCode.AlgoritmaData.Quee;

import java.util.LinkedList;
import java.util.Queue;

public class Qee {
    public static void main(String[] args) {
        // Membuat objek Queue dengan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        antrian.add("Riski gusdur");
        antrian.add("Irpan yai");
        antrian.add("Aril noah");

        // Menghapus dan menampilkan elemen pertama dari antrian
        System.out.println("Elemen pertama yang dihapus: " + antrian.remove());

        // Mengakses elemen pertama tanpa menghapusnya
        System.out.println("Elemen pertama: " + antrian.element());

        // Mengecek jumlah elemen dalam antrian
        System.out.println("Jumlah elemen dalam antrian  : " + antrian.size());
    }
}

