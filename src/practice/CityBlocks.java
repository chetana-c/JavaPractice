package practice;
import java.util.*;

public class CityBlocks {

    public static void main(String[] args) {

        String[][] matrix = {{"a", "b", "c"},{"d", "e", "f"},{"g", "h", "i"}};
        String[] blocks = {"h", "b", "c"};

        CityBlocks cb = new CityBlocks();
        int result = cb.solve(matrix,blocks);
        System.out.println("City Distance = "+result);
    }

    public int solve (String[][] matrix, String[] blocks){
        HashMap<String, int[]> block = new HashMap<>();
        int[] cur = {0,0};
        int len = 0;
        for( int i =0 ;i< matrix.length;i++){
            for (int j =0 ;j< matrix[i].length; j++){
                // System.out.println(matrix[i][j]);
                int[] pos= {i,j};
                block.put(matrix[i][j], pos);
            }
        }
        for ( int i =0; i<blocks.length;i++){
            int[] pos = block.get(blocks[i]);
            len += (Math.abs(pos[0] - cur[0]) + Math.abs(pos[1] - cur[1]));
            cur = pos;
        }

        return len;
    }
}