package PP_Excerice.Lab7_Solution;

/**
 * Created by Derrick on 2017-11-28.
 */
public class Range implements NumberGroup {

    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean contains(int num) {
        if (num <= max && num >= min) {
            return true;
        }
        return false;
    }
}
