package datastructure;

import java.util.Scanner;

public class ipstollplaza {
    public static void main(String[] args) {
        tollplaza t = new tollplaza();
        t.getdata();
        t.putdata();
    }
}
class tollplaza {
    private char vehicle_type;
    private int vehicle_price;
    private int rate;
    private char govt;

    //    private char v;
//    private char b;
    public void getdata() {
        Scanner s = new Scanner(System.in);
        vehicle_type = s.next().charAt(0);
        vehicle_price = s.nextInt();
        govt = s.next().charAt(0);
    }

    public void putdata(){
        if(vehicle_type == 'C' || vehicle_type == 'L'|| vehicle_type == 'V'|| vehicle_type == 'B') {


            if (govt == 'Y') {
                System.out.println("govt vehicle");
            } else {
                System.out.println("not govt vehicle");
            }
            System.out.println(vehicle_type);
            System.out.println(vehicle_price);
            System.out.println(tollrate(govt,vehicle_type));
        }
        else{
            System.out.println("Invalid Vehicle Type");
        }

    }
    public int tollrate(char x,char y){
        int toll = 0;
        if(x == 'Y'){
            toll = 0;
        }
        else{
            if(y == 'C'){
                toll = 50;
            }
            if(y == 'V'){
                toll = 75;
            }
            if(y == 'B' || y == 'L'){
                toll = 100;
            }
        }
        return toll;
    }
}

