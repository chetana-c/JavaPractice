package practice;

public class ShortestSubList {
    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 3, 8, 9};
        ShortestSubList ss = new ShortestSubList();
        int result = ss.solve(nums);
        System.out.println("Result = "+ result);

    }

    public int solve(int[] nums){
        int length = 0;
        for ( int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1; j>0; j--){
                if(nums[i] > nums[i+1] && nums[j-1] > nums[j]){
                    length = j-i+1;
                }
            }
        }
        return length;
    }
}
