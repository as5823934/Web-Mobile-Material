package ch5_pp;


public class PigDriver {
    public static void main(String[] args) {
        final int GOALPOINT = 100;
        final int MYGIVEUP = 6;
        final int PCGIVEUP = 20;
        int myPoint, comPoint, round = 1, myRoll, pcRoll;
        int myScore = 0, comScore = 0;
        int mydie1, mydie2, comdie1, comdie2;

        Pig my_die = new Pig();
        Pig com_die = new Pig();

        while (myScore < GOALPOINT && comScore < GOALPOINT) {
            System.out.println("--------- Round " + round + " ---------");
            System.out.println("(My Turn) current score: " + myScore);

            myRoll = 1;
            myPoint = 0;
            if (myScore < GOALPOINT && comScore < GOALPOINT) {
                while (myRoll <= MYGIVEUP && myScore < GOALPOINT) {
                    my_die.my_Roll();
                    mydie1 = my_die.getDie1FaceValue();
                    mydie2 = my_die.getDie2FaceValue();

                    if (my_die.getMySum() == 2) {
                        myScore = 0;
                        //myRoll = -1;
                        System.out.println("My rolls: " + mydie1 + "," + mydie2 + " == 11 END");
                        break;

                    } else if ((mydie1 == 1 && mydie2 != 1) || (mydie2 == 1 && mydie1 != 1)) {
                        myPoint = 0;
                        //myRoll = -1;
                        System.out.println("My rolls: " + mydie1 + "," + mydie2 + " == 1 END");
                        break;

                    } else {
                        myPoint += my_die.getMySum();
                        System.out.println("My rolls: " + mydie1 + "," + mydie2 + "\tPoint: " + myPoint);
                        myRoll++;
                    }
                }
            }

            myScore += myPoint;
            System.out.println("\t -My Score: " + myScore + "-");
            System.out.println("");
            System.out.println("(PC Turn) current score: " + comScore);


            pcRoll = 1;
            comPoint = 0;
            if (myScore < GOALPOINT && comScore < GOALPOINT) {
                while (pcRoll <= PCGIVEUP && comScore < GOALPOINT) {


                    com_die.com_Roll();
                    comdie1 = com_die.getComDie1Face();
                    comdie2 = com_die.getComDie2Face();

                    if (com_die.getComSum() == 2) {
                        comScore = 0;
                        //pcRoll = -1;
                        System.out.println("PC rolls: " + comdie1 + "," + comdie2 + " == 1 END");
                        break;

                    } else if ((comdie1 == 1 && comdie2 != 1) || (comdie2 == 1 && comdie1 != 1)) {
                        comPoint = 0;
                        //pcRoll = -1;
                        System.out.println("PC rolls: " + comdie1 + "," + comdie2 + " == 1 END");
                        break;

                    } else {
                        comPoint += com_die.getComSum();
                        System.out.println("PC rolls: " + comdie1 + "," + comdie2 + "\tPoint: " + comPoint);
                        pcRoll++;
                    }
                }
                    comScore += comPoint;
                    System.out.println("\t -PC score: " + comScore + "-");
                    System.out.println("");
                    round++;
            }
        }


            if (myScore >= GOALPOINT){
                System.out.println("-------------------------");
                System.out.println("\t\t -You Win-");
                System.out.println("-------------------------");
            }
            if (comScore >= GOALPOINT){
                System.out.println("-------------------------");
                System.out.println("\t\t -PC Win-");
                System.out.println("-------------------------");
            }

        }

    }

