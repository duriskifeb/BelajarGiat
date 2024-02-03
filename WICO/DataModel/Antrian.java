package WICO.DataModel;

import java.util.ArrayList;

public class Antrian {
    private String nomorUrut;
    private ArrayList<Product> listTiket;

    public Antrian(String nomorUrut, ArrayList<Product> listTiket) {
        this.nomorUrut = nomorUrut;
        this.listTiket = listTiket;
    }

    public String getnomorUrut() {
        return nomorUrut;
    }

    public void setnomorUrut(String nomorUrut) {
        this.nomorUrut = nomorUrut;
    }

    public ArrayList<Product> getListTiket() {
        return listTiket;
    }

    public void setListTiket(ArrayList<Product> listTiket) {
        this.listTiket = listTiket;
    }
}
