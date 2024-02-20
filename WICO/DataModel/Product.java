package WICO.DataModel;

import java.util.ArrayList;

public class Product {
    private String  namaBarang;
    private int hargaBarang;
    private int stokBarang;
    private String statusBarang;
    private ArrayList<Product> ListProduct;

    public Product(String namaBarang, int hargaBarang, int stokBarang, String statusBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.statusBarang = statusBarang;
        this.stokBarang= stokBarang;

    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }
}
