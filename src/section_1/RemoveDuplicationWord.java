package section_1;

import java.util.Scanner;

public class RemoveDuplicationWord {
    static String solution(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (i == str.indexOf(str.charAt(i))) {
                res += str.charAt(i);
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
