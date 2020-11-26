import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        int len=str.length();
        int N=Integer.parseInt(str);
        int result=0;

        for(int i=(N-(len*9));i<N;i++){
            int num=i;
            int sum=0;

            while (num!=0){
                sum+=num%10;
                num/=10;
            }

            if(sum+i==N){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
