package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter km i will change it into metre");
        float km=sc.nextFloat();
        float meter=km*1000;
        System.out.println(meter);
    }
}