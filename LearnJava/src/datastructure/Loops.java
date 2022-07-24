package datastructure;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int tillwhat=sc.nextInt();
        int n=0;
        int sum=0;
        do {
            int even=2*n;
//            System.out.println(even);
            n++;
            sum=even+sum;
//            System.out.println(sum);
        }while (n<=10);
        System.out.println(sum);


    }
}
