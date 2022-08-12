package datastructure;

import java.util.Scanner;

class Student{
    int regno;
    String name;
    int year;
    public void printdetails(){
        System.out.println("this is my regno" +regno);
        System.out.println("this is my name" +name);
        System.out.println("this is my year" +year);
    }
}

public class ObjectOrientedP {
    public static void main(String[] args) {
        System.out.println("creating a new java class created upper side and now creating a new object in public class ");
        Scanner sc =new Scanner(System.in);
        Student Prince=new Student();
        Prince.regno=5326;
        Prince.name="Prince";
        Prince.year=2;
        System.out.println(Prince.name);
        System.out.println(Prince.regno);
        System.out.println(Prince.year);
        Prince.printdetails();

        }

}

