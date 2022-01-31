package practice;

public class PickFromBothSides {

    public static void main(String[] args) {

        int[] A = {5,5,2,5,8};
        int B = 3;
        PickFromBothSides ms = new PickFromBothSides();
        int a = ms.maxSum(A,B);
        System.out.println("Max Sum = "+a);
    }

    public int maxSum(int[] A, int B){
        int n = A.length;
        int cur_sum = 0;
        for(int i = 0; i< B;i++){
            cur_sum += A[i];
        }
        int maxsum =  cur_sum;
        int inc = n-1 ; int exc = B-1;
        while(inc >= 0 && exc >= 0){
            cur_sum += A[inc--];
            cur_sum -= A[exc--];
            maxsum = Math.max(maxsum, cur_sum);
        }
        return maxsum;
    }
}
