import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());


        int answer = fact(N) / (fact(K) * fact(N - K));
        System.out.println(answer);
    }

    static int fact(int N) {
        int f=1;

        for(int i=1;i<=N;i++)
            f*=i;

        return f;
    }
}

//dp식이 왜 안될까? -> 재귀로 구현