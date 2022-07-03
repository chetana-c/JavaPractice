package DSA;

public class PeakElement {
    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        int[] arr = {1,2,3,1};
       int res =  pe.peak(arr);
        System.out.println(res);
    }

    public int peak(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1])
            {end = mid;}
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
