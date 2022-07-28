import java.io.*;
import java.util.*;

public class Baekjoon_15650 {

    static int N;
    static int M;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        N=Integer.parseInt(token.nextToken());
        M=Integer.parseInt(token.nextToken());

        selected=new boolean[N];

        combi(0, 0);
    }

    static void combi(int idx, int sel){
        if(sel==M){
            for(int i=0;i<N;i++){
                if(selected[i]){
                    System.out.print((i+1)+" ");
                }
            }
            System.out.println();
            return;
        }

        if(idx>=N)
            return;

        selected[idx]=true;
        combi(idx+1, sel+1);
        selected[idx]=false;
        combi(idx+1, sel);
    }
}
