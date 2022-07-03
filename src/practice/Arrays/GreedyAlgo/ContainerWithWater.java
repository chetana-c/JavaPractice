package practice.Arrays.GreedyAlgo;

public class ContainerWithWater {

    public static void main(String[] args) {
        ContainerWithWater cw = new ContainerWithWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int res = cw.maxArea(arr);
        System.out.println(res);
    }

    public int maxArea(int[] arr){
        int n = arr.length;
        int maxArea = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            int leftval = arr[left];
            int rightval = arr[right];
            int distance = Math.abs(right - left);
            int area = distance * Math.min(leftval , rightval);

            if(area > maxArea) maxArea = area;
            if(Math.min(leftval, rightval) == leftval)
                left++;
            else right--;

        }
        return maxArea;
    }
}
