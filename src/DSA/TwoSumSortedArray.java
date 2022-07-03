package DSA;

import java.util.HashMap;

public class TwoSumSortedArray {
    public int[] twoSum(int[] nums, int target){
        int[] arr = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(target - nums[i])){
                arr[0] = map.get(target-nums[i])+1;
                arr[1] = i+1;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
