package BroCode.AlgoritmaData.Stack;

import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Stack<String> apalu = new Stack<>();

        apalu.push("ini nama saaya");
        apalu.push("ini nama Budi");
        apalu.push("ini nama Bapak budi");
        apalu.push("ini nama ibu budi");

        // Mencari posisi di index
        int carilah = apalu.search("ini nama saaya");


        //menampilkan pencarian
        if (carilah != -1) {
            System.out.println(" ini yang kamu cari " + carilah);
        }else {
            System.out.println("pilihan e ga ketemu sorry yee..");
        }

    }
}
