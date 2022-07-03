package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float subject=3;
        float s1=sc.nextFloat();
        float s2= sc.nextFloat();
        float s3= sc.nextFloat();
        float sum=s1+s2+s3;
        float cgpa=sum/subject;
        System.out.println(cgpa);

    }
}