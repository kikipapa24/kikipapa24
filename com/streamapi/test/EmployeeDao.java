package com.streamapi.test;

import java.util.Arrays;
import java.util.List;

public class EmployeeDao {
      public static  List<Employee> getEmployees() {
         List<Employee> employees = Arrays.asList(
                      new Employee(176, "Roshan", "IT", 600000),
                      new Employee(388, "Bikash", "CIVIL", 900000),
                      new Employee(470, "Vimal", "DEFENCE", 500000),
                      new Employee(624, "Saurav", "CORE", 400000),
                      new Employee(176, "Prakash", "SOCIAL", 1200000)
              );
              return employees;
      }
}
