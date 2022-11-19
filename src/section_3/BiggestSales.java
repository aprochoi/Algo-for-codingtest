package section_3;

import java.util.Scanner;

public class BiggestSales {

    static int solution(int n, int k, int[] arr) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int res = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > res) {
                res = sum;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
