import java.util.Scanner;

public class pp2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quarters, dimes, nickels, pennies;
        System.out.print("Enter quarters : ");
        quarters = scan.nextInt();
        System.out.print("Enter dimes : ");
        dimes = scan.nextInt();
        System.out.print("Enter nickels : ");
        nickels = scan .nextInt();
        System.out.print("Enter pennies : ");
        pennies = scan.nextInt();

        quarters *= 25;
        dimes *= 10;
        nickels *= 5;
        pennies *= 1;
        int dollars , cents;
        dollars = (quarters + dimes + nickels + pennies) / 100;
        cents = (quarters + dimes + nickels + pennies) % 100;

        System.out.println("Total is : " + dollars +  " dollars and " + cents + " cents ");
    }
}
