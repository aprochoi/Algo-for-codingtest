package section_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoundAllAnagram {

    static int solution(String str1, String str2) {
        int res = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        int len = str2.length()-1;
        for (char c : str2.toCharArray()) bm.put(c, bm.getOrDefault(c, 0) + 1);
        for (int i = 0; i < len; i++) am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);

        int lt = 0;
        for (int rt = len; rt < str1.length(); rt++) {
            am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(rt), 0) + 1);
            if (am.equals(bm)) res++;
            am.put(str1.charAt(lt), am.get(str1.charAt(lt)) - 1);
            if (am.get(str1.charAt(lt)) == 0) am.remove(str1.charAt(lt));
            lt++;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }
}
