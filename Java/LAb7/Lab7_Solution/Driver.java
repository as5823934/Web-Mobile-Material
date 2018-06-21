package PP_Excerice.Lab7_Solution;

/**
 * Created by Derrick on 2017-11-28.
 */
public class Driver {

    public static void main(String[] args) {
        SparseArray arr = new SparseArray();
        SparseArrayEntry e0 = new SparseArrayEntry(5, 1, 70); //
        SparseArrayEntry e1 = new SparseArrayEntry(0, 0, 100);
        SparseArrayEntry e2 = new SparseArrayEntry(1, 1, 90); //
        SparseArrayEntry e3 = new SparseArrayEntry(1, 3, 70);

        arr.entries.add(e0);
        arr.entries.add(e1);
        arr.entries.add(e2);
        arr.entries.add(e3);


        arr.removeColumn(1);

        for(SparseArrayEntry e : arr.entries) {
            System.out.println(e.getRow() + " " + e.getCol() + " :" + e.getValue());
        }

        Range r1 = new Range(0, 10);
        System.out.println("Range(0, 10) contains 11?: " + r1.contains(11));
        System.out.println("Range(0, 10) contains 7?: " + r1.contains(7));


        NumberGroup r2 = new Range(5, 10);
        NumberGroup r3 = new Range(1, 7);
        NumberGroup r4 = new Range(2, 4);
        NumberGroup r5 = new Range(5, 8);

        MultipleGroups mp = new MultipleGroups();
        mp.addNumberGroup(r2);
        mp.addNumberGroup(r3);
        mp.addNumberGroup(r4);
        mp.addNumberGroup(r5);

        mp.contains(7);




    }
}
