import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    Stack<Character> stack;
    LinkedList<Character> queue;

    public Solution() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] chars = scan.nextLine().toCharArray();
        scan.close();

        Solution solution = new Solution();
        for (char aChar : chars) {
            solution.pushCharacter(aChar);
            solution.enqueueCharacter(aChar);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < chars.length/2; i++) {
            if (solution.popCharacter() != solution.dequeueCharacter())
        }


    }

    private char dequeueCharacter() {
        return queue.getFirst();
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char aChar) {
        queue.addLast(aChar);
    }

    private void pushCharacter(char aChar) {
        stack.push(aChar);
    }
}
