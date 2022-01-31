package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int[] nums = {7, 8, 9, 4, 2, 3, 4, 7, 8, 9, 10, 11, 12};
        for (int i : nums) list.add(i);

        Collections.sort(list);
        // 2,3,4,4,7,7,8,8,9,9,10,11,12
        int n = list.size();
        int len = 0;

        for(int i =1;i<n - 1;i++){

            int L = list.get(i-1) ;
            int R = list.get(i+1);
            int M = list.get(i);


            if(M-L <= 1 && R-M <= 1){
                int cnt = Math.max(len,i+1);
                // put the end index and the count into a map and put a max on the map
            }
        }
    }
}
