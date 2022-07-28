import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int answer=0;

        for(int i=5;i<=N;i*=5)answer+=N/i;

        System.out.println(answer);
    }
}

// 아이디어는 맞았음 2, 5를 세는 방식 -> 구현을 왜 못했을까?
// 5는 항상 2보다 적으니 5만 세도 됨