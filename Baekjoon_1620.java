import java.io.*;
import java.util.*;

public class Baekjoon_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        // map 에 입력
        HashMap<String, String> map=new HashMap<>();
        for(int i=1;i<=N;i++){
            String Pokemon=br.readLine();
            map.put(Integer.toString(i), Pokemon);
            map.put(Pokemon, Integer.toString(i));
        }

        for(int i=0;i<M;i++){
            System.out.println(map.get(br.readLine()));
        }
    }
}
