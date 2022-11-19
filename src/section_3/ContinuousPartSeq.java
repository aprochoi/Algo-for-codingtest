package section_3;

import java.util.Scanner;

public class ContinuousPartSeq {

    static int solution(int n, int m, int[] arr) {
        int res = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) res++;
            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if(sum == m) res++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
