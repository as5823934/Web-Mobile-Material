package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_4_PrintPerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String n = scan.next();

        char ns;
        for(int i = 0; i < n.length(); i++){
            ns = n.charAt(i);
            System.out.println(ns);
        }
    }
}
