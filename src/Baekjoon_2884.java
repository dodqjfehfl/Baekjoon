import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int H=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        if(M>=45){
            M-=45;
        }else{
            H--;
            M=60+M-45;
        }

        if(H<0)
            H=23;

        System.out.println(H+" "+M);
    }
}
