import java.io.*;
import java.util.*;

public class Baekjoon_1149 {

    static int N;
    static int[][] colors;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        colors=new int[N][3];
        StringTokenizer token=null;
        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                colors[i][j]=Integer.parseInt(token.nextToken());
            }
        }

        answer=Integer.MAX_VALUE;
        combi(0,0,-1);

        System.out.println(answer);
    }

    static void combi(int idx, int sum, int before){
        if(idx==N){
            answer=Integer.min(answer, sum);
            return;
        }

        if(sum>answer)
            return;

        for(int i=0;i<3;i++){
            if(before==i)
                continue;

            combi(idx+1, sum+colors[idx][i], i);
        }
    }
}

// 재귀로 했지만 정답은 DP