package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        char[][] board=new char[N][M];

        for(int i=0;i<N;i++){
            String temp= br.readLine();
            for(int j=0;j<M;j++){
                board[i][j]=temp.charAt(j);
            }
        }

        for(char[] rows:board)
            System.out.println(Arrays.toString(rows));
    }
}
// 0~N-8까지 0~M-8까지의 영역에서 고르기