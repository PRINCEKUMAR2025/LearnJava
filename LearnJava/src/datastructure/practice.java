package datastructure;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int arr[][]= new int[10][10];
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
