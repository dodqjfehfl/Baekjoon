package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int X=Integer.parseInt(token.nextToken());

        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(token.nextToken());
            if(temp<X)
                System.out.print(temp+" ");
        }
    }
}
