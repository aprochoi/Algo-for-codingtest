package section_1;

import java.util.Scanner;

public class ReverseSpecificWord {
    static String solution(String str) {
        char[] cArr = str.toCharArray();
        int lt = 0;
        int rt = cArr.length -1;
        while (lt < rt) {
            // 왼쪽 문자가 특수문자면 lt++
            if (!Character.isAlphabetic(cArr[lt])) {
                lt++;
                //오른쪽 문자가 특수문자면 rt++
            } else if (!Character.isAlphabetic(cArr[rt])) {
                rt--;
                // 양쪽 문자가 다 알파벳이면 바꿔준다.
            } else {
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(cArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
