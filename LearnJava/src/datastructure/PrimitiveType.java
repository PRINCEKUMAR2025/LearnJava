package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = Sc.nextInt();
        System.out.println("Enter number 2");
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}