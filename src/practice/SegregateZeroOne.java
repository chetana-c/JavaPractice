package practice;

import java.util.Arrays;

public class SegregateZeroOne {
    public static void main(String[] args) {
        int[] A = {0,0,0,0,1,1,1,1,1};
        int[] A2 = {0,1,2,3};
        SegregateZeroOne sz = new SegregateZeroOne();
       // int[] result1 = sz.solve(A);
        int[] result = sz.solve1(A2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
    public int[] solve(int[] arr){
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        for(int i=0 ;i<n ;i++){
            if(arr[i] == 0){
                count0++;}
        }

        int[] new_arr = new int[n];
        Arrays.fill(new_arr,1);
        for(int i=0; i<count0; i++){
            new_arr[i] = 0;
        }
        return new_arr;
    }

    public int[] solve1(int[] A) {
        int n = A.length;
        int[] new_arr = new int[n];
        int index = 0;
        for(int i=0 ;i<n; i++){
            if(A[i] != 0)
                new_arr[index++] = A[i];
        }
        return new_arr;
    }
}
