package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1");
        float num1 = sc.nextFloat();
        System.out.println("enter no 2");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println(sum);
    }
}