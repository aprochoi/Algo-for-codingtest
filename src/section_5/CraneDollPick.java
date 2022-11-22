package section_5;

import java.util.Scanner;
import java.util.Stack;

public class CraneDollPick {

    static int solution(int n, int m, int[][] board, int[] moves) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][pos - 1] != 0) {
                    int pick = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == pick) {
                        stack.pop();
                        res+=2;
                    }
                    else {
                        stack.push(pick);
                    }
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, board, moves));
    }
}
