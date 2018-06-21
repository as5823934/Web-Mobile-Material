package ch5_pp;

public class CountFlips3 {
    public static void main(String[] args) {

        final int NUMBER_FLIPS = 10;
        int count = 0;
        Coin3 c1 = new Coin3();


        for(int i = 0; i < NUMBER_FLIPS; i++) {
            c1.flip();
            System.out.println(c1);
            if (c1.getFace2() == "Heads") {
                count++;
            }
        }
        System.out.println("The number of Heads: " + count);
        System.out.println("The number of Tails: " + (NUMBER_FLIPS - count));
    }
}