package WICO.UserView;

import javax.swing.text.View;

import WICO.ViewModel.ViewMinuman;
import WICO.ViewModel.ViewPrdk;
import WICO.util.Util;

public class Menu1 {
    ViewPrdk viewProduct = new ViewPrdk();
    ViewMinuman viewMinuman = new ViewMinuman();

    public void run() {
        menu1();
    }

    private void menu1() {
        boolean menu1 = true;
        int userInput;

        while (menu1) {
            Util.cls();
            System.out.println("=====================================");
            System.out.println("Menu Aplikasi : \n");
            System.out.println("1. Lihat semua produk food");
            System.out.println("2. Lihat semua produk Drink");
            System.out.println("3. Lihat layanan jaringan wifi-corner");
            System.out.println("0. Keluar dari program ini");
            System.out.println();

            System.out.print("Masukkan pilihan Anda : ");
            userInput = Util.inputInt();

            Util.pressEnter();
            Util.cls();

            switch (userInput) {
                case 1:
                    showALLProduct();
                    break;
                case 2:
                    showALLMinuman();
                break;
                case 3:
                    // showLayananJaringan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Maaf, Pilihan anda tidak ada silahkan memilih 1-3 . ");
                    break;
            }
        }
    }

    private void showALLProduct() {
        viewProduct.showALLProduct();
        Util.pressEnter();
    }


    private void showALLMinuman() {
        viewMinuman.showALLMinuman();
        Util.pressEnter();
    }

    
}