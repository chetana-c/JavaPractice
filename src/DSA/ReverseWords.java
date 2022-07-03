package DSA;

public class ReverseWords {
//    Input: s = "Let's take LeetCode contest"
//    Output: "s'teL ekat edoCteeL tsetnoc"

    public static void main(String[] args) {
        ReverseWords rv = new ReverseWords();
        String s = "Let's take LeetCode contest";
        String res = rv.reverseWords(s);
        System.out.println(res);
    }
    public String reverseWords(String s){
        char[] c = s.toCharArray();
        int start = 0; int end = 0;
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
