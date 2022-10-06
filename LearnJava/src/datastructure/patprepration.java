package datastructure;

import java.util.Scanner;

public class patprepration {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i]%3==0){
                System.out.println("this is divisible by 3");
                int by3=arr[i];
                System.out.println(by3);
            }
            if(arr[i]%5==0){
                System.out.println("this is divisible by 5");
                int by5=arr[i];
                System.out.println(by5);
            }
            if (arr[i]%3==0 && arr[i]%5==0){
                System.out.println("this is divisible by both 3 and 5");
                int by35=arr[i];
                System.out.println(by35);
            }
        }
    }
}
