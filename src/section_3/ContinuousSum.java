package section_3;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuousSum {

    static int solution(int n) {
        int res = 0;
        int sum = 0;
        int[] arr = new int[n / 2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        for (int rt : arr) {
            sum += rt;
            while (sum > n) {
                sum -= arr[lt];
                lt++;
            }
            if (sum == n) res++;
        }


        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
