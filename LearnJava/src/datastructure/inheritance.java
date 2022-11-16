package datastructure;
import java.util.*;



public class inheritance {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    student s=new student();
    s.id=sc.nextInt();
    s.name=sc.next();
    s.cgpa=sc.nextInt();
    s.posit=sc.next();
    s.salary=sc.nextInt();
    s.teachersid=sc.nextInt();
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.cgpa);
        System.out.println(s.posit);
        System.out.println(s.salary);
        System.out.println(s.teachersid);
    }
}

class hod{
    public String name;
    public int id;
    public String posit;
}

class teacher extends hod{
    public  int teachersid;
    public int salary;
}

class student extends teacher{
    public int cgpa;
//    void display(){
//        System.out.println(s);
//    }
}
