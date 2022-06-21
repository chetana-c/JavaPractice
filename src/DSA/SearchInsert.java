package DSA;

public class SearchInsert {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 5;
        SearchInsert bs = new SearchInsert();
        int result = bs.searchInsert(arr,target);
        System.out.println(result);
    }
    public int searchInsert(int[] arr, int target){
        int n = arr.length;
        int left =0, right=n-1;
        while(left <= right){
            int pivot = left + (right - left)/2;
            if(target == arr[pivot]) return pivot;
            else if(target < arr[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return left;
    }
}
