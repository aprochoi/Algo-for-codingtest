package section_5;

import java.util.Scanner;
import java.util.Stack;

public class CorrectBracket {

    static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else if(c == ')') {
                if(stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }

        if(stack.size() > 0) return "NO";

        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
