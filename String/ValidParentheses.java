import java.util.Stack;

public class ValidParentheses { // Class name corrected
    public static void main(String[] args) {
        Solutionparen sol = new Solutionparen();
        System.out.println(sol.isValid("()"));       // true
        System.out.println(sol.isValid("()[]{}"));   // true
        System.out.println(sol.isValid("(]"));       // false
        System.out.println(sol.isValid("([)]"));     // false
        System.out.println(sol.isValid("{[]}"));     // true
    }
}

class Solutionparen {
    public boolean isValid(String string) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else {
                // If the current character is a closing bracket,
                // the stack should not be empty and it should match the top of the stack
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
