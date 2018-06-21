package ch5_pp;

public class Carddiver {
    public static void main(String[] args) {
        Card my_card = new Card();

        for(int i = 1; i < 50; i++){
            my_card.Roll();
            System.out.println(my_card);
        }
        //my_card.Roll();

    }
}
