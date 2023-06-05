//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.

package datastructure;

import java.util.Scanner;

public class Twonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[4];
        for (int a=0;a<n;a++){
            arr[a] = sc.nextInt();
        }
        int i,j;
//        i=0;
//        j=i+1;
        for(i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]+arr[j]==5){
                    System.out.println(i);
                    System.out.println("and");
                    System.out.println(j);
                }
            }
        }
    }
}
