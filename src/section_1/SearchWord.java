package section_1;

import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        SearchWord searchWord = new SearchWord();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char t = sc.nextLine().charAt(0);

        System.out.println(searchWord.solution(str, t));
    }

    int solution(String str, char t) {
        int count = 0;

//        for (int i = 0; i < str.length(); i++) {
//            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(t))) {
//                count++;
//            }
//        }

        // 향상된 for 문 사용
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char c : str.toCharArray()) {
            if(c == t) count++;
        }

        return count;
    }
}
