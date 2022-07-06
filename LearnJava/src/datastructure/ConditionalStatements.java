package datastructure;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if (a>b){
            System.out.println(+a+" is greater");
        }
        else{
            System.out.println(+b+" is greater");
        }
    }
}
