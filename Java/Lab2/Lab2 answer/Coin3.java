package ch5_pp;

public class Coin3 {

    public enum F {
        HEADS("Heads"), TAILS("Tails");

        public String face;

        F(String face) {
            this.face = face;
        }

        public String getFace() {
            return face;
        }
    }

    F face1 = F.HEADS;
    F face2 = F.TAILS;


    public Coin3() {
    }

    private String f;

    public void flip() {
        if ((int) (Math.random() * 2) == 0) {
            f = face1.getFace();
        } else {
            f = face2.getFace();
        }
    }

    public String getFace2() {
        return f;
    }

    public String toString() {
        return f;
    }
}