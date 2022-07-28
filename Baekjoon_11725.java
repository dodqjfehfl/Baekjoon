import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int[] parent = new int[N + 1];

        for (int i = 0; i < N - 1; i++) {
            token = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if (b == 1 || parent[b] != 0) {
                parent[a] = b;
            } else {
                parent[b] = a;
            }
        }

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
}

// 단순 연산은 아니고 union-find 해야하나?