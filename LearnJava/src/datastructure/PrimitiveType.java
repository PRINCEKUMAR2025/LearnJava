package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter highest marks for each subject");
        float max=sc.nextFloat();
        float maximum=max*5;
        System.out.println("enter marks in 1st subject out of 100");
        float a = sc.nextFloat();
        System.out.println("enter marks in 2nd subject out of 100");
        float b = sc.nextFloat();
        System.out.println("enter marks in 3rd subject out of 100");
        float c = sc.nextFloat();
        System.out.println("enter marks in 4th subject out of 100");
        float d = sc.nextFloat();
        System.out.println("enter marks in 5th subject out of 100");
        float e = sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println(sum);
        float percentage = (sum / maximum)*100;
        System.out.println(percentage);
    }
}