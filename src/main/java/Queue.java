import java.util.LinkedList;
import java.util.Stack;

public class Queue {
    LinkedList<Character> queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(char n) {
         queue.addLast(n);
    }

    public char dequeue() {
        return queue.remove(0);
    }

    public char peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        Stack stack = new Stack<String>();
        stack.push("first");
        stack.push("second ");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
