import java.util.HashSet;

public class Q2367NumberOfArithmeticTriplets {
    public static int arithmeticTriplets(int[] nums, int diff) {
        //O(n) - OPTIMISED APPROACH
        HashSet<Integer> hs = new HashSet<>();

        for(int el : nums){
            hs.add(el);
        }


        int count=0;
        for(int el : nums){
            if(hs.contains(el-diff) && hs.contains(el+diff)){
                count++;
            }
        }

        return count;

        //O(n^3) -- BRUTE FORCE


        // int count =0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
        //                 count++;
        //             }
        //         }
        //     }
        // }

        // return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;

        System.out.println(arithmeticTriplets(nums, diff));
    }
}
