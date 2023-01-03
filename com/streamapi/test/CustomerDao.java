package com.streamapi.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("344598843","899867877")),
                new Customer(102,"smith","smith@gmail.com", Arrays.asList("644598843","799867877")),
                new Customer(103,"peter","peter@gmail.com", Arrays.asList("744598843","699867877")),
                new Customer(104,"kely","kely@gmail.com", Arrays.asList("874598843","899867877")),
                new Customer(105,"prda","prda@gmail.com", Arrays.asList("984598843","989867877"))
        ).collect(Collectors.toList());
    }
}
