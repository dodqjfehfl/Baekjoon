import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_2606 {

    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());

        answer=0;
        visited=new boolean[N];
        adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Integer>());
        }

        StringTokenizer token=null;
        for(int i=0;i<M;i++){
            token=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(token.nextToken())-1;
            int b=Integer.parseInt(token.nextToken())-1;

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

//        worm(0);

        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()){
            int idx=queue.poll();
            for(int i=0;i<adj.get(idx).size();i++){
                if(!visited[adj.get(idx).get(i)]){
                    visited[adj.get(idx).get(i)]=true;
                    answer++;
                    queue.add(adj.get(idx).get(i));
                }
            }
        }

        System.out.println(answer-1);
    }

    static void worm(int idx){
        for(int i=0;i<adj.get(idx).size();i++){
            if(!visited[adj.get(idx).get(i)]){
                visited[adj.get(idx).get(i)]=true;
                answer++;
                worm(adj.get(idx).get(i));
            }
        }
    }
}

// bfs, dfs 모두 필요