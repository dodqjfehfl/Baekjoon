import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_11724 {

    static boolean[] visiteed;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<M;i++){
            token=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(token.nextToken())-1;
            int v=Integer.parseInt(token.nextToken())-1;

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int count=0;
        visiteed=new boolean[N];
        for(int i=0;i<N;i++){
            if(!visiteed[i]){
                count++;
                check(i);
            }
        }

        System.out.println(count);
    }

    static void check(int idx){
        for(int i=0;i<adj.get(idx).size();i++){
            if(!visiteed[adj.get(idx).get(i)]){
                visiteed[adj.get(idx).get(i)]=true;
                check(adj.get(idx).get(i));
            }
        }
    }
}
