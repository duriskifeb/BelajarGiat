package BroCode.AlgoritmaData.Stack;

import java.util.Stack;

public class Main6 {
    public static void main(String[] args) {
        // Membuat objek Stack
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke dalam tumpukan
        stack.push("Elemen 1");
        stack.push("Elemen 2");
        stack.push("Elemen 3");

        // Menggunakan metode peek untuk melihat elemen teratas tanpa menghapusnya
        String elemenTeratas = stack.peek();
        System.out.println("Elemen teratas (tanpa menghapus): " + elemenTeratas);

        // Menggunakan metode pop untuk menghapus dan mengembalikan elemen teratas
        String elemenDihapus = stack.pop();
        System.out.println("Elemen yang dihapus: " + elemenDihapus);

        // Menampilkan sisa elemen dalam tumpukan
        System.out.println("Sisa elemen dalam tumpukan setelah pop:");
        for (String elemen : stack) {
            System.out.println(elemen);
        }

        // Menambahkan elemen baru ke dalam tumpukan setelah operasi pop
        stack.push("Elemen Baru");

        // Menampilkan sisa elemen dalam tumpukan setelah penambahan
        System.out.println("Sisa elemen dalam tumpukan setelah penambahan:");
        for (String elemen : stack) {
            System.out.println(elemen);
        }
    }
}
