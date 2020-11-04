package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int A=reverse(token.nextToken());
        int B=reverse(token.nextToken());

        if(A>B)
            System.out.println(A);
        else
            System.out.println(B);
    }

    public static int reverse(String S){
        StringBuilder sb=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--)
            sb.append(S.charAt(i));

        return Integer.parseInt(sb.toString());
    }
}
