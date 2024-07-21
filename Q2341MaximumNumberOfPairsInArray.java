import java.util.HashMap;

public class Q2341MaximumNumberOfPairsInArray {

    public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[2];

        for(int el : nums){
            if(!hm.containsKey(el)){
                hm.put(el, 1);
            }
            else{
                hm.put(el, hm.get(el)+1);
            }
        }

        int pairs =0;
        for(int key : hm.keySet()){

            while(!(hm.get(key) < 2)){
                pairs++;
                hm.put(key, hm.get(key)-2);
            }
        }
        arr[0] = pairs;

        int leftOver =0;

        for(int key: hm.keySet()){
            leftOver += hm.get(key);
        }

        arr[1] = leftOver;

        return arr;

    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};

        int ans[] = numberOfPairs(nums);

        System.out.println(ans[0]+", "+ans[1]);
    }
}
