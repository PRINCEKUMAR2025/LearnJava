package datastructure;

import java.util.Scanner;
/*
5! = 5*(5-1)*(5-2)*(5-3)*(5-4)
1*5
5*4=20
20*3=60
60*2=120
120*1=120

 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int factorial=1;
        for (int i=0;i<n;i++){
            factorial=  factorial * (n-i);
        }
        System.out.println(factorial);

    }
}