package practice;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int[][] res = pt.solve(5);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] solve(int A) {
        int res[][] = new int[A][];
        int i , j;
        for(i = 0; i < A; i++)
        {
            res[i] = new int[i+1];
            res[i][0] = res[i][i] = 1;
        }
        for(i = 2; i < A; i++)
        {
            for(j = 1; j < i; j++)
            {
                res[i][j] = res[i-1][j-1] + res[i-1][j];
            }
        }
        return res;
    }
}
