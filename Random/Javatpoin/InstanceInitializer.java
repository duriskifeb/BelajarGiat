package Javatpoin;

public class InstanceInitializer {
    // Instance Initializer Block
    {
        System.out.println("Hello Mbak");
        System.out.println();
    }

    // Constructor
    public InstanceInitializer() {
        System.out.println("Hello cak");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating an object of the class
        InstanceInitializer example = new InstanceInitializer();
    }
}
