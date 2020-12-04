import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        HashSet<String> notListen=new HashSet<>();
        ArrayList<String> answer=new ArrayList<>();

        for(int i=0;i<N;i++){
            notListen.add(br.readLine());
        }

        for(int i=0;i<M;i++){
            String name= br.readLine();
            if(notListen.contains(name)){
                answer.add(name);
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        for(String name:answer)
            System.out.println(name);
    }
}

// 시간초과 -> 같은 작업을 반복
// 출력 잘 보기