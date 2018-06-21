package ch3_pp;

import java.util.Scanner;

public class PP3_4_Coordinate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1, y1, x2, y2;
        int distance;
        System.out.print("Enter X1: ");
        x1 = scan.nextInt();
        System.out.print("Enter Y1: ");
        y1 = scan.nextInt();
        System.out.print("Enter X2: ");
        x2 = scan.nextInt();
        System.out.print("Enter Y2: ");
        y2 = scan.nextInt();

        distance = (int)Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));

        System.out.println("Distance is: " + distance);


    }
}
