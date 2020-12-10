import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        StringTokenizer token=null;

        int[][] adj=new int[N][N];
        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                adj[i][j]=Integer.parseInt(token.nextToken());
            }
        }


    }
}
