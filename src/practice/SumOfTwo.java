package practice;
import java.util.*;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] input = {35, 8, 18, 3, 22};
        int k = 11;

        SumOfTwo st = new SumOfTwo();
        //boolean result = st.solve(input, k);
        int[] result2 = st.twoSum(input, k);
        System.out.println("Result = "+ result2);
    }

    // O(n2)
    public boolean solve(int[] input, int k){
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                    if (input[i] + input[j] == k)
                        return true;
                }
            }
            return false;
        }

    // O(n)
    public boolean solve2(int[] input, int k){

        int n = input.length;
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n ;i++){
            if(list.contains(k - input[i])){
                return true;
            }
            else{
                list.add(input[i]);
            }
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] arr = new int[2];
        // for(int i=0; i<len; i++){
        //     for(int j=i+1; j<=len-1; j++){
        //         if(nums[i] + nums[j] == target){
        //             arr[0] = i;
        //             arr[1] = j;
        //         }
        //     }
        // }
        // return arr;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if(map.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
