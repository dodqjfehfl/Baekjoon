import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] call_0=new int[41];
        call_0[0]=1;
        int[] call_1=new int[41];
        call_1[1]=1;

        for(int i=2;i<=40;i++){
            call_0[i]=call_0[i-1]+call_0[i-2];
            call_1[i]=call_1[i-1]+call_1[i-2];
        }

        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            int N=Integer.parseInt(br.readLine());
            System.out.println(call_0[N]+" "+call_1[N]);
        }
    }
}
//재귀로 하면 시간초과 -> 메모이제이션 활용