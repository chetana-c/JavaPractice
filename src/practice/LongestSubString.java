package practice;

import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {
        int[] list = {7, 8, 9, 4, 2, 3, 4, 7, 8, 9, 10, 11, 12};


        Arrays.sort(list);
    // 2,3,4,4,7,7,8,8,9,9,10,11,12
        int start = 0, end = 0, length = 0, finalStart = 0;


        for (int i = 0; i < list.length - 1; i++) {
            if (list[i + 1] - list[i] <= 1) {
                start = Math.min(start, i);
                end = Math.max(end, i + 1);
                length = Math.max(length, end - start);
                if (length == (end - start)) {
                    finalStart = start;
                }
            } else {
                start = i + 1;
                end = i;
            }

        }

        printList(list, finalStart, length + finalStart);

    }


    public static void printList(int[] list, int start, int stop) {
        for (int i = start; i <= stop; i++) {
            System.out.println(list[i]);
        }
    }
}