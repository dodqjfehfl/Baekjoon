import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        int[] memo=new int[1001];

        memo[1]=1;
        memo[2]=3;

        for(int i=3;i<=N;i++){
            memo[i]=memo[i-1]+(2*memo[i-2]);
            memo[i]%=10007;
        }

        System.out.println(memo[N]);
    }
}
// 점화식에 더 연구 필요
// 그리면서 깊게 생각을 해보자