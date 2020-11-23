package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        int M=Integer.parseInt(token.nextToken());

        int[] trees=new int[N];
        token=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            trees[i]=Integer.parseInt(token.nextToken());
        }
        Arrays.sort(trees);

        int left=1;
        int right=trees[N-1];
        long height=0;
        int mid=0;

        while (left<=right){
            height=0;
            mid=(left+right)/2;

            for(int i=0;i<N;i++){
                if(trees[i]>=mid){
                    height+=(trees[i]-mid);
                }
            }

            if(height>=M){
                left=mid+1;
            }else if(height<M){
                right=mid-1;
            }
        }

        System.out.println(right);
    }
}

//역시 시간초과 -> 이분 탐색? 정렬을 하고 반부터?? 어떻게??
//정렬 -> 처음과 끝을 잡고 반씩 탐색