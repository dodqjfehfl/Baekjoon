import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            String cmd=token.nextToken();

            if(cmd.equals("push")){
                stack.add(Integer.parseInt(token.nextToken()));
            }else if(cmd.equals("pop")){
                if(stack.size()>0)
                    System.out.println(stack.pop());
                else
                    System.out.println(-1);
            }else if(cmd.equals("size")){
                System.out.println(stack.size());
            }else if(cmd.equals("empty")){
                System.out.println(stack.isEmpty()?1:0);
            }else if(cmd.equals("top")){
                if(stack.size()>0)
                    System.out.println(stack.peek());
                else
                    System.out.println(-1);
            }
        }
    }
}
