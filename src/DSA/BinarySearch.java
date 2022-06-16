package DSA;

public class BinarySearch {
     public static void main(String[] args) {
         int[] arr = {-1,2,4,8,9,6};
         int target = 9;
         BinarySearch bs = new BinarySearch();
         int result = bs.search(arr,target);
         System.out.println(result);
    }

    public int search(int[] arr, int target){
         int len = arr.length;
         int left = 0, right = len-1;
         while(left <= right){
             int pivot = left + (right - left)/2;
             if(target == arr[pivot]) return pivot;
             if(target < arr[pivot]) right = pivot-1;
             else left = pivot+1;
         }
         return -1;
    }
}
