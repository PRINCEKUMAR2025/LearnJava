package datastructure;

import java.util.Scanner;
/*

 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int a[] = new int[5];
        for (int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0;i<5;i++){
//            System.out.println(a[i]);
            if (a[i]%2==0){
                sum=sum+a[i];
            }
        }
        System.out.println(sum);

    }
}