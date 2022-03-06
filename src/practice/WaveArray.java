package practice;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        WaveArray wa = new WaveArray();
        int[] res = wa.wave(A);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public int[] wave(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        int index = 0;
        for(int i=1; i<len; i+=2){
            int temp = 0;
            temp = A[i-1];
            A[index++] = A[i];
            A[index++] = temp;
        }
        return A;
    }
}
