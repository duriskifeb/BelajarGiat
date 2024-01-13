package 

import java.util.Scanner;

public class Tes {
    private String name;
    private int age;

    public Tes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama: ");
        String inputName = scanner.nextLine();

        // Meminta pengguna untuk memasukkan umur
        System.out.print("Masukkan umur: ");
        int inputAge = scanner.nextInt();

        // Membuat objek Person berdasarkan input pengguna
        Person person = new Person(inputName, inputAge);

        // Menampilkan hasil
        System.out.println("\nInformasi Person:");
        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
    }
}
