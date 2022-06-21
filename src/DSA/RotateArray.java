package DSA;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        ra.rotate(nums,k);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int mod = k%n;
        reverse(nums, 0, n-mod-1);
        reverse(nums, n-mod, n-1);
        reverse(nums, 0, n-1);
    }

    public void reverse(int[] nums,int low,int high){
        int temp = 0;
        while(low < high){
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
