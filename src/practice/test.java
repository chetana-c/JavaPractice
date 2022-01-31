package practice;

public class test {


}/*  int gcd(int a, int b) {
 *//* Finds the gcd of a,b *//*
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }

    bool solve(vector<int>& nums) {
        // Create unordered_map to store no of occurences of unique elements in the list
        unordered_map<int, int> counter;

        int n = nums.size();  // Get size of the list

        // Store the counts of each integer in the counter
        for (int i = 0; i < n; i++) {
            counter[nums[i]] += 1;
        }

        // Find the common gcd of all the counts in counter
        int common_gcd = counter[nums[0]];
        for (auto it = counter.begin(); it != counter.end(); it++)
            common_gcd = gcd(common_gcd, it->second);

        // If common_gcd > 1 return true otherwise return false;
        return common_gcd > 1;
    }
*/
