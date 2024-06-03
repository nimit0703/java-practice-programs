
import java.util.Stack;

public class EvaluatePostfix{
    public static void main(String[] args) {
        // System.out.println(evaluatePostfix("231*+9-"));
        System.out.println(evaluatePostfix("100 200 + 2 / 5 * 7 +"));
    }
    private static int evaluatePostfix(String str){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==' '){
            }
            else if(Character.isDigit(c)){
                int n = 0;
 
                // Extract the characters and store it in num
                while (Character.isDigit(c)) {
                    n = n * 10 + (int)(c - '0');
                    i++;
                    c = str.charAt(i);
                }
                i--;
 
                // Push the number in stack
                stack.push(n);
            }else{
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch(c){
                    case '+':
                        stack.push(op2+op1);
                        break;
                    case '-':
                        stack.push(op2-op1);
                        break;
                    case '*':
                        stack.push(op2*op1);
                        break;
                    case '/':
                        stack.push(op2/op1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}