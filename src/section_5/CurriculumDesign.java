package section_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    static String solution(String str1, String str2) {
        Queue<Character> queue = new LinkedList<>();
        for(char c : str1.toCharArray()) queue.offer(c);

        for(char c : str2.toCharArray()){
            if(queue.contains(c)) {
                if(queue.peek() == c) queue.poll();
                else return "NO";
            }
        }

        if(!queue.isEmpty()) return "NO";

        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));

    }
}
