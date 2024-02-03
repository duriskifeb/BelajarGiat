package WICO.UserView;

import WICO.ViewModel.ViewPrdk;
import WICO.util.Util;

public class Menu1 {

    public void run() {
        
    }

    private void menu1() {
        boolean menu1 = true;
        int userInput;

        while (menu1) {
            Util.cls();
            System.out.println("Selamat Datang di wico selamat berbelanja. . . ");
            System.out.println("Menu 1 : ");
            System.out.println("1. Lihat semua produk food & drink");
            System.out.println("2. Lihat pesewaan tempat");
            System.out.println("3. Lihat layanan jaringan wifi-corner");
            System.out.println();
            userInput = Util.inputInt();

            Util.pressEnter();
            Util.cls();

            switch (userInput) {
                case 1:
                
                break;
            
                default:
                    System.err.println("Maaf, Pilihan anda tidak ada silahkan memilih 1-3 . ");
                    break;
            }
        }
    }

    //method menu 
    private void showALLProduct() {
        ViewPrdk.showALLProduct();
        Util.pressEnter();
    }
}
