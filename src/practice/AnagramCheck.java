package practice;

public class AnagramCheck {

        public boolean solve(String s0, String s1) {
            if (s0.length() != s1.length())
                return false;

            int[] store = new int[256];

            for (int i = 0; i < s0.length(); i++) {
                store[s0.charAt(i)]++;
                store[s1.charAt(i)]--;
            }

            for (int n : store)
                if (n != 0)
                    return false;

            return true;
        }


    }
