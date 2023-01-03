package com.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       /**
       Using new Keyword
        */
        Student s=new Student();
        Student stud=new Student("ramesh","an");
        System.out.println(stud);
        String className="basic.Student";

        /**
         * Using class.forName
         * will load the class dynamically & it indirectly will give you “Class class” object.
         */
        Class stu= Class.forName(className);
        Student student=(Student) stu.newInstance();

        /**
         * newInstance() of constructor class which is available inside java.lang.reflect.Constructor
         */
        try {
            Constructor<Student> constructor;
            constructor = Student.class.getConstructor();
            Student st = constructor.newInstance();
            System.out.println(st.getCollege());
            System.out.println(st.getName());
        }catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException |
                NoSuchMethodException | SecurityException e){
            e.printStackTrace();
        }
    }
}
