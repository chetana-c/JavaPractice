package practice;

public class PeakofArray {
    public static void main(String[] args) {

        int[] a = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int[] a2 = {18757, 13932, 7377, 19955, 24085, 4967, 11841, 19630, 16945, 12624, 24627, 32440, 26309};
        int[] a3 = {5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725, 6335};
        int[] a4 = {10549, 15882, 24856, 301, 16642, 14414, 19856};
        PeakofArray pa = new PeakofArray();
        pa.solve(a2);
         int result2 = pa.solve(a);
        int result = pa.solve2(a4);
         System.out.println(result);
    }

    // O(n2)
    public int solve(int[] a) {
        int n = a.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        int flag;
        for(int i =0;i <=n-1;i++){
            int left = Integer.MIN_VALUE;
            int right = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                left = Math.max(left,a[j]);
            }
            leftMax[i] = left;
            for(int k =i; k<=n-1;k++){
                right = Math.min(right,a[k]);
            }
            rightMin[i] = right;
        }
        for (int i =0;i<n;i++){
            if(a[i] >= leftMax[i] && a[i] <= rightMin[i]) {
                //System.out.println("Success " + a[i]);
                return flag = 1;
            }

//            System.out.println("Left Max Array: "+ leftMax[i] + " index - " + i );
//            System.out.println("Element in the Array: "+ a[i] + " index - " + i );
//            System.out.println("Right Min Array: "+ rightMin[i]+ " index - " + i);
        }
        return flag = 0;
    }

    public int solve2(int[] a){
        int n = a.length;
        int left = a[0];
        int right = a[n-1];
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        for(int i =0;i<=n-1;i++){
            if(left < a[i])
                left = a[i];
            leftMax[i] = left;
        }
        for(int i = n-1; i>=0;i--){
            if(right>a[i])
                right = a[i];
            rightMin[i] = right;
        }
        for(int i =1;i<n-1;i++) {
            if (a[i] > leftMax[i-1] && a[i] < rightMin[i+1])
                return 1;
        }
         return 0;
    }
}
