package practice;

public class GroupInt {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 8, 3, 2, 5, 8};
        int[] freq = new int[100000];
        int minimum = 0;
        for (int i : nums) {
            freq[i]++;
        }
/*        for (int i = 0; i < freq.length; i++)
            System.out.println(freq[i]);
    }*/

        int gcd = freq[nums[0]];
        for (int i = 0; i < freq.length; i++)
            gcd = gcd(gcd, freq[nums[i]]);

        System.out.println(gcd);

    }

    public static int gcd(int a, int b) {
        /* Finds the gcd of a,b */
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
}
