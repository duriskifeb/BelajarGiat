package BroCode;

import java.util.Random;

public class ckpanVariable2 {
    
    Random random;
    int number;

    ckpanVariable2() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(9) + 1;
        System.out.println(number);
    }
}
