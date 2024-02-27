package WICO.DataModel;

import java.util.ArrayList;

public class Product {
    private String  namaBarang;
    private double hargaBarang;
    private int stokBarang;
    private String statusBarang;
    private int JumlahBarang;
    private ArrayList<Product> ListProduct;

    public Product(String namaBarang, double hargaBarang, int stokBarang, String statusBarang, int JumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.statusBarang = statusBarang;
        this.stokBarang= stokBarang;
        this.JumlahBarang = JumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }
    public int getJumlahBarang() {
        return JumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        JumlahBarang = jumlahBarang;
    }

    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }
}
