package datastructure;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        int[][] flat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                flat[i][j] = sc.nextInt();
            }
        }for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(flat[i][j]);
            }
        }
    }
}
