package section_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversePrimeNumber {

    static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        String[] sArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = new StringBuilder(sArr[i]).reverse().toString();
            int n = Integer.parseInt(sArr[i]);
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                list.add(n);
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
