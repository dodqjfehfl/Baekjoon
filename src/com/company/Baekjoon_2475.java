package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int sum=0;

        for(int i=0;i<5;i++){
            int temp=Integer.parseInt(token.nextToken());

            sum+=temp*temp;
        }
        System.out.println(sum%10);
    }
}
