package datastructure;
import java.util.Locale;
import java.util.Scanner;

public class If_Else_StatementQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int mathspercentile=sc.nextInt();
        int physicspercentile=sc.nextInt();
        int chemestrypercentile=sc.nextInt();
        int AVERAGEpercentile=(mathspercentile+physicspercentile+chemestrypercentile)/3;

        if (mathspercentile>=40 && physicspercentile>=40 && chemestrypercentile>=40 && AVERAGEpercentile>=50){
            System.out.println("congo you pass !");
        }

        else{
            System.out.println("you don`t pass ");
        }

    }
}
