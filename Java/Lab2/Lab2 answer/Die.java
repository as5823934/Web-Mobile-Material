package ch5_pp;

public class Die {
    // Attributes
    private final int MAX_VALUE = 6;
    private int faceValue;

    //Constructor
    public Die() {
        int faceValue = 1;
    }

    //Methods
    public void roll() {
        // Set the faceValue of this die
        // with random int from 1 to 6

        // double 1 <= Math.random() * 6 + 1 < 7
        int newFaceValue = (int) (Math.random() * MAX_VALUE) + 1;
        faceValue = newFaceValue;
        System.out.println("Die value has changed to " + faceValue);
    }
    public void sumOfTwo(){

    }

    @Override
    public String toString() {
        return "Die with faceValue " + faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int newFaceValue) {
        if(newFaceValue <= MAX_VALUE && newFaceValue >= 1) {
            faceValue = newFaceValue;
        }
        else {
            System.out.println("FaceValue has to be from 1 to " + MAX_VALUE);
        }

    }

}
