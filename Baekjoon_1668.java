import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        int left=0;
        int lvl=0;
        for(int i=0;i<N;i++){
            if(arr[i]>lvl){
                lvl=arr[i];
                left++;
            }
        }
        int right=0;
        lvl=0;
        for(int i=N-1;i>=0;i--){
            if(arr[i]>lvl){
                lvl=arr[i];
                right++;
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}
