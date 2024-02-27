package WICO.ViewModel;

import java.util.ArrayList;
import java.util.Scanner; // Import Scanner class
import WICO.DataModel.Product;
import WICO.Database.DataProduct;
import WICO.util.Util;

public class ViewPrdk {
    DataProduct dataPrdk = new DataProduct();
    Scanner scanner = new Scanner(System.in); // Create Scanner object

    public void showALLProduct() {
        // Print welcome message
        System.out.println("|___________________________________________|");
        System.out.println("| --o0 Selamat datang di Aplikasi kami 0o-- |");
        System.out.println("|-------------------------------------------|\n");

        // Get list of products
        ArrayList<Product> productList = dataPrdk.getListproduct();

        // Check if the list is empty
        if (productList.isEmpty()) {
            // If the list is empty, print a message
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
                    showProducts(productList);
                    // Util.cls();
                    break;
                case 2:
                    // Add your code for other options here
                    System.out.println("Opsi lainnya belum diimplementasikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
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

    // Method to get user's choice
    private int getUserChoice() {
        System.out.print("\nMasukkan pilihan Anda : "); // Prompt user for input
        int choice = scanner.nextInt(); // Read user's input
        scanner.nextLine(); // Consume newline character after reading integer input
        System.out.print("\n"); // Print user's
        return choice;

    }

    /**
     * @param productList
     */
    private void buyProduct(ArrayList<Product> productList) {
        System.out.println("Masukkan nama produk yang ingin Anda beli: ");
        String productName = scanner.nextLine();

        // Find the product with the given name
        Product Product = null;
        for (Product product : productList) {
            if (product.getNamaBarang().equalsIgnoreCase(productName)) {
                Product = product;
                break;
            }
        }

        // Check if the product was found
        if (Product == null) {
            System.out.println("Produk tidak ditemukan.\n");
        } else {
            // If the product was found, check its status
            String status = Product.getStatusBarang();
            if (status.equalsIgnoreCase("tersedia")) {
                // If the product is available, ask the user how many they want to buy
                System.out.println("Berapa jumlah produk yang ingin Anda beli? ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character after reading integer input

                // Check if the user wants to buy more than 1 item
                if (quantity > 1) {
                    // If the user wants to buy more than 1 item, check if there are enough items
                    // available
                    if (Product.getJumlahBarang() >= quantity) {
                        // If there are enough items available, update the quantity and status of the
                        // product
                        Product.setJumlahBarang(Product.getJumlahBarang() - quantity);
                        if (Product.getJumlahBarang() == 0) {
                            Product.setStatusBarang("habis");
                        }
                        System.out.println("Produk berhasil dibeli.\n");
                    } else {
                        // If there are not enough items available, print a message
                        System.out.println("Jumlah produk yang ingin Anda beli melebihi jumlah yang tersedia.\n");
                    }
                } else {
                    // If the user wants to buy 1 item, update the quantity and status of the
                    // product
                    Product.setJumlahBarang(Product.getJumlahBarang() - 1);
                    if (Product.getJumlahBarang() == 0) {
                        Product.setStatusBarang("habis");
                    }
                    System.out.println("Produk berhasil dibeli.\n");
                }
            } else if (status.equalsIgnoreCase("habis")) {
                System.out.println("Produk tidak tersedia atau habis.");

            }
        }
    }
}
