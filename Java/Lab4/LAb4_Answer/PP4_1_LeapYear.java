package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_1_LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year: ");
        year = scan.nextInt();


        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year you entered: " + year + " is a leap year");
        } else if (year < 1582) {
            System.out.println("Error");
        } else{
            System.out.println("Not a leap year!");
        }
    }

}
