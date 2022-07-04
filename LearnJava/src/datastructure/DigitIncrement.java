package datastructure;

import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the digits one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int inca=a+2;
        int incb=b+2;
        int incc=c+2;
        int incd=d+2;
        System.out.println("the incremented digit are "+inca+incb+incc+incd+" as follows");


    }
}
