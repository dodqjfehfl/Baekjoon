import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int index=0;
        int max=-1;

        for(int i=1;i<=9;i++){
            int temp=Integer.parseInt(br.readLine());

            if(temp>max){
                max=temp;
                index=i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
