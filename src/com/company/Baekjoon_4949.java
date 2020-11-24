package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str= br.readLine();

            if(str.equals("."))
                break;

            else
                System.out.println(check(str)?"yes":"no");
        }
    }

    private static boolean check(String str) {
        Stack<Character> stack=new Stack<>();

        for(char c:str.toCharArray()){
            if(c=='(' || c=='['){
                stack.push(c);
            }else if(c==')'){
                if(stack.isEmpty() || stack.pop() !='(')
                    return false;
            }else if(c==']'){
                if(stack.isEmpty() || stack.pop() !='[')
                    return false;
            }
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
//짝을 이루는 두 괄호가 있을 떄, 그 사이에 있는 문자열도 균형이 잡여해한다.
//int로 체크가 아닌 스택에 넣고 빼야하는구나