
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverceQueue {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.add(2);
        queue.add(6);
        System.out.println(queue.toString());

        Queue<Integer> reverce = ReverceQueue.reverce(queue);
        System.out.println(reverce.toString());
    }
    
    public static Queue<Integer> reverce(Queue<Integer> queue) {
        Queue<Integer> newQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        System.out.println("stack"+ stack.toString());
        while(!stack.isEmpty()){
            newQueue.add(stack.pop());
        }
        return newQueue;
    }

}