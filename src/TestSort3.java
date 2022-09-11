//Java Comparable interface is used to order the objects of the user-defined class.
// This interface is found in java.lang package and contains only one method named compareTo(Object).
// It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
// For example,it may be rollno, name, age or anything else.
//Java Program to demonstrate the use of Java Comparable.
//Creating a class which implements Comparable Interface
import java.util.*;
import java.io.*;
    class Student implements Comparable<Student>{
        int rollno;
        String name;
        int age;
        Student(int rollno,String name,int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }
        public int compareTo(Student st){
            if(age==st.age)
                return 0;
            else if(age>st.age)
                return 1;
            else
                return -1;
        }
    }
    //Creating a test class to sort the elements
    public class TestSort3{
        public static void main(String args[]){
            ArrayList<Student> array=new ArrayList<Student>();
            array.add(new Student(101,"Vijay",23));
            array.add(new Student(106,"Ajay",27));
            array.add(new Student(105,"Jai",21));

            Collections.sort(array);
            for(Student st:array){
                System.out.println(st.rollno+" "+st.name+" "+st.age);
            }
        }
    }
