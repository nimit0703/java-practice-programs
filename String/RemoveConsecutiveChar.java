import java.util.Stack;

public class RemoveConsecutiveChar {

    public static void main(String[] args) {
        System.out.println(removeConsecutiveChar("aabb")); // ab
        System.out.println(removeConsecutiveChar("aabbccdde")); // abcde
        System.out.println(removeConsecutiveChar("abc")); // abc
        System.out.println(removeConsecutiveChar("a")); // a
    }
    
    public static String removeConsecutiveChar(String str) {
        Stack<Character> stack = new Stack<Character>();    
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (Character ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}
