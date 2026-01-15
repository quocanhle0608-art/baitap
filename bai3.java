package random;

import java.util.*;

public class bai3 {

    public static void main(String[] args) {
        Random rand = new Random();
         int songuyen = rand.nextInt(78) + 3 ;
        if (songuyen % 2 == 0){
            System.out.println( songuyen + " La So chan");
        }
        else
                System.out.println( songuyen + "La so le " ) ;
    }

}
