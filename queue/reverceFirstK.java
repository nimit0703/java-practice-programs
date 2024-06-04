
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverceFirstK {
     public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.add(2);
        queue.add(6);
        System.out.println(queue.toString());

        int k=3;
        Queue<Integer> reverce = reverceFirstK.reverceKElements(queue,k);
        System.out.println(reverce.toString());
    }

    public static Queue<Integer> reverceKElements(Queue<Integer> queue, int k) {
        Queue<Integer> newQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            newQueue.add(stack.pop());
        }
        while(!queue.isEmpty()){
            newQueue.add(queue.remove());
        }
        System.err.println("Queue"+queue.toString());
        System.err.println("stack"+stack.toString());
        return newQueue;
    }
}