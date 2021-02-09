import java.io.*;
import java.util.*;

public class Baekjoon_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                board[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        // for (int[] rows : board)
        // System.out.println(Arrays.toString(rows));

        // 위에서부터 내려가기
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    board[i][j] += board[i - 1][j];
                } else if (j == i) {
                    board[i][j] += board[i - 1][j - 1];
                } else {
                    board[i][j] += Math.max(board[i - 1][j - 1], board[i - 1][j]);
                }
            }
        }

        int answer = board[N - 1][0];
        for (int i = 1; i < N; i++) {
            answer = Math.max(answer, board[N - 1][i]);
        }

        System.out.println(answer);
    }
}
