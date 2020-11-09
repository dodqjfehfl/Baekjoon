package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int A=Integer.parseInt(token.nextToken());
        int B=Integer.parseInt(token.nextToken());

        int aCopy,bCopy;
        if(B>A){
            aCopy=B;
            bCopy=A;
        }else{
            aCopy=A;
            bCopy=B;
        }

        while (aCopy%bCopy!=0){
            int temp=aCopy%bCopy;
            aCopy=bCopy;
            bCopy=temp;
        }
        System.out.println(bCopy);
        System.out.println(A*B/bCopy);
    }
}
