package ch3_pp;

import java.util.Random;

public class PP3_3_PhoneNumber {
    public static void main(String[] args) {

        Random generator = new Random();
        int num1, num2, num3, set2, set3;

        num1 = generator.nextInt(7) + 1;
        num2 = generator.nextInt(7) + 1;
        num3 = generator.nextInt(7) + 1;
        set2 = generator.nextInt(642) + 100;
        set3 = generator.nextInt(8999) + 1000;

        System.out.println(""+ num1 + num2 + num3 +"-"+ set2 +"-"+ set3);

    }



}
