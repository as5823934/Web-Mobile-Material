package ch5_pp;

public class Coin {

    private boolean face;


    public Coin() {
        flip();
    }

   public void flip(){
        int test = (int) (Math.random() * 2);
        if(test == 0) {
            face = true;
        }
        else {
            face = false;
        }
    }
    @Override
    public String toString(){
        if(face == true){
            return "Heads";
        }
        else {
            return "Tail";
        }
    }

    public boolean getFace() {
        return face;
    }


}
