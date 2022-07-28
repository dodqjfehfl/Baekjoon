import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token=null;
        int TC=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int tc=0;tc<TC;tc++){
            token=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(token.nextToken());
            int M=Integer.parseInt(token.nextToken());

            int count=0;
            Queue<int[]> queue=new LinkedList<>();

            token=new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                queue.add(new int[] {i, Integer.parseInt(token.nextToken())});
            }

            while (!queue.isEmpty()){
                int[] now=queue.poll();
                boolean flag=true;

                for(int[] q:queue){
                    if(q[1]>now[1]) {
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    count++;
                    if(now[0]==M)break;
                }
                else{
                    queue.add(now);
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}

//복잡한 코드!! 다양한 방법으로 해결 생각