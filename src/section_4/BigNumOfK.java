package section_4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class BigNumOfK {

    static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
//        Iterator<Integer> it = set.iterator();
//        int i = 1;
//        while (it.hasNext()) {
//            if (i == k) {
//                return it.next();
//            }
//            it.next();
//            i++;
//        }
        int cnt = 1;
        for (int i : set) {
            if(cnt == k) return i;
            cnt++;
        }

        //TreeSet 추가 메서드


        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(solution(n, k, arr));
    }
}
