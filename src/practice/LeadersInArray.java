package practice;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    // Can try using stacks
    public static void main(String[] args) {
        int[] A = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26};
        LeadersInArray la = new LeadersInArray();
        int[] result = la.solve(A);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
    public int[] solve(int[] A) {
        // maximum of the minimums
        int n = A.length;
        int[] rightMax = new int[n];
        int right = A[n-1];
        for(int i=n-1; i>=0; i--){
            if(right < A[i])
                right = A[i];
            rightMax[i] = right;
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(A[n-1]);
        int len = rightMax.length;
        int k=0;
        for(int i=0; i<n-1; i++){
            if(A[i] >= rightMax[i+1])
                list.add(A[i]);
        }

        int[] leaders = new int[list.size()];
        for(int i=0; i<leaders.length; i++){
            leaders[i] = list.get(i);
        }
        return leaders;
    }
}
