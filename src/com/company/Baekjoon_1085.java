package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int x=Integer.parseInt(token.nextToken());
        int y=Integer.parseInt(token.nextToken());
        int w=Integer.parseInt(token.nextToken());
        int h=Integer.parseInt(token.nextToken());

        int x_min=Integer.min(x-0, w-x);
        int y_min=Integer.min(y-0, h-y);

        System.out.println(Integer.min(x_min,y_min));
    }
}
