package datastructure;

import java.util.Scanner;

public class GettersSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employe prince = new employe();
//        prince.setName("prince");
//        prince.setId(5326);
        prince.setName();
        prince.setId();
        System.out.println(prince.getName());
        System.out.println(prince.getId());

    }
}


class employe{
    Scanner sc=new Scanner(System.in);
    private int id;
    private String name;

    public void setId(){
       int id =sc.nextInt();
    }

    public void setName(){
        name=sc.nextLine();
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
