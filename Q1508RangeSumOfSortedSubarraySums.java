import java.util.*;

public class Q1508RangeSumOfSortedSubarraySums {

    public static int rangeSum(int[] nums, int n, int left, int right) {

        ArrayList<Integer> subArrList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allSubArrays = new ArrayList<>();

        int idx=0;

   
            for(int i=0; i<n; i++){
                for(int j=i; j<n; j++){
                    ArrayList<Integer> subArrays = new ArrayList<>();
                    int subArrSum =0;
                    for(int k=i; k<=j; k++){
                        if(idx==10){
                            break;
                        }
                        subArrays.add(nums[k]);
                        subArrSum += nums[k];
                    }
                    subArrList.add(subArrSum);
                    allSubArrays.add(subArrays);
                    idx++;
                }
            }
   

        // System.out.println(allSubArrays);


        Collections.sort(subArrList);
        
        System.out.println(subArrList);

        int sum =0;
        for(int i=left-1; i<right; i++){
            sum += subArrList.get(i);
        }

        return sum;
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,3,4}; 
        // int n = 4, left = 1, right = 5;
        int[] nums = {7,5,8,5,6,4,3,3}; 
        int n = 8, left = 2, right = 6;

        System.out.println(rangeSum(nums, n, left, right));
    }
}
