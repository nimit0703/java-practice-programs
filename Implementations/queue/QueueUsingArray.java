public class QueueUsingArray {
    int front,rear,size;
    int capacity;
    int[] queue;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
    }

    boolean isFull(){
        return this.size == this.capacity;
    }

    boolean isEmpty(){
        return this.size == 0;
    }

    void enqueue(int value){
        if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        this.queue[this.rear% this.capacity] = value;
        this.rear++;
        this.size++;
        System.out.println(value+" enqueued to Queue");
    }

    int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = this.queue[this.front % this.capacity];
        this.queue[this.front % this.capacity] = -1;
        this.front++;
        this.size--;
        System.out.println(x+" dequeued from Queue");
        return x;
    }

    int front(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.queue[this.front% this.capacity];
    }
    
    void printQueue(){
        System.out.print("front --> ");
        for (int i = this.front; i < this.rear; i++) {
            System.out.print(this.queue[i%this.capacity] + " --> ");
        }
        System.out.println("rare");
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("front of queue is : "+ queue.front());
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("front of queue is : "+ queue.front());
        queue.printQueue();
        // for (int i =0; i < queue.queue.length; i++){
        //     System.out.print(queue.queue[i]+"->");
        // }
    }
}
