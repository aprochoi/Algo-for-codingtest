package section_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MischievousBoy {

    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) list.add(i + 1);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int i : solution(n, arr)) System.out.print(i + " ");
    }
}
