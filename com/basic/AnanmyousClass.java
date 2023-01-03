package com.basic;

public class AnanmyousClass {
    public static void main(String[] args) {
       /* new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/

        /**
         * Implementation of MyInterface
         */
       /* MyInterface myInterface=()->3.14;
        System.out.println(myInterface.getPiValue());*/

        /**
         *Implementing reverse string
         */
        MyInterface mi=(str)->{
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(mi.reverse("Hello"));

    }
}
