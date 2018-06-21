package ch3_pp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PP3_6_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c;// three sides
        double s; // half perimeter
        double area;

        System.out.print("Enter side a: ");
        a = scan.nextDouble();
        System.out.print("Enter side b: ");
        b = scan.nextDouble();
        System.out.print("Enter side c: ");
        c = scan.nextDouble();
        System.out.print("Enter half perimeter s: ");
        s = scan.nextDouble();


        area = Math.sqrt((s * (s-a) * (s-b) * (s-c)));

        DecimalFormat converter = new DecimalFormat("#.###");
        String areaResult = converter.format(area);

        System.out.println("The area of triangle: " + areaResult);
    }
}
