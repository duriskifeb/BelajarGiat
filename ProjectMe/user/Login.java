package ProjectMe.user;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
    private String username;
    private String password;

    public Admin() {
        this.username = "admin";
        this.password = "admin";

    }

    public String getUsername() {
        return username;
    }

    public String getpassword() {
        return password;
    }

}

class Customer {
    private int id;
    private String nama;
    private String username;
    private String password;

    public Customer(int id, String name, String username, String password) {
        this.id = id;
        this.nama = name;
        this.username = username;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void getNama(String nama) {
        this.nama = nama;

    }

    public void getUsername(String username) {
        this.username = username;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }
}

class Barang {
    String idBarang;
    String namaBarang;
    int hargaJual;
    int jumlahStok;

    public Barang(String idBarang, String namaBarang, int hargaJual, int jumlahStok) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaJual = hargaJual;
        this.jumlahStok = jumlahStok;

    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

}

public class Login {
    ArrayList<Barang> barangan = new ArrayList<>();
    ArrayList<Customer> cusan = new ArrayList<>();

    private Customer pembeliLoggedIn;
    public static void main(String[] args) {
        
    }
    Scanner input = new Scanner(System.in);

    private void menu() {
        int pilihan = 0;
        Scanner pilihanUser;

        while (pilihan != 2) {

            System.out.println("   ---o0 Selamat Datanng di Aplikasi Wico 0o--- ");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Pembeli");
            System.out.println("3. Register");
            System.out.println("0. Keluar Aplikasi");

            System.out.print("\nPilih Menu : ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    // login
                    break;
                case 2:
                    // pembeli
                    break;
                case 3:
                    // register
                    break;
                case 4:
                    // Hiburan
                    break;
                case 0:
                    // keluar
                    break;

                default:
                    System.err.println("Maaf, pilihan tidak ada");
                    break;
            }
        }
    }

    public void loginAdmin() {
        System.out.println("   ---o0 Admin 0o---   ");
        System.out.println("Masukkan Username : ");
        String username = input.nextLine();
        System.out.println("Masukkan Password : ");
        String password = input.nextLine();
        Admin admin = new Admin();

        if (username.equals(admin.getUsername()) && password.equals(admin.getpassword())) {
            System.out.println("[Login Admin Berhasil]");
            System.out.println("--<[Selamat datang di menu admin]>--");
        }else{
            System.out.println("[Gagal Login Admin]");
            System.out.println("Masukkan username dengan benar...");
            menu();
        }
    }

    public void loginCustomer() {
        System.out.println("   ---o0 Login Customer 0o---  ");
        System.out.println("Masukkan Username  : ");
        String user = input.nextLine();
        System.out.println("Masukkan Password : ");
        String pass = input.nextLine();
        Customer cus = cekLoginCustomer(user, pass);

        if (cus != null) {
            pembeliLoggedIn = cus;
            System.out.println("[Login Berhasil]");
            System.out.println("Selamat Datang " + cus.getClass());
        }else {
            System.out.println("Username atau password tidak valid . . . ");
            menu();
        }
    }

    public Customer cekLoginCustomer(String username, String password) {
        for(Customer cus : cusan) {
            if (cus.getUsername().equals(username) && cus.getPassword().equals(password)) {
                return cus;
            }
        }
        return null;
    }


    public void registerPembeli() {
        System.out.print("   ---o0 Input Data Pembeli 0o--- ");
        System.out.println("Nama  : ");
        String nama = input.nextLine();
        System.out.println("Username  : ");
        String username = input.nextLine();
        System.out.println("Password : ");
        String passwrod = input.nextLine();
        int id;

        if (!cusan.isEmpty()) {
            id = cusan.get(cusan.size() -1).getId() + 1;
        }else {
            id = 1;
        }

        for (Customer pembeli : cusan) {
            if (pembeli.getUsername().equals(username)) {
                System.out.println("Username sudah digunaka");
            }
        }
    }
    
}