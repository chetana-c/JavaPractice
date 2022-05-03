package practice;

public class LengthOfWord {
    public static void main(String[] args) {
        LengthOfWord low = new LengthOfWord();
        String s = "Hello World!";
        int res = low.lengthOfLastWord(s);
        System.out.println(res);
    }
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int length = 0;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) != ' '){length++;}
            else {if(length > 0) return length; }
        }
        return length;
    }
}
