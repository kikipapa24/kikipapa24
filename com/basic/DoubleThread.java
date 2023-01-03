package JavaProject.com.basic;

public class DoubleThread implements Runnable{

    public DoubleThread(){}

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread inside "+i);
        }

    }
}
