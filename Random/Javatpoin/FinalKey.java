package Javatpoin;

public class FinalKey {
    public static void main(String[] args) {
        // Contoh variabel final
        final int angkaTetap = 10;
        System.out.println("Nilai variabel tetap: " + angkaTetap);

        // Contoh metode final
        KelasInduk kelasInduk = new KelasInduk();
        kelasInduk.metodeFinal();

        // Contoh kelas final
        KelasFinal kelasFinal = new KelasFinal();
        kelasFinal.metodeBiasa();
    }
}

// Contoh metode final dan kelas final digabungkan di dalam satu file

class KelasInduk {
    // Metode final tidak dapat di-override oleh kelas anak
    public final void metodeFinal() {
        System.out.println("Ini adalah metode final.");
    }
}

final class KelasFinal {
    public void metodeBiasa() {
        System.out.println("Metode dalam kelas final.");
    }
}
