package ch5_pp;

public class CountFlips2 {
    public static void main(String[] args) {
        Coin2 myCoin = new Coin2();
        final int FLIPS = 10;
        int count = 0;

        for (int i = 1; i <= FLIPS; i++) {
            myCoin.flip();
            System.out.println(myCoin);
            if (myCoin.getFace()) {
                count++;
            }
        }
        System.out.println("Heads : " + count + " Tails : " + (FLIPS - count));
    }
}
