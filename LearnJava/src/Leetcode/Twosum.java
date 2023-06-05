package Leetcode;

import java.util.Scanner;

public class Twosum {
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
