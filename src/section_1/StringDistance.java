package section_1;

import java.util.Arrays;
import java.util.Scanner;

public class StringDistance {

    static int[] solution(String str, char c) {
        int[] res = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                p++;
                res[i] = p;
            } else if (str.charAt(i) == c) {
                p = 0;
                res[i] = p;
            }
        }

        p = 1000;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != c) {
                p++;
                res[i] = Math.min(res[i], p);
            } else if (str.charAt(i) == c) p = 0;
        }


        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);

        for (int i : solution(s, c)) {
            System.out.print(i + " ");
        }
    }
}
