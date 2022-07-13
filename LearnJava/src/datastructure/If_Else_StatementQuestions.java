package datastructure;
import java.util.Locale;
import java.util.Scanner;

public class If_Else_StatementQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income in lac");
        float income=sc.nextFloat();
        if (income>=1.0f && income<2.5f){
            float tax=0.0f;
            float taxpay=(income)*tax;
            float yourincome=(income)-taxpay;
            System.out.println("you paid tax of "+taxpay);
            System.out.println("your income "+yourincome);
        }
        else if (income>=2.5f && income<5.0f){
            float tax=0.05f;
            float taxpay=(income)*tax;
            float yourincome=(income)-taxpay;
            System.out.println("you paid tax of "+taxpay);
            System.out.println("your income "+yourincome);

        }

        else if (income>=5.0f && income<10.0f){
            float tax=0.2f;
            float taxpay=(income)*tax;
            float yourincome=(income)-taxpay;
            System.out.println("you paid tax of "+taxpay);
            System.out.println("your income "+yourincome);
        }
        else{
            float tax=0.3f;
            float taxpay=(income)*tax;
            float yourincome=(income)-taxpay;
            System.out.println("you paid tax of "+taxpay);
            System.out.println("your income "+yourincome);
        }




    }
}
