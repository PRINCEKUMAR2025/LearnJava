package datastructure;

import java.util.Locale;
import java.util.Scanner;

public class StringPracticeQuestion {
    public static void main(String[] args) {
        //java program to replace spaces to underscore
        Scanner sc=new Scanner(System.in);
//        String sentence= "hello my name is prince kumar \n i am 19 years old";
//        System.out.println(sentence.replace(" ","_"));
//        //java program to convert sring lower case to upper case
//        String lower="my name is Prince kumar";
//        System.out.println(lower.toUpperCase(Locale.ROOT));
//        String replacename=sc.nextLine();
//        String greeting="Dear name , Thanks a lot!";
//        System.out.println(greeting.replace("name",replacename));
        String spacestring=sc.nextLine();
        int doublespace=spacestring.indexOf("  ");
        int triplespace=spacestring.indexOf("   ");
        if (doublespace==-1)
        {
            System.out.println(" double space not available in the string");
        }
        else {
            System.out.println(doublespace);
        }
        if (triplespace==-1){
            System.out.println(" triple space not available in the string");
        }
        else{
            System.out.println(triplespace);
        }





    }
}
