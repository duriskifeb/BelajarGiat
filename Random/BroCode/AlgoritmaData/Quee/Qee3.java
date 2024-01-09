package BroCode.AlgoritmaData.Quee;

import java.util.LinkedList;
import java.util.Queue;

public class Qee3 {
    public static void main(String[] args) {
        // Membuat objek Queue dengan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        antrian.offer("Elemen 1");
        antrian.offer("Elemen 2");
        antrian.offer("Elemen 3");

        // Menggunakan metode poll untuk menghapus dan mengembalikan elemen pertama
        String elemenPertama = antrian.poll();
        System.out.println("Elemen yang diambil dengan poll: " + elemenPertama);

        // Menggunakan metode peek untuk mengakses elemen pertama tanpa menghapusnya
        String elemenTeratas = antrian.peek();
        System.out.println("Elemen teratas (tanpa menghapus): " + elemenTeratas);

        // Menampilkan sisa elemen dalam antrian
        System.out.println("Sisa elemen dalam antrian:");
        for (String elemen : antrian) {
            System.out.println(elemen);
        }
    }
}
