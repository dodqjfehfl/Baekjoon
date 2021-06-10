import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2747 {

    static int[] memo;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        memo=new int[N+1];

        memo[1]=1;

        for(int i=2;i<=N;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }

        System.out.println(memo[N]);
    }
}
