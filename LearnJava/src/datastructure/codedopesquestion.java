package datastructure;

import java.util.Scanner;

public class codedopesquestion {
    public static void main(String[] args) {
        employee prince=new employee();
        prince.getinfo();
        prince.addwork();
        prince.addsal();
    }
}

class employee{
    int salary;
    int hrworked;

    public void getinfo(){
        Scanner sc = new Scanner(System.in);
        salary=sc.nextInt();
        System.out.println("working hour should be less then 24");
        hrworked=sc.nextInt();
    }

    public void addsal(){
        if (salary<500){
            salary=salary+10;
            System.out.println(salary);
        }
        else{
            System.out.println(salary);
        }
    }

    public void addwork(){
        if (hrworked>6){
            salary=salary+5;
            System.out.println(salary);
        }
        else {
            System.out.println(salary);
        }
    }
}
