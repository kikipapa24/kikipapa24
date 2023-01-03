package JavaProject.com.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mohit","John","Peter","mareck","mac");
        list.stream().forEach(System.out::println);

        /**
         * Filter names starts with m
         */
        list.stream().filter(s->s.startsWith("m")).forEach(System.out::println);

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Raya");
        map.put(2,"Sanaya");
        map.put(3,"piya");
        map.put(4,"Hina");
        System.out.println("*********** Map Printing **********");
        /**
         * Direct iteration of map
         */
        for(String s: map.values()){
            System.out.println(s);
        }

        /**
         * Using lambda and foreach
         */
        map.forEach((k,v)-> System.out.println("Key is "+k+" value is "+v));

        /** using Stream
         * Need entryset of map
         */
        map.entrySet().stream().forEach(System.out::println);
    }
}
