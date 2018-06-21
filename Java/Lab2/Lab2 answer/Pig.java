package ch5_pp;

public class Pig {
    private final int MAX_VALUE = 6;
    private int Die1faceValue, Die2faceValue, comDie1Face, comDie2Face, mySum, comSum;

    public Pig() {
        Die1faceValue = 1;
        Die2faceValue = 1;
        comDie1Face = 1;
        comDie2Face = 1;
    }

    //Methods
    public void my_Roll(){
        Die1faceValue = (int) (Math.random() * MAX_VALUE) + 1;
        Die2faceValue = (int) (Math.random() * MAX_VALUE) + 1;
    }

    public void com_Roll(){
        comDie1Face = (int) (Math.random() * MAX_VALUE) + 1;
        comDie2Face = (int) (Math.random() * MAX_VALUE) + 1;
    }
    public void mySumOfTwo(){
         mySum = getMySum();
    }

    public void comSumofTwo(){
        comSum = getComSum();
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

    public int getComDie1Face() {
        return comDie1Face;
    }

    public void setComDie1Face(int comDie1Face) {
        this.comDie1Face = comDie1Face;
    }

    public int getComDie2Face() {
        return comDie2Face;
    }

    public void setComDie2Face(int comDie2Face) {
        this.comDie2Face = comDie2Face;
    }

    public int getMySum(){
        mySum = Die1faceValue + Die2faceValue;
        return mySum;
    }

    public void setMySum(int mySum) {
        this.mySum = mySum;
    }

    public int getComSum() {
        comSum = comDie1Face + comDie2Face;
        return comSum;
    }

    public void setComSum(int comSum) {
        this.comSum = comSum;
    }
}
