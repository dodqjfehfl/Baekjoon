import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int[] array=new int[N];
        token=new StringTokenizer(br.readLine());


        for(int i=0;i<N;i++){
            array[i]=Integer.parseInt(token.nextToken());
        }

        Arrays.sort(array);

        token=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(token.nextToken());
        token=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int index= Arrays.binarySearch(array,Integer.parseInt(token.nextToken()));

            if(index<0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}