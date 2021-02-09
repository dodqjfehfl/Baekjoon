import java.io.*;
import java.util.*;

public class Baekjoon_15652 {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        combi(0, new int[M]);
    }

    static void combi(int idx, int[] selected) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (idx > 0 && i < selected[idx - 1])
                continue;
            selected[idx] = i;
            combi(idx + 1, selected);
        }
    }
}