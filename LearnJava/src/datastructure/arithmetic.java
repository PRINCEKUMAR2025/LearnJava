//Write a Java Application and subsequent pseudocde to perform the arithmatic operations on two numbers using single inheritance. Define two classes naming Arithmetic and Operations, where Operations class is
//derived from Arithmetic class. Declare and Define the required data members(Num1, Num2) and member
//        methods(getData()) to read 2 numbers and their arithmetic opertions(Add(), Sub(), Mul() and Div()) in base class and also the required data members(Result), and member method to print all the  all the arithmetic operations in derived class.
//
//
//        Input : Read two numbers (Num1 and Num2)
//        Output : Num1+Num2, Num1-Num2, Num1*Num2, Num1/Num2(Upto 2 Decimal Values);
//
//
//        Note : Check the Following
//
//        Num1 is negative then print "First Number is Negative" (but print the values of Num1+Num2, Num1-Num2, Num1*Num2, Num1/Num2)
//        Num2 = 0, then print "Second Number is 0, Can't divide by Zero" (but print the values of Num1+Num2, Num1-Num2, Num1*Num2)
//        Num2 is negative then print "Second Number is Negative" (but print the values of Num1+Num2, Num1-Num2, Num1*Num2, Num1/Num2)
//        Num1 and Num2 are negative then print "Both are Negative Numbers". (but print the values of Num1+Num2, Num1-Num2, Num1*Num2, Num1/Num2)
package datastructure;

import java.util.*;



//class operations extends arithmetic{
//    void putdata(){
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);
//    }
//}

class main{
    public static void main(String[] var){
        arithmetic a=new arithmetic();
        a.getdata();
//        a.putdata();
        a.add();
        a.sub();
        a.mul();
        a.div();
    }
}

public class arithmetic {
    Scanner sc=new Scanner(System.in);
    private int num1;
    private int num2;
    private int result;

    void getdata(){
        num1=sc.nextInt();
        num2=sc.nextInt();
    }
    void showdata(){
        System.out.println(num1);
        System.out.println(num2);
    }

    void add(){
        if(num1<0){
            int sum=num1+num2;
            System.out.println(sum);
            System.out.println("First number is negative");
        }
        else if(num2<0){
            int sum=num1+num2;
            System.out.println(sum);
            System.out.println("Second number is negative");
        }
        else if(num1<0 && num2<0){
            int sum=num1+num2;
            System.out.println(sum);
            System.out.println("Both numbers are negative");
        }
    }

    public class arithmetic(int num1,int num2);

    void sub(){
        if(num1<0){
            int sub=num1-num2;
            System.out.println(sub);
            System.out.println("First number is negative");
        }
        else if(num2<0){
            int sub=num1-num2;
            System.out.println(sub);
            System.out.println("Second number is negative");
        }
        else if(num1<0 && num2<0){
            int sub=num1-num2;
            System.out.println(sub);
            System.out.println("Both numbers are negative");
        }
    }

    void mul(){
        int mul=num1*num2;
        System.out.println(mul);
    }

    void div(){
        if(num1==0 || num2==0){
            System.out.println("Both numbers are negative");
        }
        else{
            int div=num1/num2;
            System.out.println(div);
        }

    }
}
