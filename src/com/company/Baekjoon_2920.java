package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int first=Integer.parseInt(token.nextToken());
        int temp;
        boolean ascending=false;
        boolean descending=false;

        if(first==1) {
            ascending=true;
            for(int i=0;i<7;i++){
                temp=Integer.parseInt(token.nextToken());
                if(temp==first+1){
                    first=temp;
                }else{
                    ascending=false;
                    break;
                }
            }
        }
        else if(first==8) {
            descending=true;
            for(int i=0;i<7;i++){
                temp=Integer.parseInt(token.nextToken());
                if(temp==first-1){
                    first=temp;
                }else{
                    descending=false;
                    break;
                }
            }
        }

        if(ascending)
            System.out.println("ascending");
        else if(descending)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
