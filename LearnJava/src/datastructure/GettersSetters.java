package datastructure;

import java.util.Scanner;

public class GettersSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employe prince = new employe();
        prince.setName("prince");
        prince.setId(5326);
        System.out.println(prince.getId());
        System.out.println(prince.getName());

    }
}


class employe{
    private int id;
    private String name;

    public void setId(int i){
       id=i;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
