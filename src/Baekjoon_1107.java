import java.io.*;
import java.util.*;

public class Baekjoon_1107 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        boolean[] button = new boolean[11]; // T 고장, F 정상

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            button[Integer.parseInt(token.nextToken())] = true;
        }

        int now = 100;
    }
}
