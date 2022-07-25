package datastructure;

import java.util.Scanner;
/*

 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();

       if (a>b){
           if (a>c){
               System.out.println("the greater no is"+a);
           }
       }
       else if (b>a){
           if (b>c){
               System.out.println("the greater no is"+b);
           }
       }
       else {
           System.out.println("the greater no is"+c);
       }
    }
}