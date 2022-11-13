package section_1;

import java.util.Scanner;

public class ExtractNumbers {

    static int solution(String str) {
//        int answer = 0;
        String answer = "";

        for (char c : str.toCharArray()) {
//            if (c >= '0' && c <= '9') {
//                answer = answer * 10 + (c - '0');
//            }
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);

//        String res = str.replaceAll("\\D", "");
//
//        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }
}
