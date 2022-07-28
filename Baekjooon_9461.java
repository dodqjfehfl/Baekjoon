import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjooon_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        long[] tri=new long[101];
        tri[1]=tri[2]=tri[3]=1;
        tri[4]=tri[5]=2;
        for(int i=6;i<=100;i++){
            tri[i]=tri[i-1]+tri[i-5];
        }

        for(int i=0;i<N;i++){
            System.out.println(tri[Integer.parseInt(br.readLine())]);
        }
    }
}
//int 범위를 벗아났음
//n의 범위를 확인하자