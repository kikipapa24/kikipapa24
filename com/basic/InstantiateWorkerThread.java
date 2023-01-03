package com.basic;

public class InstantiateWorkerThread {
    public static void main(String[] args) {
        System.out.println("Thread main started");
        Thread thread=new Thread(new WorkerThread("Process data through Runnable interface"));
        thread.start();
        thread.setName("Demo thread");
        System.out.println("Main Finished");
    }
}
