package ch5_pp;


public class PairOfDie {
    // Attributes
    private final int MAX_VALUE = 6;
    private int Die1faceValue, Die2faceValue;


    //Constructor
    public PairOfDie() {
        Die1faceValue = 1;
        Die2faceValue = 1;
    }

    //Methods
    public void roll(){
        Die1faceValue = (int) (Math.random() * MAX_VALUE) + 1;
        Die2faceValue = (int) (Math.random() * MAX_VALUE) + 1;
    }
    public int sumOfTwo(){
        return Die1faceValue + Die2faceValue;
    }

//    public int roll() {
//
//        Die1faceValue = (int) (Math.random() * MAX_VALUE) + 1;
//        return Die1faceValue;
//    }
//
//    public int roll2() {
//
//        Die2faceValue = (int) (Math.random() * MAX_VALUE) + 1;
//        return Die2faceValue;
//    }
//    public int sumOfTwo(){
//
//        sum = roll() + roll2();
//        return sum;
//        //System.out.println("Sum of two is : " + sum);
//
//    }

    @Override
    public String toString() {
        return "Die1 with faceValue " + Die1faceValue +
                "\nDie2 with faceValue " + Die2faceValue +
                "\nSum of two is : " + sumOfTwo();
    }

    public int getDie1FaceValue() {
        return Die1faceValue;
    }

    public void setDie1faceValue(int die1faceValue) {
        this.Die1faceValue = die1faceValue;
    }

    public int getDie2FaceValue() {
        return Die2faceValue;
    }

    public void setDie2faceValue(int die2faceValue) {
        this.Die2faceValue = die2faceValue;
    }

//    public int getSum(){
//        return sum;
//    }
//
//    public void setSum(int sum) {
//        this.sum = sum;
//    }
}
