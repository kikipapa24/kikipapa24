package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentRegistry {
  //class variable
  static List<Student> studentList=new ArrayList<>();

  Student f= new Student();

    public static void main(String[] args) {
        StudentRegistry st=new StudentRegistry();


       long startTime=System.nanoTime();
        createStudent();
        long endTime=System.nanoTime();
        long duration=endTime-startTime;
        System.out.println("***************************");
       // studentList.forEach(System.out::println);
        System.out.println(duration/1000000000);
        printAge();
        identifyCity("CH");

    }

    /**
     * print the student age less than 24
     */
    public static void printAge(){
        studentList.forEach(student -> {
            if(student.getAge()<24){
                System.out.println(student);
            }
        });
    }



    /**
     * Return the list of student which user asked for particular city
     */
    public static void identifyCity(String city){
        studentList.forEach(student -> {
            if(student.getCity().equals(city)){
                System.out.println(student);
            }
        });
    }


    /**
     * Create 1000 student object add all in studentList.
     *  name start with NAM** and ends with number sequentally - 1,2,3..,1000
     *  Age will be random number between 18 to 35
     *  City will be randomly from 4 [CH,PU,BLR,PAT]
     *
     */
    public static void createStudent(){
        Random r=new Random();
     for(int i=0;i<100;i++){
        String name="NAM"+i;
        int age=r.nextInt(35-18+1)+18;
        String cities[] ={"CH","PU","BLR","PAT"};

        String city=cities[r.nextInt(3-0+1)+0];

         studentList.add(new Student(name,age,city));
     }
    }



}
