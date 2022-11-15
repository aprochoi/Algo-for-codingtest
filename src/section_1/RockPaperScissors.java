package section_1;

import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissors {

    static char[] solution(int[][] arr, int n) {
        char[] res = new char[n];

        for (int i = 0; i < n; i++) {
            if (arr[0][i] == arr[1][i]) {
                res[i] = 'D';
            } else if ((arr[0][i] == 2 && arr[1][i] == 1) ||
                       (arr[0][i] == 1 && arr[1][i] == 3) ||
                       (arr[0][i] == 3 && arr[1][i] == 2)) {
                res[i] = 'A';
            } else res[i] = 'B';
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (char c : solution(arr, n)) {
            System.out.println(c);
        }
    }
}
