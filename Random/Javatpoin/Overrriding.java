package Javatpoin;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass overriding method from the superclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // New method specific to Dog class
    void fetch() {
        System.out.println("Fetching the ball");
    }
}

class Babi extends Animal {
    @Override
    void makeSound() {
        System.out.println("ninuninuniuiuiuiu");
    }

//     // New method specific to Dog class
//     void fetch() {
//         System.out.println("Fetching the ball");
//     }
}

public class Overrriding {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog myDog = new Dog();

        // Calling the overridden method
        myDog.makeSound(); // This will print "Bark! Bark!"

        // Calling the method specific to Dog class
        myDog.fetch(); // This will print "Fetching the ball"

        myDog.makeSound();
    }
}
