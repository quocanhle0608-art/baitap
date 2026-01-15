package random;

import java.util.*;

public class bai2 {

    public static void main(String[] args) {
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * 6.2 + 1.8;
        System.out.println(randomNumber);
    }
}
