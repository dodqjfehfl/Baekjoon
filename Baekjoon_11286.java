import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        PriorityQueue<numbers> pq=new PriorityQueue();

        for(int i=0;i<N;i++){
            int cmd=Integer.parseInt(br.readLine());

            if(cmd==0){
                if(pq.size()>0) {
                    // 가장 작은 값을 출력하고 제거
                    System.out.println(pq.poll().num);
                }else{
                    System.out.println(0);
                }
            }else{
                // 0이 아니면 추가
                pq.add(new numbers(cmd));
            }
        }
    }

    static class numbers implements Comparable<numbers> {
        int abs;
        int num;

        public numbers(int num) {
            this.abs = Math.abs(num);
            this.num = num;
        }

        @Override
        public int compareTo(numbers o) {
            if(this.abs == o.abs){
                return this.num-o.num;
            }else{
                return this.abs-o.abs;
            }
        }
    }
}
