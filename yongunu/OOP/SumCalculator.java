package OOP;

public class SumCalculator {

    public static int sum(int n, int[] S) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += S[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 }; // Contoh array
        int n = numbers.length; // Jumlah elemen

        int total = sum(n, numbers);
        System.out.println("Total sum: " + total);
    }
}
