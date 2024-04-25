package WICO;

import WICO.UserView.Menu1;
import WICO.UserView.loginMenu;


public class Main {
    public static void main(String[] args) {
        Menu1 menu = new Menu1();
        loginMenu logIn = new loginMenu();
        menu.run();
    }
}


