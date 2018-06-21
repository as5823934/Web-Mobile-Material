package Lab5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Derrick on 2017-11-22.
 */
public class PP7_1 {
    public static void main(String[] args) {
        int[] occurrences = new int[51];
        System.out.println("Enter integers from 0 - 50.");
        System.out.println("A Number outside of the range will exit the program.");
        Scanner in = new Scanner(System.in);

        int entered = in.nextInt();
        while (entered >= 0 && entered <= 50) {
            occurrences[entered]++;
            entered = in.nextInt();
        }

        System.out.println(Arrays.toString(occurrences));

    }
}
