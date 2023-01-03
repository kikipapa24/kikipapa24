package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo  {

    public static void main(String[] args) {
        /**
         * Consumer Functional Interface
         */
        Consumer c=(t)-> System.out.println("value = "+t);
        c.accept(10);

        List<Integer> list= Arrays.asList(1,2,3,4);
        list.stream().forEach(System.out::println);

        /**
         * Predicate functional interface
         */
        Predicate<Integer> p=(t)->{
            if(t % 2==0) {
                return true;
            }else
                return false;
        };
        System.out.println(p.test(3));
        list.stream().filter(p).forEach(t-> System.out.println("print even "+t));
        List<Integer> count=list.stream().filter(t->t%2==0?true:false).collect(Collectors.toList());
        long count1=list.stream().filter(t->t%2==0?true:false).count();
        System.out.println(count);
        System.out.println(count1);

        /**
         * Supplier Interface
         */

        Supplier<Integer> s=()-> 123;
        System.out.println(s.get());

        System.out.println("********************************");
        System.out.println(list.stream().findAny().orElseGet(s));
    }
}
