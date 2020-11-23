package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int K=Integer.parseInt(br.readLine());

        int answer=0;
        Stack<Integer> stack=new Stack<>();
        int temp=0;

        for(int i=0;i<K;i++){
            temp=Integer.parseInt(br.readLine());

            if(temp==0){
                stack.pop();
            }else{
                stack.push(temp);
            }
        }

        int size=stack.size();
        for(int i=0;i<size;i++)
            answer+=stack.pop();

        System.out.println(answer);
    }
}
