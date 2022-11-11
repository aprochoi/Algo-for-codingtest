package section_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    static ArrayList<String> solution(String[] arr) {
        ArrayList<String> res = new ArrayList<>();

        //직접 코드로 구현
        for (String s : arr) {
            char[] cArr = s.toCharArray();
            // lt는 왼쪽 첫번째 부터 1씩 증가, rt는 맨 끝 글자부터 1씩 감소
            int lt = 0, rt = s.length() -1;
            while (lt < rt) {
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(cArr);
            res.add(tmp);
        }

        return res;
        //StringBuilder reverse 사용
//        for (String s : arr) {
//            String str = new StringBuilder(s).reverse().toString();
//            res.add(str);
//        }
//
//        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }


        for (String s : solution(arr)) {
            System.out.println(s);
        }
    }

}
