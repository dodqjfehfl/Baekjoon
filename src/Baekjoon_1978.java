import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int answer=0;

        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(token.nextToken());
            if(num<=1)
                continue;

            boolean flag=true;
            int limit=(int)Math.sqrt(num)+1;
            for(int j=2;j<limit;j++){
                if(num%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                answer++;
        }

        System.out.println(answer);
    }
}
