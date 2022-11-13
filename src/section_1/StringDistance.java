package section_1;

import java.util.Arrays;
import java.util.Scanner;

public class StringDistance {

    static int[] solution(String str, char c) {
        int[] res = new int[str.length()];
        // 가장 첫 번째는 큰 수로
        int p = 1000;

        // 왼쪽에서부터 순회한다 (순회 중 문자가 c와 같으면 p를 0으로 하고 배열에 삽입, 같지 않으면 p++ 후 배열에 삽입)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                p++;
                res[i] = p;
            } else if (str.charAt(i) == c) {
                p = 0;
                res[i] = p;
            }
        }

        // 다시 큰 수로 초기화
        p = 1000;

        // 이번엔 오른쪽에서부터 순회한다. (순회 중 문자가 c와 같으면 p를 0으로 초기화, 같지 않으면  p++ 후 res에 들어있는 배열과 p의 값을 비교 후 작은 값을 배열에 삽입)
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
