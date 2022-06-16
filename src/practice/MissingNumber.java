package practice;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] A = {1,2,3,4,5,6,8,9,10};
        int res = mn.solve(A);
        System.out.println("Result = "+ res);

    }
    public int solve(int[] A){
        int len = A.length;
        int num = 1;
        int result = 0;
        for(int i=0; i<len-1; i++){
            if(A[i]+1 != A[i+1])
                result = A[i]+1;
        }
        return result;
    }
}
