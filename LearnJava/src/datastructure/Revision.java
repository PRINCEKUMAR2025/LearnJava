package datastructure;


import java.util.Scanner;

public class Revision {

    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return  a+b;

    }
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="white";
        pen1.type="gel";
        pen pen2=new pen();
        pen2.color="red";
        pen2.type="ball";

        pen1.write();
        pen1.color();
        pen1.type();
        pen2.write();
        pen2.color();
        pen2.type();

        Student student1=new Student();
        student1.name="Prince";
        student1.regno="21bce5326";
        student1.city="munger";

        student1.print();
        String[] cars={"tata","nano","maruti"};
        System.out.println(cars[0]);
        int x= add(1,2);
        double y=add(2.1,2.2);
        System.out.println(x);
        if(x==3);
        System.out.println("true");


    }

}

class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing some thing");
    }

    void color(){
        System.out.println(this.color);
    }

    void type(){
        System.out.println(this.type);
    }
}

class Student{
    Scanner sc=new Scanner(System.in);
    String name;
    String regno;
    String city;

    void name(){
        name =sc.nextLine();
    }
    void regno(){
        regno=sc.nextLine();
    }
    void city(){
        city=sc.nextLine();
    }

    void print(){
        System.out.println(this.name);
        System.out.println(this.regno);
        System.out.println(this.city);
    }
}
