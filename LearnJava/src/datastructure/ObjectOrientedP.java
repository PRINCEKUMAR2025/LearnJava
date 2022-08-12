package datastructure;

import java.util.Scanner;

public class ObjectOrientedP {
    public static void main(String[] args) {
        System.out.println("creating a new java class created upper side and now creating a new object in public class ");
        Scanner sc =new Scanner(System.in);


        Student Prince=new Student();
        Prince.regno=5326;
        Prince.name="Prince";
        Prince.year=2;
        Prince.cgpa=8;

        Student deep=new Student();
        deep.regno=5364;
        deep.name="Deep singh rathor";
        deep.year=2;
        deep.cgpa=9.26;
//        System.out.println(Prince.name);
//        System.out.println(Prince.regno);
//        System.out.println(Prince.year);
        Prince.printdetails();

        }

}
class Student{
    int regno;
    String name;
    int year;
    double cgpa;
    public void printdetails(){
        System.out.println("this is my regno " +regno);
        System.out.println("this is my name " +name);
        System.out.println("this is my yea r" +year);
    }
    public void printcgpa(){
        System.out.println(cgpa);
    }
}

