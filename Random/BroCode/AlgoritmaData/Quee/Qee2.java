package BroCode.AlgoritmaData.Quee;

import java.util.LinkedList;
import java.util.Queue;

public class Qee2 {
    public static void main(String[] args) {
        // Membuat objek Queue dengan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        antrian.add("Elemen 1");
        antrian.offer("Elemen 2");
        antrian.add("Elemen 3");
        antrian.add("Elemen 4");
        antrian.add("Elemen 5");

        // Menghapus dan menampilkan elemen pertama dari antrian
        System.out.println("Elemen pertama yang dihapus: " + antrian.remove());
        System.out.println("Elemen yang diambil (jika ada): " + antrian.poll());

        // Mengakses elemen pertama tanpa menghapusnya
        System.out.println("Elemen pertama: " + antrian.element());
        System.out.println("Elemen teratas (jika ada): " + antrian.peek());

        // Mengecek jumlah elemen dalam antrian
        System.out.println("Jumlah elemen dalam antrian: " + antrian.size());

        // Memeriksa apakah antrian kosong
        System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
    }
}

