package practice;
import java.util.*;

public class MaxHourGlass {
    public static void main(String[] args) {

        int[][] matrix2 = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}};
        Integer[][] matrix = new Integer[][]{
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}};

        List<List<Integer>> lists = new ArrayList<>();
        for (Integer[] ints : matrix) {
            lists.add(Arrays.asList(ints));
        }

        MaxHourGlass mhg = new MaxHourGlass();
        int result = mhg.solve(matrix2);
        int result2 = mhg.solve2(lists);
        System.out.println("Result "+result2);
    }

    public int solve(int[][] a){
        int maxSum = Integer.MIN_VALUE;
        int hrglsum = 0;
        for(int i =0;i<a.length-2;i++){
            for(int j =0 ;j<a.length-2;j++){
                hrglsum = a[i][j]+ a[i][j+1]+ a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] +a[i+2][j+2];
                    maxSum = Math.max(maxSum,hrglsum);
                }
            }
        return maxSum;
    }

    public int solve2(List<List<Integer>> a){
        int maxSum = Integer.MIN_VALUE;
        int hrglsum = 0;
        for(int i =0;i<a.size()-2;i++){
            for(int j =0 ;j<a.size()-2;j++){
                hrglsum = a.get(i).get(j)+a.get(i).get(j+1)+ a.get(i).get(j+2) +a.get(i+1).get(j+1) +a.get(i+2).get(j) + a.get(i+2).get(j+1) +a.get(i+2).get(j+2);
                maxSum = Math.max(maxSum,hrglsum);
            }
        }
        return maxSum;
    }
}
