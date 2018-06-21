package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_7_BeerSong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("# of verse: ");
        int verse = scan.nextInt();

        verse = 100 -  verse;
        int beer = 100;

        while(beer > verse+1){
            System.out.println("\n" + beer + " bottles of beer on the wall, " + beer + " bottles of beer");
            beer -= 1;
            System.out.println("take one down, pass it around " + beer + " bottles of beer on the wall");
        }


    }
}
