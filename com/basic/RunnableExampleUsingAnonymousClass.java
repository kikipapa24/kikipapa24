package com.basic;

public class RunnableExampleUsingAnonymousClass {
    public static void main(String[] args) {
        System.out.println("Main thread started "+ Thread.currentThread().getName());
        System.out.println("Creating Runnable ");

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside thread started "+ Thread.currentThread().getName());
            }
        };
        /**
         *
         Using Lambda
        Runnable runnable=()-> System.out.println("Inside thread started "+ Thread.currentThread().getName());
         */
         System.out.println("Creating Thread");
        Thread thread=new Thread(runnable);
        System.out.println("Thread starting ....");
        thread.start();
        System.out.println("Main thread ended==="+ Thread.currentThread().getName());
    }
}
