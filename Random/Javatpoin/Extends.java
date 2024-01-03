package Javatpoin;


// Kelas induk atau superclass
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Manusia {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
} 

class yanto extends Manusia {
    void ngomong() {
        System.out.println("hallo yantoo..!!");
    }
}

// Kelas anak atau subclass yang extends dari Hewan
class Kucing extends Hewan {
    void bersuaranya() {
        System.out.println("Meow!");
    }
}



public class Extends {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak (Kucing)
        Kucing kucing = new Kucing();

        // Memanggil metode yang diwarisi dari kelas induk (Hewan)
        kucing.makan();

        // Memanggil metode yang ada di kelas anak (Kucing)
        kucing.bersuaranya();
        
        kucing.makan();

        
        
    }
}
