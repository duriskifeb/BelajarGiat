package OjoNesu;

public class overloaded {
    public static void main(String[] args) {
        int i = add(1,2);
        System.out.println(i);


    }

    static int add(int a, int b) {
        System.out.println("ini yang pertama : ");
        return a + b;
    }
    static int add1(int a, int b) {
        System.out.println("ini yang pertama 1 : ");
        return a + b;
    }
    static int add2(int a, int b) {
        System.out.println("ini yang pertama 2 : ");
        return a + b;
    }
}
