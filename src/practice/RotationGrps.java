package practice;

public class RotationGrps {

    public static void main(String[] args) {
        // 1. single char
        // 2. empty string
        // 3. proper string

        // O/P = {"abc","bca"},{"xy","yx"},{"z"} --> 3 grps

        String[] words = {"abc", "xy", "yx", "z", "bca"};
        if(words.length == 1)
            System.out.println("1");
        int counter = 0;
        if (words.length > 1) {
            for (int i = 0; i < words.length; i++) {
                for (int j = i+1; j < words.length; j++) {
                    if(words[i].length() == 0 || words[i].length() ==1)
                        counter++;
                    if ((words[i] + words[i]).indexOf(words[j]) != -1)
                        counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
