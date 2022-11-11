package section_1;

import java.util.Scanner;

public class Palindrome {

    static String solution(String str) {
        // 정규식 사용 str을 전부 대문자로 만들고 알파벳이 아닌걸 ""로 만든다.
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
