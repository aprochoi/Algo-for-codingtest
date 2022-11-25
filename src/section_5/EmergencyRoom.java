package section_5;

import java.util.*;


class Person {
    int id;
    int pri;

    public Person(int id, int pri) {
        this.id = id;
        this.pri = pri;
    }
}

public class EmergencyRoom {

    static int solution(int n, int m, int[] arr) {
        int res = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) queue.offer(new Person(i, arr[i]));

        while (!queue.isEmpty()){
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (tmp.pri < p.pri) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                res++;
                if(tmp.id == m) return res;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
