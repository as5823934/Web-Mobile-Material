package PP_Excerice.PP4;

import java.util.Scanner;

public class PP4_12_Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scan.nextLine();

        System.out.println(countVowel(s) + "\n");

    }
    public static String countVowel(String s) {
        int count = 0;
        int a = 0; int e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                a++;
            }else if(s.charAt(j) == 'e'){
                e++;
            }else if(s.charAt(j) == 'i'){
                i++;
            }else if (s.charAt(j) == 'o'){
                o++;
            }else if (s.charAt(j) == 'u'){
                u++;
            }
            else{
                count ++;
            }
        }
        return "a: " + a + "\ne: " + e + "\ni: " + i + "\no: " + o + "\nu: " + u + "\nnon-vowel: " + count;
    }

}
