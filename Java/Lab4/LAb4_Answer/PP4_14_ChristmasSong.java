package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_14_ChristmasSong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("# of verse 1 to 12: ");
        int verse = scan.nextInt();
        //int day = 12;

        for(int i = 1; i <= verse; i++) {
            switch (i) {
                case 1:
                    System.out.print("First");
                    break;
                case 2:
                    System.out.print("Second");
                    break;
                case 3:
                    System.out.print("Third");
                    break;
                case 4:
                    System.out.print("Fourth");
                    break;
                case 5:
                    System.out.print("Fifth");
                    break;
                case 6:
                    System.out.print("Sixth");
                    break;
                case 7:
                    System.out.print("Seventh");
                    break;
                case 8:
                    System.out.print("Eighth");
                    break;
                case 9:
                    System.out.print("Ninth");
                    break;
                case 10:
                    System.out.print("Tenth");
                    break;
                case 11:
                    System.out.print("Eleventh");
                    break;
                case 12:
                    System.out.print("Twelfth");
                    break;
            }
            System.out.println(" day of Christmas, my true love gave to me");

                switch (i) {
                    case 1:
                        System.out.println("A partridge in a pear tree");
                        break;
                    case 2:
                        System.out.println("Two turtle doves");
                        break;
                    case 3:
                        System.out.println("Three french hens");
                        break;
                    case 4:
                        System.out.println("Four calling birds");
                        break;
                    case 5:
                        System.out.println("Five golden rings");
                        break;
                    case 6:
                        System.out.println("Six geese is laying");
                        break;
                    case 7:
                        System.out.println("Seven swan a swimming");
                        break;
                    case 8:
                        System.out.println("Eight maids a milking");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing");
                        break;
                    case 10:
                        System.out.println("Ten loads a leaping");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping");
                        break;
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                        break;
                }
        }

    }
}
