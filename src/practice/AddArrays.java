package practice;

import java.util.ArrayList;
import java.util.List;

public class AddArrays {
    public static void main(String[] args) {
        int[] A = {2, 1, 8, 9, 5};
        int[] B = {6, 7, 6, 7, 4, 1, 3, 0, 1, 8};
        AddArrays aa = new AddArrays();
        int[] res = aa.addArrays(A, B);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }

    }

    public int[] addArrays(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int numA = 0;
        long numB = 0;
        int ind1 = 0, ind2 =0;
        for(int i=a-1; i>=0; i--){
            double factor = Math.pow(10,i);
            numA += A[ind1++]*factor;
        }
        for(int i=b-1; i>=0; i--) {
            long factor = (long) Math.pow(10,i);
            numB += B[ind2++] * factor;
        }
        long numSum = numA+numB;
        List<Integer> list = new ArrayList<>();
        while(numSum != 0){
            long mod = numSum%10;
            numSum = numSum/10;
            list.add((int)mod);
        }
        int n = list.size();
        int[] arr = new int[n];
        int index =0;
        for(int i=n-1; i>=0; i--){
            arr[index++] = list.get(i);
        }
        return arr;
    }
}
