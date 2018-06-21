import java.util.Scanner;

public class pp2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Mile : ");
        float mile;
        double kilometers;
        mile = scan.nextInt();
        kilometers = mile * 1.60935;

        System.out.println("kilometers = " + kilometers);
    }
}
