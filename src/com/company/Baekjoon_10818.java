package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(token.nextToken());

            max=Integer.max(max, temp);
            min=Integer.min(min, temp);
        }

        System.out.println(min+" "+max);
    }
}
