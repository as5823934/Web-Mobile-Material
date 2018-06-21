package PP_Excerice.Lab7_Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by Derrick on 2017-11-28.
 */
public class SparseArray {

    private int numRows;
    private int numCols;

    public List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int row, int col) {
        for(SparseArrayEntry elem: entries) {
            if (elem.getRow() == row && elem.getCol() == col) {
                return elem.getValue();
            }
        }
        return 0;
    }

    public void removeColumn(int col) {
        int i = 0;
        while (i < entries.size()) {
            SparseArrayEntry entry = entries.get(i);
            if (entry.getCol() == col) {
                entries.remove(entry);
            } else if (entry.getCol() > col) {
                int r = entry.getRow();
                int c = entry.getCol();
                int v = entry.getValue();
                entries.set(i, new SparseArrayEntry(r, c-1, v));
                i++;
            } else {
                i++;
            }
        }
        numCols--;

    }
}
