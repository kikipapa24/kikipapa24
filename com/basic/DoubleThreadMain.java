package JavaProject.com.basic;

public class DoubleThreadMain {
    public static void main(String[] args) {
        System.out.println("Entering into Main thread");
        DoubleThread doubleThread=new DoubleThread();
        Thread t= new Thread(doubleThread);
        Thread t1=new Thread(doubleThread);

        t.start();
        t1.start();
        System.out.println("Exiting from Main thread");
    }
}
