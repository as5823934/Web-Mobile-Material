package PP_Excerice.PP4;

import java.util.Random;
import java.util.Scanner;

public class PP4_8_GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        Random generater = new Random();
        int r = generater.nextInt(100) + 1;

        int count = 1;
            while(n >= 1) {
                while (n > r) {
                    System.out.println("Too High!");
                    System.out.print("Enter another number or 0 to quit: ");
                    n = scan.nextInt();
                    count++;
                }
                while (n < r) {
                    System.out.println("Too Low!");
                    System.out.print("Enter another number or 0 to quit: ");
                    n = scan.nextInt();
                    count++;
                }
                while (n == r) {
                    System.out.println("===============================");
                    System.out.println("Congratulations, You Win!!");
                    System.out.println("You have entered: " + count + " times");
                    System.out.println("===============================");

                    System.out.println("please enter 0 to quit: ");
                    n = scan.nextInt();
                }
            }
            System.out.println("You have quit");
    }
}
