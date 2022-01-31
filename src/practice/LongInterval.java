package practice;

import java.util.Arrays;

public class LongInterval {

    public static void main(String[] args) {
        int result =0 ;
        int [] nums = {5, 50000, 60000};
        int len = nums.length;
        if(len == 1){
            result = 100000 - nums[0];
        }
        int max = 0;
        Arrays.sort(nums);



        for (int i =0;i < len-2; i++){
            int interval = (nums[i+2] - nums[i]) - 1 ;
            if (interval > max){
                max  = interval;
            }
        }
        int fin_int = (100000 - nums[len -2]);

        if(max >= fin_int)
            result = max;
            else
                result = fin_int;

        System.out.println("Result" + result);

    }
}
