package WICO.Database;

import java.util.ArrayList;
import java.util.Arrays;

import WICO.DataModel.MinumanPrdk;



public class DataMinuman {
    ArrayList<MinumanPrdk> listMinuman;

    public DataMinuman() {
        newListMinuman();
    }

    public ArrayList<MinumanPrdk> newListMinuman() {
        return listMinuman = new ArrayList<MinumanPrdk>(
            Arrays.asList( 
                new MinumanPrdk(
                    "Joshua", 
                    5000, 
                    20, 
                    "ada"),
                new MinumanPrdk(
                    "Es teh Jumbo", 
                    4000, 
                    25, 
                    "Ada"),
                new MinumanPrdk(
                    "Es cinta", 
                    100000, 
                    0, 
                    "Tak terbatas"),
                new MinumanPrdk("Es rindu", 99999999, 0, "Berat")));
        
    }

    public ArrayList<MinumanPrdk> getListMinuman() {
        return listMinuman;
    }

    public void addMinuman(MinumanPrdk Minum) {
        listMinuman.add(Minum);
    }

    public void editMinuman(MinumanPrdk Minum) {
        listMinuman.set(0, Minum); 
    }

    public void deleteMinuman(MinumanPrdk Minum) {
        listMinuman.remove(Minum);
    }

    public MinumanPrdk getMinumanPrdk(String namaMinuman) {
        return listMinuman.stream().filter(cekMinuman -> cekMinuman.getNamaMinuman().equals(namaMinuman)).findFirst().orElse(null);
    }
}
