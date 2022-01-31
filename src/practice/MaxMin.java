package practice;
import java.util.*;

public class MaxMin {

    public static void main(String[] args) {

        int[] A = {6,-1,-2,-3,0,1,2,3,4};
        MaxMin mm = new MaxMin();
        int result = mm.sum(A);
        System.out.println("Result = "+ result);
    }

    public int sum(int[] A){
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length - 1];
        return min+max;
    }
}
