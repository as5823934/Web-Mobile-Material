package PP_Excerice.PP4;

import java.util.Random;
import java.util.Scanner;

public class PP4_15_SlotMachine {
    public static void main(String[] args) {

        int num1, num2, num3;

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);




        System.out.println("Enter y to start: ");
        String n = scan.nextLine();
        while(n.equalsIgnoreCase("y")) {


            num1 = generator.nextInt(10);
            num2 = generator.nextInt(10);
            num3 = generator.nextInt(10);

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                if (num1 == num2 && num1 == num3 && num2 == num3) {
                    System.out.println("You got super lucky!! "+ num1 + num2 + num3);
                    break;
                }
                System.out.println("You got lucky!! " + num1 + num2 + num3);

            } else {
                System.out.println("Your number: " + num1 + num2 + num3);

            }
            System.out.println("Enter y to start: ");
            n = scan.nextLine();
        }

//
//        if(num1 == num2 && num1 == num3 && num2 == num3){
//
//        }
//        else if(num1 == num2 || num1 == num3 || num2 == num3){
//            System.out.println("You Got lucky!!");
//        }
    }
}
