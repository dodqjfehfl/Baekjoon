import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean[] check=new boolean[42];
        int answer=0;

        for(int i=0;i<10;i++){
            int temp=Integer.parseInt(br.readLine());

            if(!check[temp%42]){
                check[temp%42]=true;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
