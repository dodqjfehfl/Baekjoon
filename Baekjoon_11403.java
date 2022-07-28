import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        StringTokenizer token=null;

        int[][] adj=new int[N][N];
        int[][] answer=new int[N][N];

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                adj[i][j]=Integer.parseInt(token.nextToken());
            }
        }

        for(int i=0;i<N;i++){
            boolean[] visited=new boolean[N];
            Queue<Integer> queue=new LinkedList<>();

            for(int j=0;j<N;j++){
                if(adj[i][j]==1)
                    queue.add(j);
            }

            while (!queue.isEmpty()){
                int front=queue.poll();
                visited[front]=true;

                for(int j=0;j<N;j++){
                    if(adj[front][j]==1 && !visited[j])
                        queue.add(j);
                }
            }

            for(int j=0;j<N;j++){
                if(visited[j])
                    answer[i][j]=1;
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}
