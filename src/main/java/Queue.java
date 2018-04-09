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

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
