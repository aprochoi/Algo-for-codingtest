package section_2;

import java.util.Scanner;

public class FindRank {

    static int[] solution(int[] arr, int n) {
        int[] res = new int[n];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            res[i] = count;
            count = 1;
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

        for (int i : solution(arr, n)) {
            System.out.print(i + " ");
        }
    }
}
