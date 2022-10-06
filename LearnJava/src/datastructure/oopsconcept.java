package datastructure;

import java .util.*;
public class oopsconcept {

    void getdata(){
        Scanner sc=new Scanner(System.in);
        mobile iphone=new mobile();
        iphone.price=sc.nextInt();
        iphone.company=sc.next();
        iphone.camera= sc.next();
        iphone.processor=sc.nextInt();
        iphone.refrate=sc.nextInt();
    }

//    void showdata(){
//        System.out.println();
//    }
    public static void main(String[] var){
        Scanner sc=new Scanner(System.in);
        mobile iphone=new mobile(int price,String company,String camera,int processor,int refrate);
        mobile.getdata
    }
}

class mobile{
    int price;
    String company;
    String camera;
    int processor;
    int refrate;

    void getdata(int price,String company,String camera,int processor,int refrate){
        Scanner sc=new Scanner(System.in);
       price=sc.nextInt();
       company=sc.next();
       camera=sc.next();
       processor=sc.nextInt();
       refrate=sc.nextInt();
    }

    void showdata(){
        System.out.println(price);
        System.out.println(company);
        System.out.println(camera);
        System.out.println(processor);
        System.out.println(refrate);
    }
}
