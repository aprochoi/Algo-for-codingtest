package section_2;

import java.util.Scanner;

public class ScoreCount {

    static int solution(int[] arr) {
        int res = 0;
        int count = 0;

        for (int i : arr) {
            if (i == 1) {
                count++;
                res += count;
            } else  {
                count = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(solution(score));
    }
}
