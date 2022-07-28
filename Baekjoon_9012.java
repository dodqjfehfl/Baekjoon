import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int TC=Integer.parseInt(br.readLine());

        for(int t=0;t<TC;t++){
            System.out.println(check(br.readLine())?"YES":"NO");
        }
    }

    private static boolean check(String VPS) {
        int bracket=0;

        for(int i=0;i<VPS.length();i++){
            if(VPS.charAt(i)=='(')
                bracket++;
            else{
                bracket--;
                if(bracket<0)
                    return false;
            }
        }
        if(bracket!=0)
            return  false;

        return true;
    }
}
