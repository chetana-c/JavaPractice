package DSA;

public class SortSqauresArray {

public int[] sortedSquares(int[] nums){
    int len = nums.length;
    int[] res = new int[len];
    int left=0; int right = len-1;
    for(int i=len-1; i>=0; i--){
        if(Math.abs(nums[left]) > Math.abs(nums[right])){
            res[i] = nums[left]*nums[left];
            left++;
        }
        else{
            res[i] = nums[right]*nums[right];
            right--;
        }
    }
    return res;
}
}
