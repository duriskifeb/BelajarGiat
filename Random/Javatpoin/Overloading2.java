package Javatpoin;

public class Overloading2 {

    static double maxNumber(double a, double b) {
        if (a < b) {
            return a;

        }else {
            return b;
        }
    }

    static int maxNumber(int a, int b){
        if (a < b) {
            return a;
        }else {
            return b;
        }
    }


    public static void main(String[] args) {
        System.out.println("wayang ki seno");
        System.out.println(maxNumber(10.5, 7.5));
        System.out.println(maxNumber(10, 20));
    }
}

