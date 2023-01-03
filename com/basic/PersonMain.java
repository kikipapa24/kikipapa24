package com.basic;

import java.util.HashSet;
import java.util.Stack;

public class PersonMain {
    public static void main(String[] args) {
        HashSet<Person> personHashSet = new HashSet<>();
        Person p1=new Person("pr", "ra", "78834438787",
                new Address("chennai", "TamilNadu", "India"));
        Person p2=new Person("pr", "ra", "78834438787",
                new Address("chennai", "TamilNadu", "India"));
        personHashSet.add(p1);
        personHashSet.add(p2);
        System.out.println(personHashSet.size());
        System.out.println(personHashSet.hashCode());
        System.out.println(personHashSet.size());
        System.out.println(p1.equals(p2));

        Stack<Integer> stack=new Stack<>();
        stack.push(8);
        stack.push(6);
        stack.push(5);
        String s="{ab{bcd{a}{b}}}";
    }
}
