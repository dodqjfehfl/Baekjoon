import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        sb.append("<");

        int N=Integer.parseInt(token.nextToken());
        int K=Integer.parseInt(token.nextToken());

        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=N;i++)
            queue.offer(i);

        int count=0;
        int total=0;

        while (total!=N){
            int num=queue.poll();
            count++;

            if(count==K){
                sb.append(num).append(", ");
                total++;
                count=0;
            }else{
                queue.offer(num);
            }
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append(">");

        System.out.println(sb.toString());
    }
}
