package BroCode;

public class Konstruktor2 {
    
    String name;
    int age;
    double weight;

    Konstruktor2 (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void mangan() {
        System.out.println(this.name +" makan o kesehatanmu loh");
    }

    void drink() {
        System.out.println(this.age + "umur mu yaa..!");
    }
}
