package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Baekjoon_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        Deque<Integer> deque=new ArrayDeque<>();

        int N=Integer.parseInt(token.nextToken());

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            String cmd= token.nextToken();

            if(cmd.equals("push_front")){
                deque.addFirst(Integer.parseInt(token.nextToken()));
            }else if(cmd.equals("push_back")){
                deque.addLast(Integer.parseInt(token.nextToken()));
            }else if(cmd.equals("pop_front")){
                System.out.println(deque.isEmpty()?-1:deque.pollFirst());
            }else if(cmd.equals("pop_back")){
                System.out.println(deque.isEmpty()?-1:deque.pollLast());
            }else if(cmd.equals("size")){
                System.out.println(deque.size());
            }else if(cmd.equals("empty")){
                System.out.println(deque.isEmpty()?1:0);
            }else if(cmd.equals("front")){
                System.out.println(deque.isEmpty()?-1:deque.peekFirst());
            }else if(cmd.equals("back")){
                System.out.println(deque.isEmpty()?-1:deque.peekLast());
            }
        }
    }
}
