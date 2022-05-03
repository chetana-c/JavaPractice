package practice;

public class MakeThemEqual {
    public static void main(String[] args) {
        MakeThemEqual me = new MakeThemEqual();
        int[] A = {3, 1, 1, 3}; // expected O/P = 2
        int res = me.solve(A);
        System.out.println(res);

    }
    public int solve(int[] ar) {
        int len = ar.length, minAchievable = ar[0];
        // int minOper = 0, oper;
        for (int i = 1; i < len; i++) {
            int b = ar[i];
            // oper = 0;
            while (minAchievable != b) {
                if (minAchievable > b) {
                    minAchievable >>= 1;
                    // minOper++;
                } else {
                    b >>= 1;
                    // oper++;
                }
            }
            // minOper = Math.max(minOper, oper);
        }
        int count = 0;
        for (int x : ar) {
            if (x == minAchievable) {
                continue;
            }
            while (minAchievable != x) {
                count++;
                x >>= 1;
            }
        }
        return count;
    }
}
