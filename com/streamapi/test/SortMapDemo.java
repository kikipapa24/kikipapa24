package com.streamapi.test;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 3);
        map.put("xys", 6);
        map.put("prd", 8);
        map.put("kkk", 5);


        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.stream().forEach(System.out::println);

        map.entrySet().stream().forEach(System.out::println);

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        /**
         * using Lambda
         */
        Collections.sort(entries, (k, v) -> k.getKey().compareTo(v.getKey()));
        System.out.println("*******");
        entries.stream().forEach(System.out::println);

        System.out.println("*********Using Object*********");

        Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()- o2.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000),60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000),80);
        employeeMap.put(new Employee(470, "Vimal", "DEFENCE", 500000), 90);
        employeeMap.put(new Employee(624, "Saurav", "CORE", 400000),40);
        employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000),50);

        System.out.println(employeeMap);

        employeeMap.entrySet().stream().sorted(
                Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).
                forEach(System.out::println);
        System.out.println("********Stream api");
        System.out.println(employeeMap);

    }
}
