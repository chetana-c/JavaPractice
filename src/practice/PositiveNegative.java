package practice;

public class PositiveNegative {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        PositiveNegative pn = new PositiveNegative();
        int[] result = pn.solve(a);
        for(int i=0 ;i< result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public int[] solve(int[] A){
        int len = A.length;
        int pos = 0;int neg = 0;
        for(int i=0 ;i<len; i++){
            if(A[i] < 0)
                neg++;
            if(A[i] > 0)
                pos++;
        }
        int[] new_arr = new int[2];
        new_arr[0] = pos;
        new_arr[1] = neg;
        return new_arr;
    }
}
