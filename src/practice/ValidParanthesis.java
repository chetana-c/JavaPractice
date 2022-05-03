package practice;

import java.util.Stack;

// Using stack DS

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()";
        ValidParanthesis vp = new ValidParanthesis();
        boolean res = vp.isValid(s);
        System.out.println(res);

    }
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default: ;
            }
        }
        return bracket.isEmpty();
    }
}
