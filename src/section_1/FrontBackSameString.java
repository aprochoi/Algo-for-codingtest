package section_1;

import java.util.Scanner;

public class FrontBackSameString {

    static String solution(String str) {
        // O While문과 boolean 사용
//        char[] cArr = str.toUpperCase().toCharArray();
//        int lt = 0;
//        int rt = cArr.length -1;
//        boolean isSame = false;
//        while (lt < rt) {
//            if (cArr[lt] == cArr[rt]) {
//                isSame = true;
//            } else return "NO";
//            lt++;
//            rt--;
//        }
//
//        if(isSame) return "YES";
//
//
//        return "NO";

        // O for문 사용
//        str = str.toUpperCase();
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                return "NO";
//            }
//        }
//        return "YES";

        //O StringBuilder reverse() 사용
        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.equalsIgnoreCase(str)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
