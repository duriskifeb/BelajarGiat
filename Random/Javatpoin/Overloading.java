package Javatpoin;

public class Overloading {
    
    // Metode overloading dengan dua parameter tipe int
    public int abubakar(int a, int b) {
        return a + b;
    }

    // Metode overloading dengan tiga parameter tipe double
    public double abubakar(double a, double b, double c) {
        return a + b + c;
    }
    
    public double nyar(double e, double f, double g) {
        return e - f / g;
    }
    // Metode overloading dengan dua parameter tipe String
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Overloading example = new Overloading();

        // Memanggil metode dengan dua parameter tipe int
        int sumInt = example.abubakar(5, 10);
        System.out.println("Hasil penjumlahan int: " + sumInt);

        // Memanggil metode dengan tiga parameter tipe double
        double sumDouble = example.abubakar(2.5, 3.5, 1.5);
        System.out.println("Hasil penjumlahan double: " + sumDouble);
        
        // Memanggil metode dengan tiga parameter tipe double
        double barusaja = example.nyar(2.5, 3.5, 1.5);
        System.out.println("Hasil penjumlahan kurang jumlah : " + barusaja);


        // Memanggil metode dengan dua parameter tipe String
        String resultString = example.concatenate("Hello, ", "World!");
        System.out.println("Hasil penggabungan string: " + resultString);
    }
}
