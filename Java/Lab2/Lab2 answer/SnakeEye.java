package ch5_pp;

public class SnakeEye
{
    //-----------------------------------------------------------------
    //  Creates two Die objects and rolls them several times, counting
    //  the number of snake eyes that occur.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {

        PairOfDie die = new PairOfDie();
//        PairOfDie die2 = new PairOfDie();
//        PairOfDie sum = new PairOfDie();

        die.roll();
        die.sumOfTwo();

        System.out.println(die);

//        die2.roll2();
//        sum.sumOfTwo();
//        System.out.println (sum);



    }
}

