package ch5_pp;

public class Coin2 {

    private String face;


    public Coin2() {
        flip();
    }

    public void flip(){
        face = String.valueOf((int) (Math.random() * 2) == 0);

    }
    @Override
    public String toString(){
        if(Boolean.valueOf(face) == true){
            return "Heads";
        }
        else {
            return "Tail";
        }
    }

    public boolean getFace() {
        return Boolean.valueOf(face);
    }


}
