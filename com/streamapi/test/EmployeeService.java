package com.streamapi.test;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static List<Employee> evaluateTaxUsers(String user){
      return user.equalsIgnoreCase("tax")?
             EmployeeDao.getEmployees().stream().filter(employee -> employee.getSalary() > 500000).
                    collect(Collectors.toList()):
      EmployeeDao.getEmployees().stream().filter(employee -> employee.getSalary() < 500000).
                    collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
