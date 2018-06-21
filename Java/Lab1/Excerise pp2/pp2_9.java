import java.util.Scanner;

public class pp2_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total;
        System.out.print("Enter money: ");
        total = scan.nextDouble();

        int ten = 0;
        while (total >= 10) {
            total -= 10;
            ten += 1;
        }
        int five = 0;
        while (total >= 5) {
            total -= 5;
            five += 1;
        }
        int one = 0;
        while (total >= 1){
            total -= 1;
            one += 1;
        }

        total *= 100;
        int quarter = 0;
        while (total >= 25){
            total -= 25;
            quarter += 1;
        }
        int dimes = 0;
        while (total >= 10){
            total -= 10;
            dimes += 1;
        }
        int nickels = 0;
        while (total >= 5){
            total -= 5;
            nickels += 1;
        }
        int pennies = 0;
        while (total >= 1){
            total -= 1;
            pennies += 1;
        }
        System.out.println(ten + " ten dollar bills");
        System.out.println(five + " five dollar bills");
        System.out.println(one + " one dollar bills");
        System.out.println(quarter + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");




    }
}
