package practice;

public class Bribing {
    public static void main(String[] args) {
        Bribing br = new Bribing();
        int[] A = {2,1,5,3,4};
        int[] B = {2,2,2,2,2};
        int result = br.solve2(A,B);
        System.out.println("Result = "+result);
    }
    public int solve2(int[] A, int[] B) {
        int n = A.length;
        int[] index = new int[n + 1];
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = A[i - 1];
            b[i] = B[i - 1];
            index[a[i]] = i;
        }
        int flag = 0;
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            if (index[i] == i) continue;
            int temp = index[i];
            int gap = i - index[i];
            if (gap < 0 || b[i] < gap) {
                flag = 1;
                break;
            }
            b[i] -= gap;
            ans += gap;
            for (int j = temp; j < i; j++) {
                int p = a[j];
                a[j] = a[j+1];
                a[j+1] = p;
                p = index[a[j]];
                index[a[j]] = index[a[j+1]];
                index[a[j+1]] = p;
            }
        }
        if (flag==1) return -1;
        return ans;

    }
}
