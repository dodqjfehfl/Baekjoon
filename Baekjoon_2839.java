import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int[] bag=new int[5001];
        bag[1]=bag[2]=bag[4]=-1;
        bag[3]=bag[5]=1;

        for(int i=6;i<N+1;i++){
            int add3=bag[i-3]+1;
            int add5=bag[i-5]+1;

            if(add3==0 && add5==0) {
                bag[i] = -1;
            }else if(add3==0){
                bag[i]=add5;
            }else if(add5==0){
                bag[i]=add3;
            }else{
                bag[i]=Math.min(add3,add5);
            }

        }
        System.out.println(bag[N]);
    }
}
