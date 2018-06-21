import java.util.Scanner;

public class pp2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of square : ");
        double lengthsquare;
        lengthsquare = scan.nextDouble();

        double perimeter, area;
        perimeter = lengthsquare * 4;
        area = lengthsquare * lengthsquare;

        System.out.println("The perimeter is : " + perimeter + "\nThe area is : " + area);




    }
}
