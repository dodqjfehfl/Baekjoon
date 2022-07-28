import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int C=Integer.parseInt(br.readLine());

        int mul=A*B*C;

        int[] numbers=new int[10];

        while (mul>0){
            numbers[mul%10]++;
            mul/=10;
        }

        for(int i=0;i<10;i++){
            System.out.println(numbers[i]);
        }
    }
}
