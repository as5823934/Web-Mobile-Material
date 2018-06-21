package ch3_pp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PP3_5_Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius, area, volume;

        System.out.print("Enter PP3_5_Sphere Radius: ");
        radius = scan.nextDouble();

        area = 4 * Math.PI * Math.pow(radius,2);
        volume = (double)4/3 * Math.PI * Math.pow(radius, 3);

        DecimalFormat myformat = new DecimalFormat("#.####");
        String arearesult = myformat.format(area); //assign output as string
        String volumeresult = myformat.format(volume);

        System.out.println("Area of PP3_5_Sphere: " + arearesult);
        System.out.println("Volume of PP3_5_Sphere: " + volumeresult);
    }
}
