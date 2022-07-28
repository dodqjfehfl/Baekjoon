import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int K=Integer.parseInt(token.nextToken());

        int[] visited=new int[100001];
        Arrays.fill(visited, -1);
        Queue<Integer> queue=new LinkedList<>();
        queue.add(N);
        visited[N]=0;

        int[] move=new int[3];

        while (!queue.isEmpty()){
            int num=queue.poll();

            if(num==K){
                System.out.println(visited[num]);
                break;
            }

            move[0]=num-1;
            move[1]=num+1;
            move[2]=num*2;

            for(int i=0;i<3;i++){
                if(0<=move[i] && move[i]<=100000 && visited[move[i]]==-1){
                    queue.add(move[i]);
                    visited[move[i]]=visited[num]+1;
                }
            }
        }
    }
}

// 메모리 초과 -> 방문했는지 확인 안함
// 접근은 좋았음