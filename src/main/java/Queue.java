import java.util.LinkedList;
import java.util.Stack;

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
        Stack stack = new Stack<String>();
        stack.push("first");
        stack.push("second ");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
