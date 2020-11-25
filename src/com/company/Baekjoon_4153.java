package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        while (true){
            token=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(token.nextToken());
            int B=Integer.parseInt(token.nextToken());
            int C=Integer.parseInt(token.nextToken());

            if(A==0 && B==0 && C==0)
                break;

            if(A>B){
                int temp=A;
                A=B;
                B=temp;
            }
            if(B>C){
                int temp=B;
                B=C;
                C=temp;
            }

            A=A*A;
            B=B*B;
            C=C*C;

            System.out.println(C==A+B?"right":"wrong");
        }
    }
}
//C를 제일 큰 수로 만들고