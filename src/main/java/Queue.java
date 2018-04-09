import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(int n) {
         queue.addLast(n);
    }

    public int dequeue() {
        return queue.remove(0);
    }

    public int peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Queue numberQueue = new Queue();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);

        System.out.println("Out: " + numberQueue.dequeue());
        System.out.println("Out: " + numberQueue.dequeue());
        System.out.println("Out: " + numberQueue.dequeue());

    }
}
