package section_1;

import java.util.Scanner;

public class WordInSentence {
    static String solution(String str) {
        String res = "";
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;
        int pos;

        //indexOf와 subString 사용
        while ((pos = str.indexOf(" ")) != -1){ // 공백이 없을 떄 까지 반복
            String tmp = str.substring(0, pos); // 0부터 공백전까지 문자열 기록

            // tmp의 길이가 max의 길이보다 크면 가장 큰 단어는 tmp
            int len = tmp.length();
            if (len > max) {
                max = len;
                res = tmp;
            }
            str = str.substring(pos+1); // 공백 이후 부터 끝까지 문자열 다시 정리
        }

        //반복이 끝나고 남은 단어의 길이가 max보다 크면 가장 긴 단어는 남은 단어
        if (str.length() > max) {
            res = str;
        }

        //for 문 사용
//        for (String s : arr) {
//            if(s.length() > max) {
//                max = s.length();
//                res = s;
//            }
//        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
