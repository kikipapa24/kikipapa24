package com.sample;

import com.streamapi.test.Employee;
import com.streamapi.test.EmployeeDao;

import java.util.*;
import java.util.stream.Collectors;

public class SortApiTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        /**
         * Traditional Way in ascending order
         */
        Collections.sort(list);
        System.out.println(list);

        /**
         * Traditional Way in descending order
         */
        Collections.reverse(list);
        System.out.println(list);

        /**
         * Using Stream and lambda
         */
        list.stream().sorted().forEach(s-> System.out.println(s));
        System.out.println("***************Reverse order************");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("**********Using NonPrimitive data type*************");
        /**
         * Using Trdational way
         */
        List<Employee> employees= EmployeeDao.getEmployees();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });
        System.out.println(employees);

        /**
         * Using lambda
         */

        Collections.sort(employees,(e1,e2)-> (int)(e1.getSalary()-e2.getSalary()));
        System.out.println(employees);

        /**
         * Using Stream
         */
        employees.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).forEach(System.out::println);

        System.out.println("******Method reference*****");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).
                forEach(System.out::println);
    }
}
