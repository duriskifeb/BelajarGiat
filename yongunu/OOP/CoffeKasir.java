package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    String username;
    String password;
    String name; 

    Customer(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }
}


class Menu {
    String namaMenu;
    int hargaMenu;

    public Menu(String namaMenu, int hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    public String toString() {
        return namaMenu + "\tRp." + hargaMenu;
    }
}

public class CoffeKasir {
    private static ArrayList<Customer> cust = new ArrayList<>();
    private static ArrayList<Customer> member = new ArrayList<>();
    private static ArrayList<Menu> daftarMenu = new ArrayList<>();
    private static ArrayList<Menu> totalPembelian = new ArrayList<>();
    private static ArrayList<Menu> riwayatPembelian = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        daftarMenu.add(new Menu("Es Teh     ", 3000));
        daftarMenu.add(new Menu("Nutrisari  ", 4000));
        daftarMenu.add(new Menu("Milo       ", 5000));

        int pilih;

        do {
            clearScreen();
            System.out.println("===== HOME =====");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("0. Exit");
            System.out.println("===== HOME =====");

            System.out.print("\nInput: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    login();
                    break;
                case 2:
                    signUp();
                    break;
                case 0:
                    System.out.println("\nTerima Kasih!");
                    break;
                default:
                    System.out.println("\nInputan Tidak Valid!");
                    next();
                    break;
            }
        } while (pilih != 0);
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        String userAdmin = "admin";
        String passAdmin = "admin";

        // clearScreen();
        System.out.println("\n===== LOGIN PAGE =====");
        System.out.print("Username    : ");
        String username = input.nextLine();
        System.out.print("Password    : ");
        String password = input.nextLine();

        boolean accLogin = false;
        for (Customer customer : cust) {
            if (customer.username.equals(username) && customer.password.equals(password)) {
                accLogin = true;
                break;
            }
        }

        if (userAdmin.equals(username) && passAdmin.equals(password)) {
            menuAdmin();
        } else if (accLogin) {
            menuCustomer();
        } else {
            System.out.println("\nUsername dan Password salah.");
            next();
        }
    }

    public static void signUp() {
        Scanner input = new Scanner(System.in);
        String userAdmin = "admin";
        String passAdmin = "admin";
    
        System.out.println("\n===== SIGN UP =====");
        System.out.print("Name        : ");
        String name = input.nextLine();
        System.out.print("Username    : ");
        String username = input.nextLine();
        System.out.print("Password    : ");
        String password = input.nextLine();
    
        if (username.equals(userAdmin) && password.equals(passAdmin)) {
            System.out.println("\nUsername and Password cannot be used.");
        } else {
            Customer newCust = new Customer(username, password, name);
            cust.add(newCust);
            member.add(newCust);
            System.out.println("\nRegistration successful.");
        }
        next();
    }
    

    public static void menuAdmin() {

        int pilih;
        clearScreen();
        viewMenu();
        System.out.println("========== ADMIN ==========");
        System.out.println("1. Tambah Menu");
        System.out.println("2. Hapus Menu");
        System.out.println("3. Riwayat Pembeli");
        System.out.println("4. Daftar Member SOFT KOPI");
        System.out.println("0. Back Home");
        System.out.println("========== ADMIN ==========");

        System.out.print("\nInput: ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                tambahMenu();
                break;
            case 2:
                hapusMenu();
                break;
            case 3:
                riwayatPembelian();
                break;
            case 4:
                daftarMember();
                break;
            case 0:
                return;
            default:
                    System.out.println("\nInputan Tidak Valid!");
                    next();
                    break;
        }
    }

    public static void tambahMenu() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMenu Baru   : ");
        String namaMenu = input.nextLine();
        System.out.print("Harga       : ");
        int hargaMenu = input.nextInt();

        daftarMenu.add(new Menu(namaMenu, hargaMenu));
        System.out.println("Menu berhasil ditambahkan.");

