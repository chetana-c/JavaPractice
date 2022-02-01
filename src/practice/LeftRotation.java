package practice;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 4;
        LeftRotation lr = new LeftRotation();
        int[] result = lr.rotateLeft(arr, d);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }

    public int[] rotateLeft(int[] arr, int d){
        int n = arr.length;
        int mod = d%n ;
        int[] new_arr = new int[n];
        for(int i=0; i<n; i++){
            new_arr[i] = arr[(i+mod)%n];
        }

        return new_arr;
    }
}
