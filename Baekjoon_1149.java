import java.io.*;
import java.util.*;

public class Baekjoon_1149 {

    // static int N;
    // static int[][] colors;
    // static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] colors = new int[N][3];
        StringTokenizer token = null;
        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                colors[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        // answer = Integer.MAX_VALUE;
        // combi(0,0,-1);

        int[][] dp = new int[N][3];
        dp[0][0] = colors[0][0];
        dp[0][1] = colors[0][1];
        dp[0][2] = colors[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Integer.min(dp[i - 1][1], dp[i - 1][2]) + colors[i][0];
            dp[i][1] = Integer.min(dp[i - 1][0], dp[i - 1][2]) + colors[i][1];
            dp[i][2] = Integer.min(dp[i - 1][0], dp[i - 1][1]) + colors[i][2];
        }

        System.out.println(Integer.min(Integer.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));
    }

    // static void combi(int idx, int sum, int before) {
    // if (idx == N) {
    // answer = Integer.min(answer, sum);
    // return;
    // }

    // if (sum > answer)
    // return;

    // for (int i = 0; i < 3; i++) {
    // if (before == i)
    // continue;

    // combi(idx + 1, sum + colors[idx][i], i);
    // }
    // }
}

// 재귀로 했지만 정답은 DP