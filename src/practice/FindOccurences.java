package practice;
import java.util.*;

public class FindOccurences {
    public static void main(String[] args) {

        int[] A = {4,4,4,2,2,1,1,8,8,9,9,9,9};
        int[] A2 = {4,3,3};
        // {4,4,4,2,2,1,1,8,8,9,9,9,9} => {1,1,2,2,4,4,4,8,8,9,9,9,9} => {2,2,3,2,4}
        FindOccurences fo = new FindOccurences();
        // int[] list = fo.solve(A);
        // int[] list2 = fo.findOccurences(A);
        int[] list2 = fo.findOccurences(A2);
        for(int i=0;i<list2.length;i++){
            System.out.print(list2[i] + ",");
        }
    }

    // limited to certain array size
    public int[] solve(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int[] count = new int[100];
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = a[i];
            count[tmp]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                list.add(count[i]);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    // for array size when constraint given as 10^9
    public int[] findOccurences(int[] A) {

        Arrays.sort(A);
        int count = 1;
        List<Integer> list = new ArrayList<>();
        int num = A[0];
        for (int i = 1; i < A.length; i++) {
            if (num == A[i]) {
                count++;
            } else {
                num = A[i];
                list.add(count);
                count = 1;

            }
        }
        list.add(count);
        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}