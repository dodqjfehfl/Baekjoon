import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String str= br.readLine();
        long answer=0;
        long r=1;
        long M=1234567891;

        for(int i=0;i<N;i++){
            int alp=str.charAt(i)-'a'+1;
            answer+=(alp*r)%M;
            r=(r*31)%M;
        }

        System.out.println(answer%M);
    }
}

// mod 모듈러 할때는 전부 모듈러하기