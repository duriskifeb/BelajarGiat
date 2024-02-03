package WICO.Database;

import java.util.ArrayList;
import java.util.Arrays;

import WICO.DataModel.Antrian;

public class DataAntre {
    
    private ArrayList<Antrian> listAntrian = new ArrayList<>(
        Arrays.asList(
            new Antrian(
                "kepertama",
                DataProduct.newListProduct()),
            new Antrian(
                "Kedua",
                null)
        )
    )

}


//buat class dulu