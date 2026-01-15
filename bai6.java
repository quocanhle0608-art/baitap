
package random;
import java.util.Random;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; 
        int guess;

        while (true) {
            System.out.print("Nhập số bạn đoán (1-100): ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Chúc mừng! Bạn đã đoán đúng ");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Lớn hơn");
            } else {
                System.out.println("Nhỏ hơn");
            }
        }
    }
}
