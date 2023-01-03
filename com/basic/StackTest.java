package com.basic;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String s="{ab{bcd{a}{b}}}";
        char c[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();;
         for(char x:c){
           if(x=='{'){
               stack.push(x);
           } else if (!stack.empty() && x=='}') {
               stack.pop();
           }
        }
         if(stack.empty()){
             System.out.println("True");
         }else{
             System.out.println("False");
         }

    }
}
