package section_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    // 배열 사용
//    static int[] solution(int n) {
//        int[] res = new int[n];
//        res[0] = 1;
//        res[1] = 1;
//        for (int i = 2; i < n; i++) {
//            res[i] = res[i - 2] + res[i - 1];
//        }
//
//        return res;
//    }

    // 직접 코딩 사용 배열 사용 x
    static void solution(int n) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i : solution(n)) {
//            System.out.print(i + " ");
//        }

        solution(n);
    }
}

