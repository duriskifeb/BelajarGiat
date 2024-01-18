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

class MakananMinuman {
    private String nama;
    private double harga;
    private int id;

    public MakananMinuman(String nama, double harga, int id) {
        this.nama = nama;
        this.harga = harga;
        this.id = id;

    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getId() {
        return id;
    }
}

class Makanan extends MakananMinuman {
    public Makanan(String nama, double harga, int id) {
        super(nama, harga, id);
    }
}

class Minuman extends MakananMinuman {
    public Minuman(String nama, double harga, int id) {
        super(nama, harga, id);
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
    ArrayList<MakananMinuman> keranjangBelanja = new ArrayList<>();
    private Pembeli sengTuku;
    private Scanner input = new Scanner(System.in);

    public Wico() {
        // data pembeli ni yee !
        Pembeli pembeli1 = new Pembeli(1, "Riski", "riski123", "riski123");
        Pembeli pembeli2 = new Pembeli(1, "Riski", "riski123", "riski123");
        simpanPembeli.add(pembeli1);
        simpanPembeli.add(pembeli2);

        // data barang ni yee !
        Barang barang1 = new Barang(1, "Es Teh", 5000, "Ada");
        Barang barang2 = new Barang(2, "Kopi", 4000, "Ada");
    }

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Wico wey = new Wico();
        wey.menu();
    }

    private void menu() {
        int pilihan = 0;
        do {
            System.out.println(" ---o0 Selamat datang Di Aplikasi Wico 0o--- \n");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Pembeli");
            System.out.println("3. Register Pembeli");
            System.out.println("4. Log-out");
            System.out.println("0. Keluar aplikasi");
            System.out.print("\nMasukkan pilihan anda : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    loginAdmin();
                    menuAdmin();
                    break;
                case 2:
                    loginPembeli();
                    menuPembeli();
                    break;
                case 3:
                    registerPembeli();
                    menu();
                    break;
                case 4:
                    logout();
                    break;
                case 0:
                    System.out.println("Keluar dari aplikasi . . .");
                    System.exit(0);

                    break;
            }
        } while (true);
    }
    // Scanner input = new Scanner(System.in);

    public void loginAdmin() {
        System.out.println("\n--o0 Login Admin 0o-- ");
        System.out.print("Masukkan username : ");
        String un = input.next();
        System.out.print("Masukkan password : ");
        String pw = input.next();
        Admin admin = new Admin();
        if (un.equals(admin.getUsername()) && pw.equals(admin.getPassword())) {
            System.out.println("\n[ Login Admin berhasil ]");
            System.out.println("Selamat datang di menu Admin...");
        } else {
            System.out.println("\nUsername atau password Admin tidak sesuai");
            menu();
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
        System.out.println("\n--o0 Login Pembeli 0o-- ");
        System.out.print("Masukkan username : ");
        String un = input.next();
        System.out.print("Masukkan password : ");
        String pw = input.next();
        Pembeli p = cekLoginPembeli(un, pw);
        if (p != null) {
            sengTuku = p;
            System.out.println("\n\t[ Login Pembeli berhasil ] \n");
            System.out.println("\t   Selamat datang " + p.getNama() + "!");
        } else {
            System.out.println("\nUsername atau password Pembeli tidak sesuai");
            menu();
        }
    }

    public void registerPembeli() {
        System.out.println("\n --o0 Input Data Pembeli 0o-- \n");
        System.out.print("Nama : ");
        String nm = input.next();
        System.out.print("Username : ");
        String usr = input.next();
        System.out.print("Password : ");
        String pass = input.next();

        int id;

        if (!simpanPembeli.isEmpty()) {
            id = simpanPembeli.get(simpanPembeli.size() - 1).getId() + 1;
        } else {
            id = 1;
        }

        for (Pembeli sengtuku : simpanPembeli) {
            if (sengtuku.getUsername().equals(usr)) {
                System.out.println("\nMohon maaf, Username telah digunakan\n");
                menu();
            }
        }
        Pembeli tumbas = new Pembeli(id, nm, usr, pass);
        simpanPembeli.add(tumbas);
        System.out.println("\nSelamat, registrasi Pembeli berhasil di ubah\n");
    }

    public void menuAdmin() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n --o0 Selamat Datang di admin Wico 0o-------- \n");
            System.out.println("\nMenu Admin : \n");
            System.out.println("1. Menu barang");
            System.out.println("2. Lihat data pembeli");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. Logout");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    menuBarang();
                    break;
                case 2:
                    if (!simpanPembeli.isEmpty()) {
                        lihatPembeli();
                    } else {
                        System.out.println("\nData pembeli masih kosong");
                        menuAdmin();
                    }
                    break;
                case 3:

                case 4:

                case 5:
                    System.out.println("\nAdmin logout...");
                    menu();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void menuPembeli() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n\t----------o0 Selamat Datang di Wico 0o-------- ");
            System.out.println("\n    --o0 Tempat berimajinasi dan berhayal lebih baik, :) 0o-- \n");
            System.out.println("Menu Pembeli : \n");
            System.out.println("1. Setting profile");
            System.out.println("2. Beli makan dan minuman");
            System.out.println("3. Sewa Tempat barang");
            System.out.println("4. Pemasangan Wifi corner 1000Mbps.");
            System.out.println("5. Joki TA [ -o0ngoding0o- ] all jurusan ");
            System.out.println("0. Log-out. ");
            System.out.print("\nMasukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    settingProfile();
                    break;
                case 2:
                    njajan();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("\nPembeli logout...\n");
                    menu();
                    break;
                default:
                    System.err.println("\nMaaf, inputan anda tidak falid.");
                    break;
            }
        }
    }

    

