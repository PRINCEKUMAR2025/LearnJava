import java.util.Scanner;

//package datastructure;
//import java.util.*;
//public class practiceformat {
//
//    static int mult(int x, int y) {
//        int z = x * y;
//        return z;
//    }
//
//    static double mult(int x, double y) {
//        double z = x * y;
//        return z;
//    }
//
//}
//        public static void main(String[] args) {
////            Scanner sc=new Scanner(System.in);
////            int arr[][]=new int[10][10];
////            for (int i=0;i<10;i++){
////                for (int j=0;j<10;j++){
////                    arr[i][j]=sc.nextInt();
////                }
////            }
//            practiceformat p=new practiceformat();
//            int a=practiceformat.mult(1,2);
//            double b=practiceformat.mult(1,2.1);
//            System.out.println(a);
//            System.out.println(b);
//
////            System.out.println(mult(1,2));
////            System.out.println(mult(1,2.1));
//        }
//    }
class Main{
    // static int add(int x,int y){
    //     return x+y;
    // }
    // static double add(double x,double y){
    //     return x+y;
    // }

    public static void main(String[] args){
        // int a=add(1,2);
        // double b=add(2.1,2.2);
        // System.out.println(a);
        // System.out.println(b);

        Scanner sc=new Scanner(System.in);
        person p=new person();
        p.person(5326,"prince","vit");
//        p.id=sc.nextInt();
//        p.name=sc.nextLine();
//        p.name=sc.nextLine();
        p.display();

    }
}
class person{
    public int id;
    public String name;
    public String college;

    void person(int id,String name,String college){
        this.id=id;
        this.name=name;
        this.college=college;
    }

    void person(double age,double hieght,double weight){
        double a=age;
        double b=hieght;
        double c=weight;

    }

     void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
    }
}
