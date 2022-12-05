package section_7;

import java.util.Scanner;

public class BinaryNumberForRecursive {

    // 재귀를 사용해 이진수 출력
    static void DFS(int n) {
        if(n == 0) return;
        DFS(n / 2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }
}
