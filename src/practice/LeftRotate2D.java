package practice;

public class LeftRotate2D {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] d = {2,3};
    LeftRotate2D lr = new LeftRotate2D();
    int[][] result = lr.rotateLeft(arr, d);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                  System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] rotateLeft(int[] arr, int[] d){
        int n = arr.length;
        int num = d.length;

        int[][] new_arr = new int[num][n];
        for(int j=0; j<d.length; j++){
            int r = d[j];
            int mod = r%n ;
            for(int i=0; i<n; i++){
                new_arr[j][i] = arr[(i+mod)%n];
            }
        }
        return new_arr;
    }
}
