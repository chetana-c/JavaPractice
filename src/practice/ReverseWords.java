package practice;

public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String res = rw.reverseWords("Let's take LeetCode contest");
        System.out.println("Res :" + res);
    }
    public String reverseWords(String s) {

        char[] c = s.toCharArray();
        int start = 0, end = 0;
        for(; end < c.length; end++){
            if(c[end] == ' '){
                reverse(c, start, end-1);
                start = end+1;
            }
        }
        reverse(c, start, end-1);
        return new String(c);
    }

    private void reverse(char[] c, int start, int end){
        while(start < end){
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }

}
