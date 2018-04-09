import java.util.*;
import java.util.Queue;

public class Solution {

    Stack<Character> stack;
    LinkedList<Character> queue;

    public Solution() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        scan.close();

        Solution solution = new Solution();
        for (char aChar : chars) {
            solution.pushCharacter(aChar);
            solution.enqueueCharacter(aChar);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < chars.length/2; i++) {
            if (solution.popCharacter() != solution.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + str + ", is " + ((isPalindrome) ? "a palindrome" : "not a palindrome." ));


    }

    private char dequeueCharacter() {
        return queue.remove(0);
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
