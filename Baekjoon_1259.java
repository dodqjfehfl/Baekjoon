import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str= br.readLine();

            if(str.equals("0"))
                break;

            System.out.println(isPalin(str)?"yes":"no");
        }
    }

    private static boolean isPalin(String str) {
        int left=0;
        int right=str.length()-1;

        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
