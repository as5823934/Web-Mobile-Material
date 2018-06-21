import java.util.Scanner;

public class pp2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fahrenheit : ");
        double fahrenheit;
        double celsius;
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit -32) * 5 / 9;

        System.out.println(celsius + " Celsius");
    }
}
