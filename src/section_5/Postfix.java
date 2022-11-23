package section_5;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    static int solution(String str) {

        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) stack.push((c - '0'));
            else {
                int right = stack.pop();
                int left = stack.pop();
                if(c == '+') stack.push(left + right);
                else if(c == '-') stack.push(left - right);
                else if(c == '*') stack.push(left * right);
                else stack.push(left / right);
            }

        }

        return stack.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
