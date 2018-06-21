package ch5_pp;

public class Card {
    private int faceValue;
    private String suitsValue;
    private final int FACEMAX = 13;
    private String[] suits = {"diamonds", "clubs", "hearts", "spades"};

    public Card() {
        faceValue = 1;
        suitsValue = suits[0];
    }

    public void Roll(){
        faceValue = (int)(Math.random() * FACEMAX) + 1;
        suitsValue = suits[(int)(Math.random() * suits.length)];
    }

    @Override
    public String toString(){
        return "face = " + faceValue + "\tsuit = " + suitsValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String getSuitsValue() {
        return suitsValue;
    }

    public void setSuitsValue(String suitsValue) {
        this.suitsValue = suitsValue;
    }
}

