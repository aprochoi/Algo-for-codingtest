package section_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincess {

    static int solution(int n, int k) {
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()){
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) res = queue.peek();
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n, k));
    }
}
