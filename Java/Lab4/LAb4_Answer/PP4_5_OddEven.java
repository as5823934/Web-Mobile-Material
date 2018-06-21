package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_5_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();

        int odd = 0, even = 0, zero = 0;
        while(n >= 1){
            if(n % 10 == 0) {
                zero++;
            }
            else if (n % 2 == 0) {
                    even++;
                }
            else if (n % 2 != 0) {
                    odd++;
                }
            n /= 10;

        }
        System.out.println("Odd: " + odd + "\tEven: " + even + "\tZero: " +zero);
    }
}
