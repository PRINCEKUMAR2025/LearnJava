package datastructure;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []marks=new int[10];
        for (int i=0;i<10;i++){
            marks [i]=sc.nextInt();
        }

        for (int i=0;i<10;i++){
            System.out.println(marks[i]);
        }
    }
}
