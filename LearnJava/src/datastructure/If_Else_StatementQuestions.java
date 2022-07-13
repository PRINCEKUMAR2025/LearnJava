package datastructure;

import java.util.Scanner;

public class If_Else_StatementQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String website=sc.nextLine();
       if (website.endsWith(".org")){
           System.out.println("organizational website");
       }
       else if (website.endsWith(".in")){
            System.out.println("indian website");
        }
       else if (website.endsWith(".com")){
            System.out.println("commercial website");
        }
       else {
           System.out.println("junk website");
       }
    }
}
