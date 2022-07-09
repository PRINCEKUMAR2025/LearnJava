package datastructure;

import java.util.Locale;
import java.util.Scanner;

public class StringPracticeQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String s1="Hello have a good day!";
//        int avowel=s1.indexOf("a");
//        int evowel=s1.indexOf("e");
//        int ivowel=s1.indexOf("i");
//        int ovowel=s1.indexOf("o");
//        int uvowel=s1.indexOf("u");
//        System.out.println(avowel);
//        System.out.println(evowel);
//        System.out.println(ivowel);
//        System.out.println(ovowel);
//        System.out.println(uvowel);
        String s;
        int j=0;
        System.out.println("Enter a string");
        Scanner so=new Scanner(System.in);
        s= so.nextLine();
        char ch[]=new char[20];

        for(int i=0;i<s.length();i++)

        {

            if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='U'|| s.charAt(i)=='u')

            {
                ch[j++]=s.charAt(i);


            }

            else

            {

                continue;

            }

        }
        for(int i=0;i<j;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

}

