import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        StringBuilder answer=new StringBuilder();
        int idx = 1;

        for(int i=0;i<N;i++){
            int num=Integer.parseInt(br.readLine());

            while(idx<=num){
                stack.push(idx);
                idx++;
                answer.append("+\n");
            }

            if(stack.peek()==num){
                stack.pop();
                answer.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(answer.toString());
    }
}
