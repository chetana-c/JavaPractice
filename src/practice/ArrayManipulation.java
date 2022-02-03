package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[][] arr3 = {{2,6,8},{3,5,7},{1,8,1},{5,9,15}};
        int[][] arr = {{1,2,100},{2,5,100},{3,4,100}};
        Integer[][] arr2 = {{1,2,100},{2,5,100},{3,4,100}};
        int[][] arr1 = {{1,5,3},{4,8,7},{6,9,1}};
        int n = 10;

        List list = new ArrayList();
        for(Integer[] array: arr2){
            list.add(Arrays.asList(array));
        }
        ArrayManipulation am = new ArrayManipulation();
        // long result = am.stringManipulate(n,arr1);
       // long result2 = am.arrayManipulate(n,arr3);
         long result_list = am.arrayManipulation(n,list);
        System.out.println("Result = "+result_list);

    }
    public long stringManipulate(int n, int[][] arr){
        int len = arr.length;
        int[] new_arr = new int[n+1]; // values should start from index 1
        for(int i=0; i<len; i++){
            for(int j=arr[i][0]; j<=arr[i][1]; j++){
                new_arr[j] += arr[i][2];
            }
        }
        Arrays.sort(new_arr);
        long res = new_arr[n];
        return res;
    }
    public long stringManipulateList(int n, List<List<Integer>> queries){
        int len = queries.size();
        long[] new_arr = new long[n+1]; // values should start from index 1
        for(int i=0; i<len; i++){
            for(int j=queries.get(i).get(0); j<=queries.get(i).get(1); j++){
                new_arr[j] += queries.get(i).get(2);
            }
        }
        Arrays.sort(new_arr);
        long res = new_arr[n];
        return res;
    }

    public long arrayManipulate(int n, int[][] arr){
        int len = arr.length;
        long[] new_arr = new long[n]; // values should start from index 1
        for(int i=0; i<len; i++){
            int start = arr[i][0]-1;
            int end = arr[i][1]-1;
            int add = arr[i][2];
            new_arr[start] += add;
            if(end+1 < n){
                new_arr[end+1] -= add;
            }
        }
        long max = Long.MIN_VALUE;
        for(int i=1; i<n; i++){
            new_arr[i] += new_arr[i-1];
            max = Math.max(max, new_arr[i]);
        }
        return max;

    }

    // O(n) time complexity - Uses Prefix Sum Concept
    public static long arrayManipulation(int n, List<List<Integer>> arr) {
        // Using the concept of Prefix sum
        int len = arr.size();
        long[] new_arr = new long[n]; // values should start from index 1
        for(int i=0; i<len; i++){
            int start = arr.get(i).get(0)-1;
            int end = arr.get(i).get(1)-1;
            int add = arr.get(i).get(2);
            new_arr[start] += add;
            if(end+1 < n){
                new_arr[end+1] -= add;
            }
        }
        long max = Long.MIN_VALUE;
        for(int i=1; i<n; i++){
            new_arr[i] += new_arr[i-1];
            max = Math.max(max, new_arr[i]);
        }
        return max;
    }

}
