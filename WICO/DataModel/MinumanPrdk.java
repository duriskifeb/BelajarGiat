package WICO.DataModel;

import java.util.ArrayList;

public class MinumanPrdk {

    private String namaMinuman;
    private int  hargaMinuman;
    private int stokMinuman;
    private String statusMinuman;
    private ArrayList<MinumanPrdk> ListProduct;

    public MinumanPrdk(String namaBarang, int hargaMinuman, int stokMinuman, String statusMinuman) {
        this.namaMinuman = namaBarang;
        this.hargaMinuman = hargaMinuman;
        this.stokMinuman = stokMinuman;
        this.statusMinuman = statusMinuman;

    }

   public String getNamaMinuman() {
       return namaMinuman;
   }

   public String getStatusMinuman() {
       return statusMinuman;
   }

   public int getHargaMinuman() {
       return hargaMinuman;
   }

   public int getStokMinuman() {
       return stokMinuman;
   }
}