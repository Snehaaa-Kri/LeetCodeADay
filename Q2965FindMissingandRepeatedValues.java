import java.util.HashSet;
import java.util.Set;

public class Q2965FindMissingandRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int n = grid.length * grid[0].length;
        Set<Integer> seen = new HashSet<>();
        int actualSum = 0;
        int repeated = -1;

        for (int[] row : grid) {
            for (int num : row) {
                if (seen.contains(num)) {
                    repeated = num;
                } else {
                    seen.add(num);
                }
                actualSum += num;
            }
        }

        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - (actualSum - repeated);

        result[0] = repeated;
        result[1] = missing;

        return result;
    }
    public static void main(String[] args) {

        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};

        int[] arr = findMissingAndRepeatedValues(grid);

        System.out.println(arr[0] + "  "+arr[1]);
         
    }     
}
