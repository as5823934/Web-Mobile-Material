package PP_Excerice.Lab7_Solution;

/**
 * Created by Derrick on 2017-11-28.
 */
public class SparseArrayEntry {
    private int row;
    private int col;

    private int value;

    public SparseArrayEntry(int r, int c, int v) {
        this.row = r;
        this.col = c;
        this.value = v;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getValue() {
        return value;
    }
}
