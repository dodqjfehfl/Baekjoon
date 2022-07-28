import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        StringTokenizer token=null;
        int[][] body=new int[N][2];
        int[] rank=new int[N];
        Arrays.fill(rank,1);

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            body[i][0]=Integer.parseInt(token.nextToken());
            body[i][1]=Integer.parseInt(token.nextToken());
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(body[i][0]>body[j][0] && body[i][1]>body[j][1]){
                    rank[j]++;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(rank[i]+" ");
        }
    }
}
