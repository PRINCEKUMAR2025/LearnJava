package datastructure;

import java.util.*;
class QuadraticEquation{
    private double a,b,c,disc;

    void getabc(){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
    }

    double getdisc(){
        double disc=(b*b)-(4*a*c);
        // return disc;
        // System.out.println(disc);
        return disc;
    }

    double getroot1(){
        double d= Math.pow(disc,0.5);
        double r1=(-b+d)/(2*a);
        // System.out.println(r1);
        return r1;
    }
    double getroot2(){
        double d= Math.pow(disc,0.5);
        double r2=(-b-d)/(2*a);
        return r2;
    }

}

class Main{
    public static void main(String[] var){
        QuadraticEquation q=new QuadraticEquation();
        q.getabc();
        double disc=q.getdisc();
        double x=q.getroot1();
        double y=q.getroot2();
        // double disc=q.getdisc();
        // System.out.println(disc);
        if(disc<0){
            System.out.println("NO Roots");
        }
        if(disc==0){
            // System.out.printf("%.3f",x);
            System.out.println("for 0");
            System.out.println(x);
        }
        if(disc>0){
            // System.out.printf("%.3f",x);
            // System.out.printf("%.3f",y);
            // // System.out.println(disc);
            System.out.println("positive");
            System.out.println(x);
            System.out.println(y);
        }
    }
}

