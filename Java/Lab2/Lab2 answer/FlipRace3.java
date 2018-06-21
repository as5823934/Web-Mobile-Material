package ch5_pp;

//********************************************************************
//  FlipRace.java       Java Foundations
//
//  Demonstrates the reuse of a programmer-defined class.
//********************************************************************

public class FlipRace3
{
    //-----------------------------------------------------------------
    //  Flips two coins until one of them comes up heads three times
    //  in a row.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        final int GOAL = 3;
        int count1 = 0, count2 = 0;

        // Create two separate coin objects
        Coin3 coin1 = new Coin3();
        Coin3 coin2 = new Coin3();

        while (count1 < GOAL && count2 < GOAL)
        {
            coin1.flip();
            coin2.flip();

            System.out.println("Coin 1: " + coin1 + "\tCoin 2: " + coin2);

            // Increment or reset the counters
            count1 = (coin1.getFace2() == "Heads") ? count1 + 1 : 0;
            count2 = (coin2.getFace2() == "Heads") ? count2 + 1 : 0;
        }

        // Determine the winner
        if (count1 < GOAL)
            System.out.println("Coin 2 Wins!");
        else
        if (count2 < GOAL)
            System.out.println("Coin 1 Wins!");
        else
            System.out.println("It's a TIE!");
    }
}
