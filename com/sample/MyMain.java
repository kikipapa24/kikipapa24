package com.sample;

public class MyMain {
    public static void main(String[] args) {
        MyRunnableThread my = new MyRunnableThread();
        my.run();

        Thread t = new Thread(my);
        t.start();

        Runnable a = new Runnable() {
            @Override
            public void run() {
                System.out.println("djkfd");
            }
        };

        Thread t1 = new Thread(a);
        t1.start();

        Runnable b = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        };
        Thread t2 = new Thread(b);
        t2.start();
        System.out.println("Current Thread Name"+ Thread.currentThread());
        MyThread mt=new MyThread();
        mt.start();//Thread-3,5,main
        mt.run();//main,5,main


        new Thread(()->System.out.println("Hello Thread")).start();

        }

    }

