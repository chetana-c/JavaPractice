package practice;

public class ValueOfVariable {
    public static void main(String[] args) {
        ValueOfVariable cc = new ValueOfVariable();
        String[] s = {"--X","X++","X++"};
        int x = cc.finalValueAfterOperations(s);
        System.out.println(x);
    }
    public int finalValueAfterOperations(String[] operations) {

        int len = operations.length;
        int ans = 0;
        for(int i=0; i<len; i++) {
            if(operations[i] == "--X")
                ans= ans - 1;
            if(operations[i] == "X--")
                ans= ans - 1;
            if(operations[i] == "++X")
                ans = ans + 1;
            if(operations[i] == "X++")
                ans = ans + 1;
        }
        return ans;
    }
}

