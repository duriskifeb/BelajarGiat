package BroCode.AlgoritmaData.Stack;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        // Membuat objek Stack
        Stack<String> stack = new Stack<>();

        // Menambahkan elemen ke dalam Stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        // Mencari posisi indeks elemen "C++" dalam Stack
        int index = stack.search("C++");

        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Elemen 'C++' ditemukan pada indeks: " + index);
        } else {
            System.out.println("Elemen 'C++' tidak ditemukan dalam Stack.");
        }
    }
}

