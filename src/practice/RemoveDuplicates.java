package practice;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    // modify the array to print the de-duplicated array
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arr = {1,1,2};
        int res = rd.removeDuplicates(arr);
        System.out.println(res);
    }
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int[] res = new int[len];
        for(int i=0; i<len; i++){
            if(map.containsKey(nums[i])){
                continue;
            }
            else
            {
                map.put(nums[i],1);
                nums[index++] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        return index;

    }

    public int removeDuplicates2(int[] nums) {
        int len = nums.length;
        int index = 0;
        for(int i=0; i< len ;i++){
            if(i < len - 1  && nums[i] == nums[i+1]){
                continue;
            }
            nums[index++] = nums[i];
        }
        return index;
    }
}