        public static void njajan() {
            Scanner input = new Scanner(System.in);
            int pilihan = 0;
            double totalHarga = 0;
            ArrayList<MakananMinuman> keranjangBelanja = new ArrayList<>();

            while (pilihan != 3) {
                System.out.println("\nMenu Makanan dan Minuman:");
                System.out.println("1. Makanan");
                System.out.println("2. Minuman");
                System.out.println("3. Checkout");
                System.out.print("Masukkan pilihan anda: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        beliMakanan(input, keranjangBelanja);
                        break;
                    case 2:
                        beliMinuman(input, keranjangBelanja);
                        break;
                    case 3:
                        totalHarga = tampilkanCheckout(totalHarga, keranjangBelanja, input);
                        keranjangBelanja.clear();
                        totalHarga = 0;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            }
        }

        

        public static void beliMakanan(Scanner input, ArrayList<MakananMinuman> keranjangBelanja) {
            System.out.println("\nDaftar Makanan:");
            System.out.println("1. Nasi Goreng - Rp. 20.000");
            System.out.println("2. Mie Goreng - Rp. 18.000");
            System.out.println("3. Sate Ayam - Rp. 25.000");
            System.out.print("Masukkan pilihan anda: ");
            int pilihanMakanan = input.nextInt();

            switch (pilihanMakanan) {
                case 1:
                    keranjangBelanja.add(new Makanan("Nasi Goreng", 20000, 1));
                    break;
                case 2:
                    keranjangBelanja.add(new Makanan("Mie Goreng", 18000, 2));
                    break;
                case 3:
                    keranjangBelanja.add(new Makanan("Sate Ayam", 25000, 3));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
        }

        public static void beliMinuman(Scanner input, ArrayList<MakananMinuman> keranjangBelanja) {
            System.out.println("\nDaftar Minuman:");
            System.out.println("1. Es Teh - Rp. 5.000");
            System.out.println("2. Es Jeruk - Rp. 7.000");
            System.out.println("3. Kopi - Rp. 8.000");
            System.out.print("Masukkan pilihan anda: ");
            int pilihanMinuman = input.nextInt();

            switch (pilihanMinuman) {
                case 1:
                    keranjangBelanja.add(new Minuman("Es Teh", 5000, 4));
                    break;
                case 2:
                    keranjangBelanja.add(new Minuman("Es Jeruk", 7000, 5));
                    break;
                case 3:
                    keranjangBelanja.add(new Minuman("Kopi", 8000, 6));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
        }

        public static double tampilkanCheckout(double totalHarga, ArrayList<MakananMinuman> keranjangBelanja,
                Scanner input) {
            System.out.println("\nKeranjang belanja anda : \n");
            for (MakananMinuman item : keranjangBelanja) {
                System.out.println(
                        "ID: " + item.getId() + ", Nama: " + item.getNama() + ", Harga: Rp. " + item.getHarga());
                totalHarga += item.getHarga();
            }

            System.out.printf("\nTotal harga belanja anda: Rp. %,.2f\n", totalHarga);

            // Meminta pengguna untuk membayar
            System.out.print("Masukkan jumlah uang yang dibayarkan: Rp. ");
            double jumlahBayar = input.nextDouble();

            // Memproses pembayaran
            while (jumlahBayar < totalHarga) {
                System.out.println("Jumlah uang yang dibayarkan kurang. Mohon masukkan jumlah yang cukup.");
                System.out.print("Masukkan jumlah uang yang dibayarkan: Rp. ");
                jumlahBayar = input.nextDouble();
            }

            // Menghitung kembalian
            double kembalian = jumlahBayar - totalHarga;
            System.out.printf("Terima kasih! Kembalian anda: Rp. %,.2f\n", kembalian);

            return totalHarga;
        }

    
    public void lihatPembeli() {
        System.out.println("\n --o0 Daftar Pembeli 0o-- ");
        System.out.println("ID \tNama \tUsername");
        for (int i = 0; i < simpanPembeli.size(); i++) {
            System.out.println(simpanPembeli.get(i).getId() + "\t" + simpanPembeli.get(i).getNama() + "\t"
                    + simpanPembeli.get(i).getUsername());
        }
    }

    public void menuBarang() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n --o0 Menu Barang 0o-- \n");
            System.out.println("1. Tambahkan Barang ");
            System.out.println("2. Lihat Data Barang ");
            System.out.println("3. Edit Barang ");
            System.out.println("4. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    if (!simpanBarang.isEmpty()) {
                        lihatBarang();
                    } else {
                        System.out.println("\nBelum ada data barang yang ditambahkan");
                    }
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    System.out.println("\nKembali ke menu utama...");
                    menuAdmin();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void tambahBarang() {
        System.out.println("\n --o0 Tambah Barang Wico 0o-- ");
        System.out.print("Nama barang : ");
        String nama = input.next();
        System.out.print("Harga awal : ");
        double harga = input.nextDouble();
        System.out.print("Apakah barang bisa ditawar? [yes/no] : ");
        String status = input.next().toLowerCase();
        int id;
        if (!simpanBarang.isEmpty()) {
            id = simpanBarang.get(simpanBarang.size() - 1).getIdBarang() + 1;
        } else {
            id = 1;
        }
        Barang b = new Barang(id, nama, harga, status);
        simpanBarang.add(b);
        System.out.println("Barang berhasil ditambahkan");
    }

    public void lihatBarang() {
        System.out.println("\n --o0 Daftar Barang Wico 0o-- ");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < simpanBarang.size(); i++) {
            System.out.println(
                    simpanBarang.get(i).getIdBarang() + "\t" + simpanBarang.get(i).getNamaBarang() + "\t\t" + "Rp."
                            + simpanBarang.get(i).gethargaTawar() + "\t" + simpanBarang.get(i).getStatus());
        }
    }

    public void editBarang() {
        lihatBarang();
        System.out.println("\n===== Edit Barang Wico =====");
        System.out.print("Masukkan ID barang yang akan diedit : ");
        int id = input.nextInt();
        int ketemu = cekBarang(id);
        if (ketemu >= 0) {
            System.out.println("Pilihan yang dapat diedit :");
            System.out.println("1. Nama barang");
            System.out.println("2. Harga tawar");
            System.out.println("3. Status barang");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama barang baru : ");
                    String newNama = input.next();
                    simpanBarang.get(ketemu).setNamaBarang(newNama);
                    System.out.println("Nama barang berhasil diubah");
                    break;
                case 2:
                    System.out.print("\nMasukkan harga tawar baru : ");
                    double newHarga = input.nextDouble();
                    simpanBarang.get(ketemu).sethargaTawar(newHarga);
                    System.out.println("Harga tawar berhasil diubah");
                    break;
                case 3:
                    System.out.print("\nMasukkan status barang baru [yes/no] : ");
                    String newStatus = input.next().toLowerCase();
                    simpanBarang.get(ketemu).setStatus(newStatus);
                    System.out.println("Status barang berhasil diubah");
                    if (newStatus.equals("yes")) {
                        System.out.println("Barang bisa ditawar");
                    } else {
                        System.out.println("Barang tidak bisa ditawar");
                    }
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        } else {
            System.out.println("\nBarang tidak ditemukan");
        }
    }

    public int cekBarang(int id) {
        int ketemu = -1;
        for (int i = 0; i < simpanBarang.size(); i++) {
            if (simpanBarang.get(i).getIdBarang() == id) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public void settingProfile() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n --o0 Setting Profile 0o-- ");
            System.out.println("1. Lihat profile");
            System.out.println("2. Edit profile");
            System.out.println("3. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    lihatProfile();
                    break;
                case 2:
                    editProfile();
                    break;
                case 3:
                    System.out.println("\nKembali ke menu pembeli...");
                    menuPembeli();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void lihatProfile() {
        System.out.println("\n --o0 Profile 0o-- ");
        System.out.println("ID : " + sengTuku.getId());
        System.out.println("Nama : " + sengTuku.getNama());
        System.out.println("Username : " + sengTuku.getUsername());
        System.out.println("Password : " + sengTuku.getPassword());
    }

    public void editProfile() {
        System.out.println("\n --o0 Edit Profile 0o--");
        int idx = sengTuku.getId() - 1;
        System.out.println("Pilihan yang dapat diedit :");
        System.out.println("1. Nama");
        System.out.println("2. Username");
        System.out.println("3. Password");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("\nMasukkan nama baru : ");
                String newNama = input.next();
                simpanPembeli.get(idx).setNama(newNama);
                System.out.println("Nama berhasil diubah");
                break;
            case 2:
                System.out.print("\nMasukkan username baru : ");
                String newUsername = input.next();
                simpanPembeli.get(idx).setUsername(newUsername);
                System.out.println("Username berhasil diubah");
                break;
            case 3:
                System.out.print("\nMasukkan password baru : ");
                String newPassword = input.next();
                simpanPembeli.get(idx).setPassword(newPassword);
                System.out.println("Password berhasil diubah");
                break;
            default:
                System.out.println("\nInputan tidak valid");
                break;
        }
    }

    public void logout() {
        System.out.println("Anda kembali ke menu logut\n");
        menu();
    }

}
