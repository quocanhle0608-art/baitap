
package random;

import java.util.Scanner;
import java.util.*;

public class bai4 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thuc :");
        int n = sc.nextInt() ;
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * 100 ;
        System.out.println(randomNumber);
        if (n > randomNumber ){
            System.out.println(n + " lon hon " + randomNumber );
        }
        else if (n < randomNumber ){
            System.out.println(n + " nho hon " + randomNumber );
        }
        else {
            System.out.println(n + " bang " + randomNumber );
        }
            
    }
   
}
