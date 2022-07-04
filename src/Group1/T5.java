package Group1;

import java.util.Stack;

public class T5 {
    public static void main(String[] args) {
        String s ="[(" ;
        boolean a = isValid(s);
        System.out.println(a);
    }


    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if (chars[i] == ')' && top != '(') { return false; }
                if (chars[i] == ']' && top != '[') { return false; }
                if (chars[i] == '}' && top != '{') { return false; }
            }
        }
        return stack.empty();
    }
}
