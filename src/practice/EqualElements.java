package practice;

import java.util.Arrays;

public class EqualElements {
    public static void main(String[] args) {
        int[] A = {3, 2, 3, 3, 1, 2, 3, 2, 2, 1, 2, 2, 1, 3, 2, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 3, 3, 1, 1, 3, 3, 3, 2, 3, 2};
        int[] A1 = {1, 2, 3};
        int B = 2;
        int B1 = 1;
        EqualElements ee = new EqualElements();
         int result = ee.solution(A1, B1);
        System.out.println("Result = " + result);


    }
    public int gcd(int a, int b){
        while(b != 0){
            a = b;
            b = a%b;
        }
        return a;
    }

    public int gcdArr(int[] a){
        int res = a[0];
        for(int i=0; i<a.length; i++){
            gcd(res, a[i]);
        }
        return res;
    }

    public int solution(int[] A, int B){
        int min = A[0];
        for (int i = 1; i < A.length; i++)
            min = Math.min(min, A[i]);

        int k = min + B;
        for (int val : A) {
            if ((val < k && val + B != k) || (val > k && val - B != k))
                return 0;
        }

        return 1;
    }

}

