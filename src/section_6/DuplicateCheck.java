package section_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCheck {

    static String solution(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }

        return "U";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, arr));
    }
}
