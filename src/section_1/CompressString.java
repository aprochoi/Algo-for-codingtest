package section_1;

import java.util.Scanner;

public class CompressString {

    static String solution(String str) {
        String res = "";
        int count = 1;
        str = str + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
            else {
                res += str.charAt(i);
                if (count > 1) {
                    res += count;
                    count = 1;
                }
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
