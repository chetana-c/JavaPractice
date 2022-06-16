package practice;

public class PairTwo {
    public static void main(String[] args) {
        PairTwo pt = new PairTwo();
        int[] a = {2,7,11,15};
        int d = 9;
        int[] res =  pt.solve(a,d);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    public int[] solve(int[] A, int d){
        int len = A.length;
        int[] arr = new int[2];
        int index =0;
        for(int i=0 ;i<len; i++){
            for(int j=i+1; j<len; j++){
                if(A[i] + A[j] == d){
                    arr[index++] = i;
                    arr[index] = j;
                }
            }
        }
        return arr;
    }
}
