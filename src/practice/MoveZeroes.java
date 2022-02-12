package practice;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        MoveZeroes mz = new MoveZeroes();
        int[] result = new int[a.length];
        result = mz.solve(a);
        for(int val : result)
            System.out.print(val + ",");

    }

    public int[] solve(int[] A) {
        int[] B = new int[A.length];
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                B[k] = A[i];
                k++;
            }
        }
        return B;
    }
}
