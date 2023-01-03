package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNoConcurrency {
    public static void main(String[] args) {
        List<Thread> threadList=new ArrayList<>();
        Runnable reportStatus=()->{
            while(true) {
                //pause
                try {
                    Thread.sleep(3000);
                    PrimeNumberUtl.printThreads(threadList);
                } catch (InterruptedException e) {
                    System.out.println("Thread got interrupted "+e);
                }

            }
        };
        Thread thread=new Thread(reportStatus);
        thread.setDaemon(true);
        thread.start();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of n to calculate prime number: ");
            int n = scanner.nextInt();
            if(n==0) {
                thread.interrupt();
                break;
            }
            Runnable runnable= new Runnable() {
                @Override
                public void run() {
                    int number=PrimeNumberUtl.calculatePrime(n);
                    System.out.println("value of "+n +" prime is "+number);
                }
            };
            Thread t=new Thread(runnable);
            threadList.add(t);
            t.setDaemon(true);
            t.start();

        }


    }
}
