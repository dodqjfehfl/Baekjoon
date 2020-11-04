package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S= br.readLine();

        S=S.toUpperCase();

        int[] alp=new int[26];
        for(int i=0;i<S.length();i++){
            alp[S.charAt(i)-'A']++;
        }

        int max=-1;
        char c='?';

        for(int i=0;i<26;i++){
            if(alp[i]>max){
                max=alp[i];
                c=(char)(65+i);
            }else if(alp[i]==max){
                c='?';
            }
        }

        System.out.println(c);
    }
}
