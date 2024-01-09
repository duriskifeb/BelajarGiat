package BroCode.AlgoritmaData.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Stack
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke dalam tumpukan
        stack.push("Elemen 1");
        stack.push("Elemen 2");
        stack.push("Elemen 3");

        // Mengakses elemen teratas tanpa menghapusnya
        System.out.println("Elemen teratas: " + stack.peek());

        // Menghapus dan menampilkan elemen teratas
        System.out.println("Elemen yang dihapus: " + stack.pop());

        // Mengecek apakah tumpukan kosong
        System.out.println("Apakah tumpukan kosong? " + stack.empty());
    }
}
