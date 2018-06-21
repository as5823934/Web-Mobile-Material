import java.text.DecimalFormat;
import java.util.Scanner;

public class pp2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n, d;
        System.out.print("Enter numerator : ");
        n = scan.nextDouble();
        System.out.print("Enter denominator : ");
        d = scan.nextDouble();

        double result = n / d;

        //DecimalFormat myformat = new DecimalFormat("#.###");
        //String newresult = myformat.format(result); //assign output as string

        System.out.println("Your number = " + result);

    }
}
