public class DriverCode{
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);
        stack.peek();
        stack.print();
        stack.isEmpty();
        
    }
}