package MyPractice.Quiz8;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {


        NumberGroup group1 = new Range(-3,2);
        System.out.println(group1.contains(-5));
        System.out.println(group1.contains(2));

        NumberGroup mutiple1;
        mutiple1 = new Range(5,8);
        mutiple1 = new Range(10,12);
        mutiple1 = new Range(1,6);


        MultipleGroups m1 = new MultipleGroups(mutiple1);
        System.out.println(mutiple1.contains(2));
        System.out.println(mutiple1.contains(9));
        System.out.println(mutiple1.contains(6));
    }
}
