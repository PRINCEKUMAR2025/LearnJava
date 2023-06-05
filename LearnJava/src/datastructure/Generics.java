package datastructure;
import java.util.*;
//import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("prince");
        arrayList.add("this side");

        String a=(String)arrayList.get(0);
        String b=(String)arrayList.get(1);
        String c=(String)arrayList.get(2);
//    ArrayList<Integer> arrayList=new ArrayList();
//    arrayList.add(10);
//    arrayList.add("prince");
//    arrayList.add(20);
//        System.out.println(arrayList);
//        int a=(int )arrayList.get(0);
//        System.out.println(a);
        System.out.println(a +" "+b+" "+c);
    }
}
