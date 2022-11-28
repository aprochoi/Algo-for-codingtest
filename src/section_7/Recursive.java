package section_7;

import java.util.Scanner;

public class Recursive {

    static void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }
}
