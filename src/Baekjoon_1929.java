import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int M=Integer.parseInt(token.nextToken());
        int N=Integer.parseInt(token.nextToken());

        int[] prime = new int[N+1];
        int i, j;

        prime[1] = 1;

        for(i=2; i<=N; i++) {
            for(j=2; i*j<=N; j++)
                prime[i*j] = 1;
        }

        for(i=M; i<=N; i++)
            if(prime[i] != 1) System.out.println(i);
    }
}
