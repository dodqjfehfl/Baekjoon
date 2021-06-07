import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int TC=Integer.parseInt(br.readLine());

        for(int t=0;t<TC;t++){
            char[] keylogger= br.readLine().toCharArray();
            StringBuilder answer=new StringBuilder();

            int len=keylogger.length;

            Stack<Character> left=new Stack<Character>();
            Stack<Character> right=new Stack<Character>();

            for(int i=0;i<len;i++){
                char c=keylogger[i];

                if(c=='-'){
                    if(!left.isEmpty()){
                        left.pop();
                    }
                }else if(c=='<'){
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                }else if(c=='>'){
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                }else{
                    left.push(c);
                }
            }

            for(Character c:left){
                answer.append(c);
            }
            while(!right.isEmpty()){
                answer.append(right.pop());
            }

            System.out.println(answer.toString());
        }
    }
}

//2
//<<BP<A>>Cd-
//ThIsIsS3Cr3t