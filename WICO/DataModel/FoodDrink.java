package WICO.DataModel;

public class FoodDrink {
    private String  namaBarang;
    private int hargaBarang;
    private int stokBarang;
    private String statusBarang;

    public FoodDrink(String namaBarang, int hargaBarang, int stokBarang, String statusBarang) {
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



}
