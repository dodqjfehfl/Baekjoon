import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        long K=Long.parseLong(token.nextToken());

        int[] coins=new int[N];
        for(int i=0;i<N;i++)
            coins[i]=Integer.parseInt(br.readLine());

        int count=0;
        for(int i=N-1;i>=0;i--){
            count+=K/coins[i];
            K%=coins[i];
        }

        System.out.println(count);
    }
}
