package WICO.ViewModel;

import java.util.ArrayList;
import java.util.Scanner; // Import Scanner class
import WICO.DataModel.Product;
import WICO.Database.DataProduct;
import WICO.util.Util;

public class ViewMakanan {
    DataProduct dataPrdk = new DataProduct();
    Scanner scanner = new Scanner(System.in); // Create Scanner object

    public void showALLProduct() {

        ArrayList<Product> productList = dataPrdk.getListproduct();

        // Check if the list is empty
        if (productList.isEmpty()) {
            System.out.println("Daftar nama Makanan & Minuman: Tidak ada produk yang tersedia.\n");
        } else {
            // If the list is not empty, print the list of food products
            System.out.println("Pilih salah satu opsi : \n");
            System.out.println("1. Tampilkan semua menu makanan");
            System.out.println("2. Beli makanan");

            // Get user's choice
            int choice = getUserChoice();

            // Process user's choice
            switch (choice) {
                case 1:
                    Util.cls();
                    showProducts(productList);
                    // showALLProduct();
                    break;
                case 2:
                    // Add your code for other options here
                    System.out.println("Beli - Beli disini :");
                    
                    break;
                case 0:
                    showALLProduct();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Method to get user's choice
    private int getUserChoice() {
        System.out.print("\nMasukkan pilihan Anda : "); // Prompt user for input
        int choice = scanner.nextInt(); // Read user's input
        scanner.nextLine(); // Consume newline character after reading integer input
        System.out.print("\n"); // Print user's
        return choice;

    }

    // Method to show all products || cek status barang
    private void showProducts(ArrayList<Product> productList) {
        System.out.println("Daftar nama Makanan : \n");
        
        int index = 1;
        for (Product product : productList) {
            String status = product.getStatusBarang();
            String statusMessage;

            // Menentukan pesan berdasarkan status barang
            if (status.equalsIgnoreCase("tersedia")) {
                statusMessage = " - Barang Tersedia";
            } else if (status.equalsIgnoreCase("habis")) {
                statusMessage = " - Barang Habis";
            } else {
                statusMessage = " - Status tidak diketahui";
            }

            if (index == 3) {
                statusMessage = " - Maaf, Barang tidak tersedia atau habis";
            }

            System.out.println((index++) + ". " + product.getNamaBarang() + statusMessage);
        }
        System.out.println("\n===========================================");
    }
}
