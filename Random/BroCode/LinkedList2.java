package BroCode;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        // 1. Penambahan Elemen
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("pen");
        System.out.println("1. LinkedList setelah penambahan: " + linkedList);

        // 2. Pengaksesan dan Pencarian Elemen
        String elementAtIndex = linkedList.get(1);
        String elementAtIndexan = linkedList.get(3);
        int index = linkedList.indexOf("Banana");
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("2. Elemen pada indeks 1: " + elementAtIndex);
        System.out.println("   Indeks dari 'Banana': " + index);
        System.out.println("   Apakah 'Banana' ada di dalam linkedList? " + containsBanana);

        // 3. Penghapusan Elemen
        String removedElement = linkedList.remove();
        linkedList.remove(1);
        boolean removed = linkedList.remove("Banana");
        System.out.println("3. Elemen yang dihapus: " + removedElement);
        System.out.println("   Apakah 'Banana' berhasil dihapus? " + removed);
        System.out.println("   LinkedList setelah penghapusan: " + linkedList);

        // 4. Manipulasi Struktur Linked List
        linkedList.clear();
        boolean isEmpty = linkedList.isEmpty();
        // int size = linkedList.size();
        System.out.println("4. LinkedList setelah dihapus semua elemen: " + linkedList);
        System.out.println("   Apakah linkedList kosong? " + isEmpty);
        System.out.println("   Jumlah elemen dalam linkedList: " + linkedList);

        // 5. Operasi Khusus Linked List
        linkedList.add(0, "Strawberry");
        linkedList.addLast("Pineapple");
        System.out.println("5. LinkedList setelah penambahan di indeks 0 dan di akhir: " + linkedList);
    }
}
