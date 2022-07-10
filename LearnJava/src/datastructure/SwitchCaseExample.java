package datastructure;
import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String number=sc.nextLine();
        switch (number){
            case "123456789":
                System.out.println("mummy");
                break;
            case "987654321":
                System.out.println("papa");
                break;
            case "543219876":
                System.out.println("me");
                break;
        }



    }
}
