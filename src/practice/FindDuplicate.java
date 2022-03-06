package practice;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] a = {3,4,1,4,1};
        FindDuplicate f = new FindDuplicate();
        int res = f.repeatedNumber(a);
        System.out.println(res);
    }
    public int repeatedNumber(final int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        int res = 0;
        for(int i=0; i<map.size(); i++){
            if(map.get(A[i]) > 1){
                res = A[i];
                break;
            }
        }
        return res;
    }
}
