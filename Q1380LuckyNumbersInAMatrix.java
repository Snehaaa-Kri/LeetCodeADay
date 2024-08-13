import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1380LuckyNumbersInAMatrix {


    public static int  minRowEl(int[] row){
        int min = Integer.MAX_VALUE;

        for(int el : row){
            min = Math.min(min, el);
        }

        return min;
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int[] row : matrix){
            list.add(minRowEl(row));
        }

        Collections.sort(list);

        System.out.println(list);
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(list.get(list.size()-1));

        return ans;
    }
    public static void main(String[] args) {
        // int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix = {{3,6},{7,1},{5,2},{4,8}};


        System.out.println(luckyNumbers(matrix));
    }
}
