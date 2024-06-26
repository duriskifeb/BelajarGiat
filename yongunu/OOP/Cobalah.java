package OOP;

import java.util.Scanner;

public class Cobalah {
       public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        System.out.println();

        gambar(inputPanjang,inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));
        
        System.out.println();
        tampilkanKelilingDanLuas(inputPanjang,inputLebar);

    }

    private static void tampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));
        
        System.out.println();
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
}