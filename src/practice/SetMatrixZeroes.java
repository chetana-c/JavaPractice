package practice;
import java.util.*;

public class SetMatrixZeroes {
    /*Input 2:
    [   [1, 0, 1],
        [1, 1, 1],
        [1, 0, 1]   ] */

    /*
Output 2:
    [   [0, 0, 0],
        [1, 0, 1],
        [0, 0, 0]   ]*/
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {1, 0, 1}};

        SetMatrixZeroes smz = new SetMatrixZeroes();
       smz.setZeroes(matrix);
      //  System.out.println("Length :"+matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
              //  System.out.println(matrix[i][j]);
            }
        }
    }

    public int[][] setZeroes(int[][] a){
        ArrayList<ArrayList<Integer>> zeropos = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<a.length;i++){
            for(int j=0; j< a.length; j++){
              //  System.out.print(" a[i][j] :"+a[i][j]);
                if(a[i][j] == 0){
                   ArrayList<Integer> pos = new ArrayList<>();
                   pos.add(i);
                    pos.add(j);
                   zeropos.add(pos);
                }
                }
            }
        for (int i=0;i<a.length;i++) {
            for (int k = 0; k < zeropos.size(); k++) {
                a[zeropos.get(k).get(0)][i] = 0;
                a[i][zeropos.get(k).get(1)] = 0;
            }
        }


        for(int i =0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + ",");
            }
            }
            return a;
    }
    // fastest solution

    public void setZeroes2(ArrayList<ArrayList<Integer>> a) {
        int m=a.size();
        int n=a.get(0).size();
        boolean row[] = new boolean[a.size()];
        boolean col[] = new boolean[a.get(0).size()];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a.get(i).get(j)==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]) a.get(i).set(j,0);
            }
        }
    }
}
