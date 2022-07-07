package datastructure;

import java.util.Scanner;

public class PrimitiveType {
    public static void main(StringExample[] args) {
        Scanner sc=new Scanner(System.in);
      float s1=sc.nextFloat();
      float s2=sc.nextFloat();
      float s3=sc.nextFloat();
      float s4=sc.nextFloat();
      float s5=sc.nextFloat();
      float totalnum=s1+s2+s3+s4+s5;
      float percentage=(totalnum/500)*100;
        System.out.println(percentage);


    }
}