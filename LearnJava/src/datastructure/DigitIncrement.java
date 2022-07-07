package datastructure;

import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
     /*   Scanner sc =new Scanner(System.in);
        System.out.println("enter the digits one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int inca=a+2;
        int incb=b+2;
        int incc=c+2;
        int incd=d+2;*/
        String result = incrementDigitBy2("98748793", 25);
        System.out.println(result);
    }

    static String incrementDigitBy2(String input,int stepUpBy) {
//        Scanner sc=new Scanner(System.in);
//        int stepUpBy=sc.nextInt();
        int length = input.length();
        String result = "";
        for(int i=0;i<length;i++){
            char current = input.charAt(i);
            System.out.println(current + stepUpBy);
            int num = current - '0';
            num = num + stepUpBy;
            if(num > 9) {
                num = num - 10;
            }
            result = result + num;
        }
        return result;
    }

}
