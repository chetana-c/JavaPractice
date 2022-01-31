package practice;

public class ReversalRec {
    public static void main(String[] args) {

        String str = "hello"; // olleh

        String res = rev(str);
        System.out.println(res);

    }
    public static String reversal(String str){

        if(str.equals("")){
            return "";
        }
        return reversal(str.substring(1))+str.charAt(0);
    }

    public static String rev(String str){
        if(str.length() == 1){
            return str;
        }
        return str.charAt(str.length() - 1)+rev(str.substring(0,str.length() -1));
    }
}
