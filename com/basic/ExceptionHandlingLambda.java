package JavaProject.com.basic;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=2;
        process(arr,key,(v,k)-> System.out.println(v+k));
    }

    private static void process(int[] arr, int key, BiConsumer<Integer,Integer> biConsumer) {
        for(int a:arr){
            biConsumer.accept(a,key);
        }
    }
}
