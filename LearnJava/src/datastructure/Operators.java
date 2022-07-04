package datastructure;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre first number");
        float a=sc.nextFloat();
        System.out.println("enter second number");
        float b=sc.nextFloat();
        if (a==b){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are unequal");
        }
    }
}
