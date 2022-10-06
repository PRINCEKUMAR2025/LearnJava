package datastructure;

import java.util.*;
public class  Ips2Question {
    public static void main(String[] args) {
        stock dollar=new stock("$");
        dollar.getinfo();
        dollar.getchangepercent();
        System.out.println(dollar.getchangepercent());

    }
}
class stock{
    Scanner sc =new Scanner(System.in);
    int previousclosingprice;
    int currentprice;
    String stocksymbol;
    String stockname;

    void getinfo(){
        Scanner sc =new Scanner(System.in);
        previousclosingprice=sc.nextInt();
        currentprice=sc.nextInt();
        stocksymbol=sc.next();
        stockname=sc.next();
    }

    int getchangepercent(){
        int change=currentprice-previousclosingprice;
        return change;
    }

    stock(String stocksymbol) {
        stockname = stocksymbol;
    }
}
