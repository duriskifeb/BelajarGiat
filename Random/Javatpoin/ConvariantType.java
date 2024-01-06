package Javatpoin;


class Fruit {
    String getTaste() {
        return "Generic taste";
    }
}

class Apple extends Fruit {
    @Override
    String getTaste() {
        return "Sweet and crisp";
    }
}

class Orange extends Fruit {
    @Override
    String getTaste() {
        return "Juicy and tangy";
    }
}

public class ConvariantType {
    public static void main(String[] args) {
        Fruit fruit1 = new Apple();
        Fruit fruit2 = new Orange();

        System.out.println("Taste of fruit1: " + fruit1.getTaste());
        System.out.println("Taste of fruit2: " + fruit2.getTaste());
    }
}
