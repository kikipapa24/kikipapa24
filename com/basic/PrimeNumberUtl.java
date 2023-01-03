package com.basic;

import java.util.List;

public class PrimeNumberUtl {
    public static int calculatePrime(int n) {
        int number = 1;
        int count = 0;
        int i;
        while (count < n) {
            number++;
            for (i = 2; i <= number && number % i != 0; i++) {
            }
            if (i == number) {
                count++;
            }
        }
        return number;
    }
    public static void printThreads(List<Thread> threadList){
        System.out.println("Thread status");
        threadList.forEach(thread -> {
            System.out.println(thread.getState()+" ");
        });
    }
}


