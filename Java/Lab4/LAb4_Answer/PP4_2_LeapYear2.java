package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_2_LeapYear2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();

        while (year != 0){
            if(year >= 1582) {
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println("Not a leap year!");
                }
            }
            System.out.print("Test Another year or enter 0 to quit:  ");
            year = scan.nextInt();
        }
    }
}
