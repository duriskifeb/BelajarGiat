package WICO.UserView;

import WICO.ViewModel.ViewPrdk;
import WICO.util.Util;

public class Menu1 {
    ViewPrdk viewProduct = new ViewPrdk();


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
            System.out.println("1. Lihat semua produk food & drink");
            System.out.println("2. Lihat pesewaan tempat");
            System.out.println("3. Lihat layanan jaringan wifi-corner");
            System.out.println( "0. Keluar dari program ini");
            System.out.println();

            System.out.print( "Masukkan pilihan Anda : ");
            userInput = Util.inputInt();

            Util.pressEnter();
            Util.cls();

            switch (userInput) {
                case 1:
                    showALLProduct();
                    break;
                case 2:
                    // ShowSewaTempat();
                    break;
            
                default:
                    System.err.println("Maaf, Pilihan anda tidak ada silahkan memilih 1-3 . ");
                    break;
            }
        }
    }

    //method menu 
    // Pada baris 50
    private void showALLProduct() {
        viewProduct.showALLProduct();
        Util.pressEnter();
    }

    // private void showALLProduct() {
    //     ViewPrdk.showALLProduct();
    //     Util.pressEnter();
    // }

    // private void ShowSewaTempat() {
    //     ViewPrdk.ShowJadwalSewa();
    // }
}
