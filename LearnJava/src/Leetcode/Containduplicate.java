package Leetcode;

import java.util.Scanner;

public class Containduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[6];
        for (int a=0;a<n;a++){
            arr[a] = sc.nextInt();
        }
        int i,j;
//        i=0;
//        j=i+1;
        for(i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println("True");
                    System.out.println(i);
                    System.out.println(j);
                }
                else {
                    System.out.println("false");
                }
            }
        }
    }
}
