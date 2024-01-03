package Javatpoin;

// Antarmuka atau interface
interface Suara {
    void bersuara();
}

// Kelas yang mengimplementasikan antarmuka Suara
class Anjing implements Suara {
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

// Kelas lain yang juga mengimplementasikan antarmuka Suara
class Kucing implements Suara {
    @Override
    public void bersuara() {
        System.out.println("Meow!");
    }
}

class Manusia implements Suara {
    @Override
    public void bersuara() {
        System.out.println("Iki suroboyo cookkk");
    }
}


public class muka {
    public static void main(String[] args) {
        // Membuat objek dari kelas Anjing dan Kucing
        Anjing anjing = new Anjing();
        Kucing kucing = new Kucing();
        Manusia manusia = new Manusia();

        // Memanggil metode bersuara() dari objek Anjing
        anjing.bersuara();

        // Memanggil metode bersuara() dari objek Kucing
        // kucing.bersuara();

        //manusia ku panggil
        manusia.bersuara();
    }
}


// buat pr ya kak