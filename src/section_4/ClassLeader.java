package section_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ClassLeader {

    static char solution(String str, int n) {
        char res = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); // map.getOrDefault('A', 0) 이면 'A'의 value를 가져오고 'A'가 없으면 기본 값으로 0을 넣어라. 라는 뜻
        }
        // 'A' 라는 키가 있으면 true 없으면 false
        System.out.println(map.containsKey('A'));
        // map 키의 개수를 리턴
        System.out.println(map.size());
        // 'A' 라는 키의 value 리턴 후 객체 삭제
        System.out.println(map.remove('A'));
        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                res = key;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(str, n));
    }
}
