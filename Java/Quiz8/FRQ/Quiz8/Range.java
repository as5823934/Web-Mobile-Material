package MyPractice.Quiz8;

public class Range implements NumberGroup {
    private int min , max;

    public Range(int min, int max){
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
