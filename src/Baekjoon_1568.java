import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int answer=0;
        int idx=1;

        while(N>0){
            if(N<idx){
                idx=1;
            }
            N-=idx++;
            answer++;
        }
        System.out.println(answer);
    }
}
