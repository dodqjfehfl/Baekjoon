package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        ArrayList<Point> points=new ArrayList<>();
        int N=Integer.parseInt(token.nextToken());

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            points.add(new Point(Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken())));
        }
        points.sort(Point::compareTo);

        for(int i=0;i<points.size();i++)
            System.out.println(points.get(i).toString());
    }
    static class Point implements  Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x==o.x)
                return this.y-o.y;
            else
                return this.x-o.x;
        }

        @Override
        public String toString() {
            return x +" " + y;
        }
    }
}

// 코드를 다시 한번 확인하자 x, y