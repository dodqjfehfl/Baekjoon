package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baekjoon_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(token.nextToken());
        person[] p=new person[N];

        for(int i=0;i<N;i++){
            token=new StringTokenizer(br.readLine());
            int age=Integer.parseInt(token.nextToken());
            String name= token.nextToken();
            p[i]=new person(age,name);
        }

        Arrays.sort(p);

        for(int i=0;i<N;i++)
            System.out.println(p[i]);
    }

    static class person implements Comparable<person> {
        int age;
        String name;

        public person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }

        @Override
        public int compareTo(person o) {
            return this.age-o.age;
        }
    }
}
