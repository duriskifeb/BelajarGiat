package BroCode;

public class Konstruktor {
    public static void main(String[] args) {
        System.out.println("pagi ndann...?");

        Konstruktor2 pagi = new Konstruktor2("Joni",86,70);
        Konstruktor2 siang = new Konstruktor2("Junrny",16,50);

        pagi.mangan();
        siang.drink();
    }
}
