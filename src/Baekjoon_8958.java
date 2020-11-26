import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int TC=Integer.parseInt(br.readLine());

        for(int t=1;t<=TC;t++){
            String str= br.readLine();
            int answer=0;
            int score=1;

            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='O'){
                    answer+=score;
                    score++;
                }else{
                    score=1;
                }
            }

            System.out.println(answer);
        }
    }
}
