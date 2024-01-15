package ProjectMe;

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

    public String getPassword() {
        return password;
    }
}

class Pembeli {
    private int id;
    private String nama;
    private String username;
    private String password;

    public Pembeli(int id, String nama, String username, String password) {
        this.id = id;
        this.nama = nama;
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

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

 class Wici {
    private int id;
    private String nama;
    private String username;
    private String password;

    public Wici(int id, String nama, String username, String password) {
        this.id = id;
        this.nama = nama;
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

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


class Barang {
    private int idBarang;
    private String namaBarang;
    private double hargaTawar;
    private String status;

    public Barang(int idBarang, String namaBarang, double hargaTawar, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaTawar = hargaTawar;
        this.status = status;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void sethargaTawar(double hargaTawar) {
        this.hargaTawar = hargaTawar;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double gethargaTawar() {
        return hargaTawar;
    }

    public String getStatus() {
        return status;
    }
}

/**
 * Wico
 */
public class Wico {
    ArrayList<Barang> simpanBarang = new ArrayList<>();
    ArrayList<Pembeli> simpanPembeli = new ArrayList<>();
    private Pembeli sengTuku;
    
    public Jualan() {
        Pembeli pembeli = new Pembeli(1, null, null, null)
    }

    public static void main(String[] args) {
        
    }

    Scanner input = new Scanner(System.in);

    public void loginAdmin() {
        System.out.println("\n===== Login Admin =====");
        System.out.print("Masukkan username : ");
        String un = input.next();
        System.out.print("Masukkan password : ");
        String pw = input.next();
        Admin admin = new Admin();
        if (un.equals(admin.getUsername()) && pw.equals(admin.getPassword())) {
            System.out.println("\nLogin Admin berhasil");
            System.out.println("Selamat datang Admin!");
        } else {
            System.out.println("\nUsername atau password Admin tidak sesuai");
            // menu();
        }
    }

    public Pembeli cekLoginPembeli(String username, String password) {
        for (Pembeli p : simpanPembeli) {
            if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }

    public void loginPembeli() {
        System.out.println("\n===== Login Pembeli =====");
        System.out.print("Masukkan username : ");
        String un = input.next();
        System.out.print("Masukkan password : ");
        String pw = input.next();
        Pembeli p = cekLoginPembeli(un, pw);
        if (p != null) {
            sengTuku = p;
            System.out.println("\nLogin Pembeli berhasil");
            System.out.println("Selamat datang " + p.getNama() + "!");
        } else {
            System.out.println("\nUsername atau password Pembeli tidak sesuai");
            menu();
        }
    }

    public void makanMinum() {
        
    }



    
}

