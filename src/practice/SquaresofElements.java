package practice;

import java.util.Arrays;

public class SquaresofElements {
    public static void main(String[] args) {

        int[] a = {-6,-3,-1,2,4,5};
        SquaresofElements se = new SquaresofElements();
        int[] res = se.solve(a);
        for(int i=0;i<res.length; i++){
            System.out.print(res[i]+", ");
        }
    }
    public int[] solve(int[] a){
        int n = a.length;
        int[] squares = new int[n];
        for(int i=0; i<n;i++){
            squares[i] = a[i]*a[i];
        }
        Arrays.sort(squares);

        return squares;

    }
}
