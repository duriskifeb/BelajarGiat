package WICO.ViewModel;

import java.util.ArrayList;
import WICO.DataModel.MinumanPrdk;
import WICO.Database.DataMinuman;

public class ViewMinuman {
    DataMinuman dataMinum = new DataMinuman();

    // Method to display all drinks
    public void showALLMinuman() {
        // Get list of drinks
        ArrayList<MinumanPrdk> minumanList = dataMinum.getListMinuman();

        // Check if the list is empty
        if (minumanList.isEmpty()) {
            // If the list is empty, print a message
            System.out.println("Tidak ada minuman yang tersedia.");
        } else {
            // If the list is not empty, iterate through the list using for each loop
            System.out.println("Daftar Minuman:");
            int index = 1;
            for (MinumanPrdk minuman : minumanList) {
                // Print the index and name of the drink
                System.out.println((index++) + ". " + minuman.getNamaMinuman());
            }

            // Print total number of drinks available
            System.out.println("Total minuman yang tersedia: " + minumanList.size());
        }
    }
}
