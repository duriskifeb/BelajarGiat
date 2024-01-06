package Javatpoin;


class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String color = "Black";

    void displayColor() {
        // Mengakses variabel color dari kelas anak (subclass)
        System.out.println("Dog color: " + color);

        // Mengakses variabel color dari kelas induk (superclass) menggunakan super
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        // Memanggil metode eat dari kelas anak (subclass)
        System.out.println("Dog is eating...");

        // Memanggil metode eat dari kelas induk (superclass) menggunakan super
        super.eat();
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Memanggil metode displayColor yang ada di kelas Dog
        myDog.displayColor();

        System.out.println();

        // Memanggil metode eat yang ada di kelas Dog
        myDog.eat();
    }
}
