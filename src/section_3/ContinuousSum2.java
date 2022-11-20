package section_3;

import java.util.Scanner;

public class ContinuousSum2 {

    static int solution(int n) {
        int res = 0;
        int cnt = 1;
        n -= cnt;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) res++;
        }


        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
