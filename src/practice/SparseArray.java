package practice;
import java.util.*;

public class SparseArray {
    public static void main(String[] args) {
        String[] string_arr1 = {"ab", "ab", "abc"};
        String[] string_arr2 = {"aba","baba","aba","xzxb"};
        String[] string_arr = {"def","de","fgh"};
        String[] queries_arr1 = {"ab", "abc", "bc"};
        String[] queries_arr2 = {"aba", "xzxb", "ab"};
        String[] queries_arr = {"de", "lmn", "fgh"};
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < string_arr.length; i++) {
            strings.add(string_arr[i]);
        }
        for (int i = 0; i < queries_arr.length; i++) {
            queries.add(queries_arr[i]);
        }
    SparseArray sa = new SparseArray();
        List<Integer> result = new ArrayList<>();
        //result = sa.matchingStrings(strings,queries);
        int[] result1 = new int[queries_arr.length];
        result1 = sa.solve(string_arr,queries_arr);
        for(int i =0; i< result1.length; i++) {
            System.out.println(result1[i]);
        }
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        int n = strings.size();
        int m = queries.size();
        List<Integer> new_arr = new ArrayList<Integer>();
        for(int i=0; i<m; i++){
            int ans =0;
            for(int j=0; j<n; j++){
                if(strings.get(j) == queries.get(i))
                    ans++;
            }
            new_arr.add(ans);
        }
        return new_arr;
    }

    public int[] solve(String[] strings, String[] queries){
        int n = strings.length;
        int m = queries.length;
        int[] result = new int[m];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if (map.containsKey(strings[i]))
                map.put(strings[i],map.get(strings[i])+1);
            else
                map.put(strings[i],1);
        }

        for(int i=0; i<m; i++){
            if(map.containsKey(queries[i]))
               result[i] = map.get(queries[i]);
        }
        return result;
    }
}
