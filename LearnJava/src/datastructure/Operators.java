package datastructure;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of rectangle");
        float length=sc.nextFloat();
        System.out.println("enter the breadth");
        float breadth=sc.nextFloat();
        float area=length*breadth;
        System.out.println("the area is "+area);
    }
}
