package practice.Arrays.SlidingWindowTEchnique;

import java.util.ArrayList;

public class SubarrayWithSum {

    public static void main(String[] args) {
        SubarrayWithSum ss = new SubarrayWithSum();
        int[] arr = {1,2,3,4,5}; int sum = 6;
        ArrayList<Integer> res = ss.subarraySum(arr, sum);
        System.out.println(res.get(0)+","+ res.get(1));
    }

    public ArrayList<Integer> subarraySum(int[] arr, int sum){
        int start = 0;
        int end = 0;
        int currSum = 0;
        int n = arr.length;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum >= sum){
                end = i;
                while(currSum>sum && start <end){
                    currSum -= arr[start];
                    start++;
                }
                if(currSum == sum){
                    list.add(start + 1);
                    list.add(end + 1);
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false)
            list.add(-1);

        return list;
    }
}