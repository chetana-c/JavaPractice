package practice;

import java.util.HashMap;

public class RepeatMissing {
    public static void main(String[] args) {
        RepeatMissing rm = new RepeatMissing();
        int[] a = {3,1,2,5,3};
        int[] res = rm.repeatedNumber(a);
        System.out.println(res[0] + " , " + res[1]);
    }
    public int[] repeatedNumber(final int[] A) {

        int len = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        int[] res = new int[2];
        int num = 1;
        for(int i=0; i<len; i++){
            if(map.get(A[i]) == 2){
                res[0] = A[i];
            }
        }
        int[] present  = new int[10];
        for(int i=0 ;i<len; i++){
            present[A[i]] = 1;
        }
        for (int i = 1; i <= len; i++){
            if (present[i] != 1){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}

