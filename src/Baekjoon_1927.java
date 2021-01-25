import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq=new PriorityQueue();

        for(int i=0;i<N;i++){
            int cmd=Integer.parseInt(br.readLine());

            if(cmd==0){
                if(pq.size()>0) {
                    // 가장 작은 값을 출력하고 제거
                    System.out.println(pq.poll());
                }else{
                    System.out.println(0);
                }
            }else{
                // 0이 아니면 추가
                pq.add(cmd);
            }
        }
    }
}
