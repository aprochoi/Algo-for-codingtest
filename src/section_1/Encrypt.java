package section_1;

import java.util.Scanner;

public class Encrypt {

    static String solution(String str, int n) {
        // 간단하게 substring과 replace 사용
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            int ten = Integer.parseInt(tmp, 2);
            res.append((char) ten);
            str = str.substring(7);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(str, n));
    }
}
