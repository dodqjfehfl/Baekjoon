import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        int[] card=new int[N];
        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            card[i]=Integer.parseInt(token.nextToken());

        System.out.println(seach(card,N,M));
    }

    static int seach(int[] card, int N,int M) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N-2; i++) {
            if (card[i] > M)
                continue;
            for (int j = i + 1; j < N-1; j++) {
                if (card[i]+card[j]> M)
                    continue;
                for (int k = j + 1; k < N; k++) {
                    int sum=card[i]+card[j]+card[k];

                    if (sum == M)
                        return sum;

                    if (sum < M)
                        max = Integer.max(max, sum);
                }
            }
        }
        return max;
    }
}
