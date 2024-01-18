package OOP;

public class Tes {
    public static void main(String[] args) throws InterruptedException {
        String text = "Bergerak terus menerus ke Kiri ";
        int delay = 100; // milidetik

        while (true) {
            System.out.print("\r" + text);
            Thread.sleep(delay);

            // Geser karakter ke kiri
            text = text.substring(1) + text.charAt(0);
        }
    }
}
