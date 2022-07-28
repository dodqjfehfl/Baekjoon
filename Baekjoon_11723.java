import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());

        StringTokenizer token=null;
        Set<Integer> set=new HashSet<Integer>();
        int num=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<M;i++){
            token=new StringTokenizer(br.readLine());
            String cmd=token.nextToken();

            if(cmd.equals("add")){
                num=Integer.parseInt(token.nextToken());
                set.add(num);
            }else if(cmd.equals("remove")){
                num=Integer.parseInt(token.nextToken());
                set.remove(num);
            }else if(cmd.equals("check")){
                num=Integer.parseInt(token.nextToken());
                if(set.contains(num)){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(cmd.equals("toggle")){
                num=Integer.parseInt(token.nextToken());
                if(set.contains(num)){
                    set.remove(num);
                }else{
                    set.add(num);
                }
            }else if(cmd.equals("all")){
                for(int n=1;n<=20;n++)
                    set.add(n);
            }else if(cmd.equals("empty")){
                set=new HashSet<Integer>();
            }
        }
        System.out.println(sb.toString());
    }
}
