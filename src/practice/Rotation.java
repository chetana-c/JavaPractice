package practice;

public class Rotation {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "llohe";

        if((str1+str1).indexOf(str2) != -1){
            System.out.println("Yes");
        }
        else
            System.out.println("NO");

        System.out.println((str1+str1).indexOf(str2)); // Returns the first occurence of the second string in the first string
    }
}
