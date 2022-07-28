import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int[] arr=new int[10];

        while(N>0){
            arr[N%10]++;
            N/=10;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=9;i>=0;i--){
            for(int j=0;j<arr[i];j++){
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
    }
}
