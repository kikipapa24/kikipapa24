package com.basic;

public class WorkerThread implements Runnable{
    private String data;

    public WorkerThread(){}
    public WorkerThread(String data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("[" + Thread.currentThread().getName() + "] [data=" +
                    this.data + "] Message " + i);
            try{
                Thread.sleep(3000);
                /*Thread.sleep(1000);
                Thread.sleep(1000, 500);*/
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
