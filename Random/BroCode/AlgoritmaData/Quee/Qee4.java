package BroCode.AlgoritmaData.Quee;

import java.util.LinkedList;
import java.util.Queue;

public class Qee4 {
    public static void main(String[] args) {
        // Membuat objek Queue dengan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian
        antrian.offer("Elemen 1");
        antrian.offer("Elemen 2");
        antrian.offer("Elemen 3");

        // Menampilkan elemen-elemen dalam antrian menggunakan loop
        System.out.println("Elemen-elemen dalam antrian:");
        for (String elemen : antrian) {
            System.out.println(elemen);
        }

        antrian.add("elemen 4");

        System.out.println("\nElemen-elemen setelah penambahan:");
        for (String elemen : antrian) {
            System.out.println(elemen);
        }
    }
}
