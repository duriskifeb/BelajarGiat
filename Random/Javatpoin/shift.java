package Javatpoin;

public class shift {
    public static void main(String[] args) {
        
        int nilaiAwal = 10;
        // Operator left shift (<<)
        int hasilLeftShift = nilaiAwal << 4; // Pergeseran ke kiri sebanyak 2 bit
        System.out.println("Hasil Left Shift: " + hasilLeftShift);
    
        // Operator right shift (>>)
        int nilaiRightShift = 20;
        int hasilRightShift = nilaiRightShift >> 2; // Pergeseran ke kanan sebanyak 2 bit
        System.out.println("Hasil Right Shift: " + hasilRightShift);
    
        // Operator zero fill right shift (>>>)
        int nilaiZeroFillRightShift = -15;
        int hasilZeroFillRightShift = nilaiZeroFillRightShift >>> 2; // Pergeseran ke kanan sebanyak 2 bit dengan zero fill
        System.out.println("Hasil Zero Fill Right Shift: " + hasilZeroFillRightShift);
    }
}

