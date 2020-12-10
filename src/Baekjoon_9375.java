import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int TC=Integer.parseInt(token.nextToken());

        for(int tc=0;tc<TC;tc++){
            token=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(token.nextToken());
            HashMap<String, Integer> map=new HashMap<>();

            for(int i=0;i<N;i++){
                token=new StringTokenizer(br.readLine());
                token.nextToken();
                String key= token.nextToken();
                map.put(key, map.getOrDefault(key,0)+1);
            }

            int answer=1;
            for(int value: map.values()){
                answer*=value+1;
            }

            System.out.println(answer-1);
        }
    }
}

// 계산 식이 틀렸음
