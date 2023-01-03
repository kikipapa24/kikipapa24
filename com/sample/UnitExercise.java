package com.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExercise {
    static List<Person> persons=null;
    public static void main(String[] args) {
               persons= Arrays.asList(
                new Person("charles","dickens",60),
                new Person("levis","carol",42),
                new Person("thomas","carlyle",51),
                new Person("charlotte","brontte",45),
                new Person("mathew","androld",39)
        );

        printAll();
        System.out.println("***********************New***********");
        printStartC();
        /**
         * Step 1: Sort list by last name
         */
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getlName().compareTo(o2.getlName());
            }
        });
        /**
         * in Java 8
         */
     Collections.sort(persons,(p1,p2)-> p1.getlName().compareTo(p2.getlName()));
    }
        /**
         * Step 2: Create a method which prints all elements in the list
         */
        public static void printAll(){
            persons.forEach(p->System.out.println(p));

        }

        /**
         * Step 3: Create a method which prints all person which last name starts with c
         */

        public static void printStartC(){
            persons.forEach(person -> {
                if(person.getlName().startsWith("c")){
                    System.out.println(person);
                }
            });
        }


}
