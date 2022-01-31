package practice;


import static java.lang.Integer.max;
import java.util.*;

class Solution
{

    // Function to return the maximum
    // size of the required interval
    static int maxSize(Vector<Integer> v, int n)
    {
        // Insert the borders for array
        v.add(0);
        v.add(100001);
        n += 2;

        // Sort the elements in ascending order
        Collections.sort(v);

        // To store the maximum size
        int mx = 0;
        for (int i = 1; i < n - 1; i++)
        {

            // To store the range [L, R] such that
            // only v[i] lies within the range
            int L = v.get(i - 1) + 1;
            int R = v.get(i + 1) - 1;

            // Total integers in the range
            int cnt = R - L + 1; // max range = 100000 - 1 + 1
            mx = max(mx, cnt);
        }

        return mx;
    }

    // Driver code
    public static void main(String[] args)
    {
        Integer arr[] = {5100, 70000};
        Vector v = new Vector(Arrays.asList(arr));
        int n = v.size();

        System.out.println(maxSize(v, n));
    }
}