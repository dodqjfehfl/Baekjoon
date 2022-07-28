import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int[] score=new int[N];
        int max=Integer.MIN_VALUE;
        double sum=0.0;

        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(token.nextToken());
            max=Integer.max(max, temp);
            score[i]=temp;
        }
        System.out.println(Arrays.toString(score));

        for(int i=0;i<N;i++){
            sum+=(double)score[i]/(double)max*100;
        }

        System.out.println(sum/(double)N);

    }
}
