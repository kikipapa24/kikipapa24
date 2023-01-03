package com.basic;

public class NestedIfStatement {
    public static void main(String[] args) {
        int num=50;
        if(num<100){
            System.out.println("number is less than 100");
            if(num==50){
                System.out.println("number is equal to 50");
                if(num>40){
                    System.out.println("number is greater than 40");
                }
            }
        }
    }
}
