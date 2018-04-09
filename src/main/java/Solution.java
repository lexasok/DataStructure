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
        }


    }

    private void pushCharacter(char aChar) {
        stack.push(aChar);
    }
}
