package section_2;

import java.util.Scanner;

public class PrimeNumber {

    static int solution(int n) {
        int res = 0;
        int[] arr = new int[n+1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                res++;
                for (int j = i; j < arr.length; j+=i) {
                    arr[j] = 1;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
