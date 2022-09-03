package datastructure;

import java.util.Scanner;

public class W3spractice {
    public static void main(String[] args) {
        number n=new number();
        n.getnumber();
        n.divisibleby3();
        n.divisibleby5();
//        n.divisibleby35();
    }
}

class number{
    Scanner sc=new Scanner(System.in);
    //    no of input wants to check
    int n= sc.nextInt();
    int arr[]=new int[n];

    void getnumber(){
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    void divisibleby3(){
        for (int i=0;i<n;i++) {
            if (arr[i] % 3 == 0) {
                int by3 = arr[i];
                System.out.println("these numbers are divisble by 3");
                System.out.println(by3);
            }
        }
    }

    void divisibleby5(){
        for (int i=0;i<n;i++) {
            if (arr[i] % 5 == 0) {
                int by5 = arr[i];
                System.out.println("these numbers are divisble by 5");
                System.out.println(by5);
            }
        }
    }

    void divisibleby35(){
        for (int i=0;i<n;i++) {
            if (arr[i] % 3 == 0 && arr[i]%5==0) {
                int by35 = arr[i];
                System.out.println("these numbers are divisble by 3 and 5 both");
                System.out.println(by35);
            }
        }
    }
}
