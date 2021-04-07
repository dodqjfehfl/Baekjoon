import java.io.*;
import java.util.*;

public class Baekjoon_15657 {
    static int N, M;
    static int[] array;
    static int[] selArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        array = new int[N];
        selArr = new int[M];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(array);

        combi(0, selArr, 0);
    }

    static void combi(int selected, int[] selArr, int idx) {
        if (selected == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(selArr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < N; i++) {
            selArr[selected] = array[i];
            combi(selected + 1, selArr, i);
        }
    }
}