package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int A=Integer.parseInt(token.nextToken());
        int B=Integer.parseInt(token.nextToken());
        int V=Integer.parseInt(token.nextToken());

        int days=(V-B-1)/(A-B)+1;

        System.out.println(days);
    }
}
