import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2775 {
    public static void main(String[] args) throws IOException {
        int[][] apt=new int[15][15];
        for(int i=1;i<=14;i++)
            apt[0][i]=i;

        for(int i=1;i<=14;i++){
            apt[i][1]=1;
            for(int j=2;j<=14;j++){
                apt[i][j]=apt[i][j-1]+apt[i-1][j];
            }
        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        for(int t=0;t<T;t++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());

            System.out.println(apt[k][n]);
        }
    }
}
