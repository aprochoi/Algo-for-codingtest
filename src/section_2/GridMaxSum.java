package section_2;

import java.util.Scanner;

public class GridMaxSum {

    static int solution(int[][] arr, int n) {
        int res = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            res = Math.max(res, sum1);
            res = Math.max(res, sum2);
        }

        sum1=sum2=0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        res = Math.max(res, sum1);
        res = Math.max(res, sum2);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, n));
    }
}
