package com.sample;

public class MyRunnableThread implements  Runnable{

    public void run(){
        System.out.println(Thread.currentThread());
        System.out.println("I am thread");
    }
}