        next();
        menuAdmin();
        }

    public static void hapusMenu() {

        // viewMenu();
        System.out.println("\nInput 0 untuk batalkan.");
        System.out.print("Masukan nomer menu yang ingin dihapus: ");
        int hapusMenu = input.nextInt();

        if (hapusMenu >= 1 && hapusMenu <= daftarMenu.size()) {
            Menu menuRemove = daftarMenu.remove(hapusMenu - 1);
            System.out.println(menuRemove + "\nberhasil dihapus.");
        } else if (hapusMenu == 0) {
            System.out.println("Hapus menu dibatalkan");
        } else {
            System.out.println("Nomor menu tidak ditemukan.");
        }
        next();
        menuAdmin();
    }

    public static void riwayatPembelian() {
        if (riwayatPembelian.isEmpty()) {
            System.out.println("\nBelum ada pembelian dari Customer");
        } else {
            System.out.println("\nRiwayat Pembelian: ");
            System.out.println("\nNama: " + cust.get(cust.size() - 1).name);
            for (Menu menu : riwayatPembelian) {
                System.out.println(menu);
            }
        }
        next();
        menuAdmin();
    }

    public static void daftarMember() {

        // clearScreen();
        if (member.isEmpty()) {
            System.out.println("\nBelum ada yang bergabung.");
        } else {
            System.out.println("\n===== DAFTAR MEMBER =====");
            for (Customer customer : cust) {
                System.out.println("Username    : " + customer.username);
            }
        }
        next();
        menuAdmin();
    }

    public static void menuCustomer() {
        do {
            clearScreen();
            viewMenu();
            System.out.print("\nPilih menu yang dibeli: ");
            int beliMenu = input.nextInt();
    
            if (beliMenu >= 1 && beliMenu <= daftarMenu.size()) {
                Menu diBeli = daftarMenu.get(beliMenu - 1);
                totalPembelian.add(diBeli);
                riwayatPembelian.add(diBeli);
                System.out.println("\n" + diBeli.namaMenu + "\tRp." + diBeli.hargaMenu);
                System.out.println("Pembelian Sukses.");
            } else {
                System.out.println("Pembelian tidak valid.");
            }
            System.out.print("\nApakah ada tambahan menu lain ? (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));
    
        if (!totalPembelian.isEmpty()) {
            
            System.out.println("\nMenu yang dibeli oleh " + cust.get(cust.size() - 1).name + ": ");
            for (Menu menu : totalPembelian) {
                System.out.println(menu);
            }
            System.out.println("=========================");
            System.out.println("Total Harga " + "    Rp." + hitungTotalPembelian(totalPembelian));
        }
        next();
        totalPembelian.clear();
        return;
    }
    

    public static int hitungTotalPembelian(ArrayList<Menu> totalPembelian) {
        int total = 0;
        for (Menu menu : totalPembelian) {
            total += menu.hargaMenu;
        }
        return total;
    }

    public static void viewMenu() {
        System.out.println("======== MENU SOFT KOPI ========");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i));
        }
    }

    public static void next() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("\nTekan ENTER untuk lanjut");
            String terbilang = " ";
            terbilang = input.nextLine();
            System.out.print(terbilang);
            clearScreen();
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan : " + e);
        }
    }

    // public static void nextAdmin() {
    // Scanner input = new Scanner(System.in);
    // try {
    // System.out.print("\nTekan ENTER untuk lanjut");
    // String terbilang = " ";
    // terbilang = input.nextLine();
    // System.out.print(terbilang);
    // menuAdmin();
    // clearScreen();
    // } catch (Exception e) {
    // System.err.println("Terjadi kesalahan : " + e);
    // }
    // }

    // public static void nextCustomer() {
    // Scanner input = new Scanner(System.in);
    // try {
    // System.out.print("\nTekan ENTER untuk lanjut");
    // String terbilang = " ";
    // terbilang = input.nextLine();
    // System.out.print(terbilang);
    // menuCustomer();
    // clearScreen();
    // } catch (Exception e) {
    // System.err.println("Terjadi kesalahan : " + e);
    // }
    // }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}