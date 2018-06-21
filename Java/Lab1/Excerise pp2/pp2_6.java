import java.util.Scanner;

public class pp2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours, minutes, seconds;
        System.out.print("Enter Hour : ");
        hours = scan.nextInt();
        System.out.print("Enter Minutes : ");
        minutes = scan.nextInt();
        System.out.print("Enter Seconds : ");
        seconds = scan.nextInt();

        int resultseconds = (hours * 60 + minutes) * 60 + seconds;
        System.out.println("Seconds = " + resultseconds + " seconds");
    }
}
