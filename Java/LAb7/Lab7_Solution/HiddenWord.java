package PP_Excerice.Lab7_Solution;

/**
 * Created by Derrick on 2017-11-28.
 */
public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        // String builder pattern
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.substring(i, i + 1).equals(this.word.substring(i, i + 1))) {
                hint += guess.substring(i, i + 1);
            } else if (this.word.indexOf(guess.substring(i, i + 1)) != -1) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("Harps");
        System.out.println(puzzle.getHint("aaaaa"));
        System.out.println(puzzle.getHint("Hello"));
    }
}
