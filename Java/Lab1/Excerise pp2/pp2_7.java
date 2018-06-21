import java.util.Scanner;

public class pp2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seconds , hours, minutes;
        System.out.print("Enter Seconds : ");
        seconds = scan.nextInt();

        hours = seconds / 3600;
        minutes = (seconds / 60) % 60;
        int resultseconds = seconds % 60;

        System.out.println("Time is : " + hours + " hours " + minutes + " minutes " + resultseconds + " seconds");
    }
}
