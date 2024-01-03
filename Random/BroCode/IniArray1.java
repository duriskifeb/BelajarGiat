package BroCode;

import java.util.ArrayList;

public class IniArray1 {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<>();

        food.add("Lontong");
        food.add("Rujak");
        food.add("Cingur");
        
        food.set(0, "Indomie");
        food.remove(1); 
        // food.clear();
        
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
