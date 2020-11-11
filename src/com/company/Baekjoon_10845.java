package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());

        Queue<Integer> queue=new LinkedList<>();
        int last=0;

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            String cmd=token.nextToken();

            if(cmd.equals("push")){
                last=Integer.parseInt(token.nextToken());
                queue.offer(last);
            }else if(cmd.equals("pop")){
                if(queue.size()>0)
                    System.out.println(queue.poll());
                else
                    System.out.println(-1);
            }else if(cmd.equals("size")){
                System.out.println(queue.size());
            }else if(cmd.equals("empty")){
                System.out.println(queue.isEmpty()?1:0);
            }else if(cmd.equals("front")){
                if(queue.size()>0)
                    System.out.println(queue.peek());
                else
                    System.out.println(-1);
            }else if(cmd.equals("back")){
                if(queue.size()>0)
                    System.out.println(last);
                else
                    System.out.println(-1);
            }
        }
    }
}
