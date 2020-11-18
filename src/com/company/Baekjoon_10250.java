package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int T=Integer.parseInt(token.nextToken());

        for(int t=0;t<T;t++){
            token=new StringTokenizer(br.readLine());
            int H=Integer.parseInt(token.nextToken());
            int W=Integer.parseInt(token.nextToken());
            int N=Integer.parseInt(token.nextToken());

            int room=N/H+1;
            int level=N%H;

            if(N%H==0){
                room=N/H;
                level=H;
            }

            System.out.println(level*100+room);
        }
    }
}

// YXX YYXX 형식을 안맞춤 -> 10 이하면 0을 추가하는 형식 -> *100
// 6 12 6 처럼 딱 맞아떨어지는 경우를 고려 안함