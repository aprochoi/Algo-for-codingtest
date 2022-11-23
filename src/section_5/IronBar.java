package section_5;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    static int solution(String str) {
        int res = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(') stack.push(c);
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') res += stack.size();
                else res += 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
