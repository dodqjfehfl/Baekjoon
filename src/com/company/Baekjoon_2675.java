package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int TC=Integer.parseInt(token.nextToken());

        for(int t=1;t<=TC;t++){
            token=new StringTokenizer(br.readLine());
            int R=Integer.parseInt(token.nextToken());
            String S=token.nextToken();
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<S.length();i++){
                for(int j=0;j<R;j++){
                    sb.append(S.charAt(i));
                }
            }

            System.out.println(sb.toString());
        }
    }
}
