package section_1;

import java.util.Scanner;

public class ShowStudent {

    static int solution(int[] arr) {
        int res = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                res++;
                max = arr[i];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));

    }
}
