package practice;

public class PalindromeRec {

    public static void main(String[] args) {

        String str = "kayak";

        System.out.println(palindrome(str));

    }
    public static Boolean palindrome(String str){

        if(str.length()==0 ||str.length()==1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return palindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
