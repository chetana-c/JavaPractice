package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelBookings {

    public static void main(String[] args) {

        HotelBookings hb = new HotelBookings();
        int[] arrive = {1, 2, 3, 4};
        int[] depart = {10, 2, 6, 14};
        int k = 4;
        boolean res = hb.hotel(arrive,depart,k);
        System.out.println(res);
    }

    public boolean hotel(int[] arrive, int[] depart, int k) {
        Arrays.sort(arrive);
        Arrays.sort(depart);

        int len1 = arrive.length;
        int len2 = depart.length;
        int a = 1;
        int b = 0;
        int curBooking = 1;
        int maxBooking = 1;
        while(a < len1 && b < len2){
            if(arrive[a] < depart[b]){
                curBooking++;
                maxBooking = Math.max(curBooking,maxBooking);
                b++;
            }
            else{
                curBooking--;
                a++;
            }
            if(maxBooking > k)
                return  false;
        }
        return true;
    }
}
