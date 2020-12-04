import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int K=Integer.parseInt(token.nextToken());
        int N=Integer.parseInt(token.nextToken());

        int[] lines=new int[K];
        for(int i=0;i<K;i++){
            lines[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(lines);

        long start=1;
        long end=lines[K-1];
        long mid=0;

        long answer=0;

        while (start<=end){
            long total=0;
            mid=(start+end)/2;

            for(int i=0;i<K;i++){
                total+=lines[i]/mid;
            }

            if(total<N){
                end=mid-1;
            }else{
                answer=mid;
                start=mid+1;
            }
        }

        System.out.println(answer);
    }
}

// 범위를 잘 생각하자 start+end 하면 int 넘어갈수도 있음
// start=1 부터인 이유는 자연수 부터니까