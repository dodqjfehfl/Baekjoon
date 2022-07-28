import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int[] cards=new int[20000001];

        int N=Integer.parseInt(token.nextToken());
        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            cards[Integer.parseInt(token.nextToken())+10000000]++;
        }

        token=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(token.nextToken());
        token=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<M;i++){
            sb.append(cards[Integer.parseInt(token.nextToken())+10000000]+" ");
        }
        System.out.println(sb.toString());
    }
}
//문제를 읽고 모르면 손코딩해보자
//시간 초과 -> sb
