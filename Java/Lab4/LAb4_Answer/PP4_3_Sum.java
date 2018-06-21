package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_3_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int result = 0;
        int i = 2;
        if(n > 2) {
            while (i < n) {
                if (i % 2 == 0)
                    result += i;
                i++;
            }
            System.out.println("The sum of all even int between 2 to " + n + " : " + result);
        }else{
            System.out.println("error");
        }






    }
}
