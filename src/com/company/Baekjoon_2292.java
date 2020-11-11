package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int answer=1;
        int now=1;
        int shell=1;

        while (true){
            if(N<=now)
                break;

            now+=6*shell++;
            answer++;
        }
        System.out.println(answer);
    }
}
