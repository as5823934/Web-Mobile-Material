package PP_Excerice.PP4;
import java.util.Scanner;

public class PP4_13_RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("[1] Rock  [2] Paper  [3] Scissor [0] quit");
        int input = scan.nextInt();
        String suit[] = {"Rock", "Paper", "Scissor"};

        int round = 0;
        int iWin = 0;
        int pcWin = 0;
        int tie = 0;

        while(input != 0) {

            String pcSuit = suit[(int)(Math.random() * suit.length)];
            if(input > 3){
                System.out.println("--please enter valid number 0 to 3--");
            }
            if (input == 1) {
                if (pcSuit.equals(suit[2])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("I win");
                    iWin++;
                } else if (pcSuit.equals(suit[1])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Pc win");
                    pcWin++;
                } else {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Tie");
                    tie++;
                }
            } else if (input == 2) {
                if (pcSuit.equals(suit[0])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("I win");
                    iWin++;
                } else if (pcSuit.equals(suit[2])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Pc win");
                    pcWin++;
                } else {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Tie");
                    tie++;
                }
            } else if (input == 3) {
                if (pcSuit.equals(suit[0])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("I win");
                    iWin++;
                } else if (pcSuit.equals(suit[1])) {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Pc win");
                    pcWin++;
                } else {
                    System.out.println(suit[input-1] + " VS " + pcSuit);
                    System.out.println("Tie");
                    tie++;
                }
            }
            System.out.print("[1] Rock  [2] Paper  [3] Scissor [0] quit");
            input = scan.nextInt();
            round++;
        }
        if(input == 0){
            System.out.println("=====================================");
            System.out.println("My Score: " + iWin + " / " + round);
            System.out.println("Pc Score: " + pcWin + " / " + round);
            System.out.println("Tie: "+ tie);
            System.out.println("=====================================");
        }
    }

}
