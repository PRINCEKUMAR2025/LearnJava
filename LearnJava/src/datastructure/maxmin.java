package datastructure;
import java.util.*;

public class maxmin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        int num=5;
        int i=0;
        int max;
        max=arr[0];
        int min;
        min=arr[0];
        for(i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<num;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                max=arr[0];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            else {
                min=arr[0];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
