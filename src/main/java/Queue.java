import java.util.LinkedList;

public class Queue {
    LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(String n) {
         queue.addLast(n);
    }

    public String dequeue() {
        return (String) queue.remove(0);
    }

    public String peek() {
        return queue.get(0).toString();
    }

    public static void main(String[] args) {
        Queue stringQueue = new Queue();
        stringQueue.enqueue("first");
        stringQueue.enqueue("second");
        stringQueue.enqueue("third");

        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
    }
}
