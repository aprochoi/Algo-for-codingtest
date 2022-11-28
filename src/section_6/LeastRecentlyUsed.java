package section_6;

import java.util.Arrays;
import java.util.Scanner;

public class LeastRecentlyUsed {

    static int[] solution(int size, int n, int[] arr) {
        int[] res = new int[size];
        for (int a : arr) {
            int idx = -1;
            for (int i = 0; i < size; i++) if(a == res[i]) idx = i;
            if (idx == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    res[i] = res[i - 1];
                }
            }
            else {
                for (int i = idx; i >= 1; i--) {
                    res[i] = res[i - 1];
                }
            }
            res[0] = a;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int i : solution(s,n,arr)) System.out.print(i + " ");
    }
}
