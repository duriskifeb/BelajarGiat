package Oop_ya.Dicoding;

public class Hewanan2 {
    public static void main(String[] args) {
        System.out.println();
        Hewanan Elang = new Hewanan("Elang");
        Hewanan Kucing = new Hewanan("Kucing");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
        System.out.println();
    }
}

