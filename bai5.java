
package random;
import java.util.*;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1; 
        int guess;
        int count = 0;

        do {
            System.out.print("Nhập số từ 1 đến 10: ");
            guess = sc.nextInt();
            count++;
        } while (guess != randomNumber);

        System.out.println("Bạn đã đoán đúng!");
        System.out.println("Số lần bạn nhập là: " + count);
    }
}

