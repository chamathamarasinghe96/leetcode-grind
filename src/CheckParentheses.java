import java.util.ArrayDeque;
import java.util.Deque;

public class CheckParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();

        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                if (c == '}' || c == ')' || c == ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
