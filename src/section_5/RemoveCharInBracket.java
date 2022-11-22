package section_5;

import java.util.Scanner;
import java.util.Stack;

public class RemoveCharInBracket {

    static Stack<Character> solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (true) {
                    if(stack.pop() == '(') break;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char c : solution(str)) {
            System.out.print(c);
        }

    }
}
