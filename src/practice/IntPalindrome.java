package practice;

public class IntPalindrome {

    public static void main(String[] args) {

        int num = 12321;

        int temp = 0;
       Boolean res = checkPalin(num,temp);

        System.out.println(res);

    }

    public static int palin(int num,int temp){

        if(num == 0)
            return temp;

        int rem = num%10;

        temp = temp*10 + rem;
        int res1 = palin(num/10, temp);

        return res1;
    }

    public static boolean checkPalin(int num,int temp) {

        int res = palin(num, temp);

        if (res == num)
            return true;
        else
            return false;
    }
}
