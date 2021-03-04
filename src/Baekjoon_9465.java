import java.io.*;
import java.util.*;

public class Baekjoon_9465 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = null;
        int TC = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= TC; tc++) {
            int N = Integer.parseInt(br.readLine());

            int[][] sticker = new int[2][N + 1];
            int[][] dp = new int[2][N + 1];

            for (int i = 0; i < 2; i++) {

                token = new StringTokenizer(br.readLine());

                for (int j = 1; j <= N; j++) {
                    sticker[i][j] = Integer.parseInt(token.nextToken());
                }
            }

            dp[0][0] = dp[1][0] = 0;
            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for (int j = 2; j <= N; j++) {
                dp[0][j] = Integer.max(dp[1][j - 1], dp[1][j - 2]) + sticker[0][j];
                dp[1][j] = Integer.max(dp[0][j - 1], dp[0][j - 2]) + sticker[1][j];
            }

            System.out.println(Integer.max(dp[0][N], dp[1][N]));
        }
    }
}
