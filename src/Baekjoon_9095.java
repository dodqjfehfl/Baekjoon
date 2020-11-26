import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int TC=Integer.parseInt(br.readLine());
        int[] numbers=new int[TC];
        int max=-1;

        for(int i=0;i<TC;i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            max=Integer.max(max, numbers[i]);
        }

        int[] dp=new int[max+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=4;i<=max;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }

        for(int num:numbers)
            System.out.println(dp[num]);

    }
}
//런타임 매번 계산을 해서?? -> 모든 입력을 받고 max값까지 계산 한번에 출력