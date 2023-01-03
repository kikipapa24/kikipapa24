package com.streamapi.test;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    public static void main(String[] args) {
        List<Customer> customers=CustomerDao.getAll();

        /**
         * List of customer convert into list of String
         * Data Transformation
         * customer ->customer -> one EmailId ONE-TO_ONE mapping
         *
         */
       List<String> cEmails= customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(cEmails);

        /**
         * One to many mapping
         * one customers having more than one phone
         */
        List<List<String>> cPhoneNumber=customers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(cPhoneNumber);

        /**
         * Flattered data and print into single stream
         */
        List<String> phoneNumber=customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumber);
    }
}

