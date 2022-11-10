package section_1;

import java.util.Scanner;

public class 대소문자_변환 {
    static String solution(String str) {
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) {
//            if (Character.isUpperCase(c))  res.append(Character.toLowerCase(c));
//            else res.append(Character.toUpperCase(c));

            // 아스키코드로 하는 방법 대문자는 65~90, 소문자는 97~122
            if(c >= 65 && c <= 90) res.append((char) (c + 32));
            else if(c >= 97 && c <=122) res.append((char) (c - 32));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
