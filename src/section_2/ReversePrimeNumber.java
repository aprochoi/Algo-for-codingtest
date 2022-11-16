package section_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversePrimeNumber {

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            int tmp = i;
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if (isPrime(res)) {
                list.add(res);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
