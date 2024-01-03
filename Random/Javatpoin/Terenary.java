package Javatpoin;

public class Terenary {
    public static void main(String[] args) {
        int angka = 10;

        // Operator Ternary untuk mengecek apakah angka genap atau ganjil
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(angka + " adalah bilangan " + hasil);

        // Operator Ternary untuk menentukan nilai maksimum dari dua angka
        int angka1 = 25;
        int angka2 = 18;
        int maksimum = (angka1 > angka2) ? angka1 : angka2;
        System.out.println("Nilai maksimum antara " + angka1 + " dan " + angka2 + " adalah " + maksimum);
    }
}
