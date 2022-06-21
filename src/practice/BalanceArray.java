package practice;

import java.util.HashMap;

public class BalanceArray {

    public static void main(String[] args) {

        int[] a2 = {5, 5, 2, 5, 8};
        // select the special elements which after removal , the sum of
        // the odd index elements = the sum of even index elements
        // 5+2+8 = 5+5
        int[] a = {2, 8, 2, 2, 6, 3};
        int[] a3 = {2, 1, 6, 4};
        // 2+5+4 = 1+7+3+6 => 11 = 17 (-6)
        BalanceArray ba = new BalanceArray();
        // int result = ba.solve(a3);
        int result = ba.solve2(a2);
        System.out.println(result);

    }

    public int solve2(int[] a){
        int even =0, odd=0;
        for(int i =0;i <a.length; i++){
            if(i%2 == 0)
                even += a[i];
            else
                odd += a[i];
        }
        int ans = 0;
        for(int i=0 ;i <a.length; i++){
            if(i%2 == 0){
                even = even - a[i];
                if(even == odd)
                    ans++;
                odd = odd + a[i];
            }
            else {
                odd = odd - a[i];
                if(even == odd)
                    ans++;
                even = even + a[i];
            }
        }
        return ans;
    }

    public int solve(int[] a){
        // HashMap<Integer,Integer> b = new HashMap<Integer, Integer>();
//        for(int i=0; i<a.length; i++){
//            b.put(a[i],i);
//        }
        int even =0, odd=0;
        for(int i =0;i <a.length; i++){
            if(i%2 == 0)
                even += a[i];
            else
                odd += a[i];
        }
        int count = 0;
        int freq= 0;
        if (even == odd)
            return 0;
        if (even>odd)
            if(freq(a,even-odd) != 0)
                freq = freq(a,even-odd);
        if (odd>even)
            if(freq(a,odd-even) != 0)
                freq = freq(a,odd-even);

        return freq;
    }

    public int freq(int[] a, int x){
        HashMap<Integer, Integer> charCountMap = new HashMap<>();
        for (int c : a) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        return charCountMap.get(x);
    }

}
