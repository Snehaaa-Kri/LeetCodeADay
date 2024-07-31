import java.util.*;

public class Q961NRepeatedElementInSize2NArray {
    public static int freq(int[] nums, int el){
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(el == nums[i]){
                count++;
            }
        }
        return count;
    }
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length/2;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        Iterator<Integer> it = hs.iterator();

        while(it.hasNext()){
            int el = it.next();
            if(n == freq(nums ,el)){
                return el;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};

        System.out.println(repeatedNTimes(nums));
    }
}
