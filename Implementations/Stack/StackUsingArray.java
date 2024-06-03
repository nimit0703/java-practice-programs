
class StackUsingArray {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    StackUsingArray() {
        this.top = -1;
    }

    boolean isEmpty() {
        return this.top < 0;
    }

    boolean isFull() {
        return this.top == MAX - 1;
    }

    boolean push(int value) {
        if (this.isFull()) {
            System.out.println("Stack is full");
            return false;
        } else {
            this.a[++top] = value;
            System.out.println(value + " pushed into Stack");
            return true;
        }
    }

    int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int x = this.a[this.top--];
            return x;
        }
    }

    int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return this.a[this.top];
        }
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(this.a[i]);
        }
    }

}
