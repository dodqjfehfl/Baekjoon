import java.io.*;
import java.util.*;

public class Baekjoon_15654 {

    static int N, M;
    static int[] array;
    static boolean[] boolArray;
    static int[] selArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        array = new int[N];
        boolArray = new boolean[N];
        selArr = new int[M];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));

        combi(0, selArr);
    }

    static void combi(int selected, int[] selArr) {
        if (selected == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(selArr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!boolArray[i]) {
                boolArray[i] = true;
                selArr[selected] = array[i];
                combi(selected + 1, selArr);
                boolArray[i] = false;
            }
        }
    }
}