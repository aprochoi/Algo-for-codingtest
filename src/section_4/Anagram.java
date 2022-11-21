package section_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    static String solution(String str1, String str2) {
        String res = "YES";
        // 두 개 모두 map에 넣어놓고 값 비교
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//        for (char c : str1.toCharArray()) {
//            map1.put(c, map1.getOrDefault(c, 0) + 1);
//        }
//        for (char c : str2.toCharArray()) {
//            map2.put(c, map2.getOrDefault(c, 0) + 1);
//        }
//
//        for (char key : map1.keySet()) {
//            if (map1.get(key) != map2.get(key)) {
//                return "NO";
//            }
//        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution(str1, str2));
    }
}
