package PP_Excerice.Lab7_Solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arraySum(arr));

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] rowsums = rowSums(arr2D);

        System.out.println(Arrays.toString(rowsums));

        int[][] arr2D_diverse = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2D_not_diverse = {{1, 2, 3}, {3, 2, 1}, {7, 8, 9}};
        System.out.println(isDiverse(arr2D_diverse));
        System.out.println(isDiverse(arr2D_not_diverse));
    }

    /** (a)
     * Returns the sum of the entries in the one-dimensional array arr.
     * @param arr
     * @return int
     */
    public static int arraySum(int[] arr) {
        int result = 0;
        for(int elem: arr) {
            result += elem;
        }
        return result;
    }

    /**
     * Returns a one-dimensional array in which the entry at index k is the sum of the entries of
     * row k of the two-dimensional array arr2D
     * @param arr2D
     * @return int[]
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] rowSum = new int[arr2D.length];
        for(int row = 0; row < arr2D.length; row++) {
            rowSum[row] = arraySum(arr2D[row]);
        }
        return rowSum;
    }

    /**
     * Returns true  if all rows in arr2D have different row sums'
     *         false otherwise
     * @param arr2D
     * @return boolean
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for(int i = 0; i < sums.length - 1; i++) {
            for(int j = i + 1; j < sums.length; j++){
                if (sums[i] == sums[j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
