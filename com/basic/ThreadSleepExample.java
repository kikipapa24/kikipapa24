package com.basic;

public class ThreadSleepExample {
    public static void main(final String[] args) {
        System.out.println("Thread main started");
        final Thread thread1 = new Thread(new WorkerThread());
        thread1.setName("WorkerThread 1");
        final Thread thread2 = new Thread(new WorkerThread());
        thread1.setName("WorkerThread 2");
        thread1.start();
        thread2.start();
        System.out.println("Thread main ended");
    }
}