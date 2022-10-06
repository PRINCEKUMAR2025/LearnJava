import java.util.Scanner;
public class patquestion {

    public static float ComputeSalary(float basic){
        float salary = 0;
        int Emp_Id;
        int Emp_Age;
        String Emp_Desig;
        float Emp_Basic;
        float Emp_HRA;
        float Emp_DA;
        float Emp_IT;
        float Emp_NetSalary;
        if(basic < 5000){
            Emp_HRA = 0.1f* basic;
            Emp_DA = 0.25f* basic;
            Emp_IT= 0.05f * basic;
            salary = basic +Emp_HRA + Emp_DA - Emp_IT;
        }
        if(basic > 5000 && basic<10000){
            Emp_HRA = 0.2f* basic;
            Emp_DA = 0.2f* basic;
            Emp_IT= 0.1f * basic;
            salary = basic +Emp_HRA + Emp_DA - Emp_IT;
        }
        if(basic > 10000){
            Emp_HRA = 0.25f* basic;
            Emp_DA = 0.15f* basic;
            Emp_IT= 0.15f * basic;
            salary = basic +Emp_HRA + Emp_DA - Emp_IT;
        }
        return salary;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String Emp_Name;
        int Emp_Id;
        int Emp_Age;
        String Emp_Desig;
        float Emp_Basic;
        float Emp_HRA;
        float Emp_DA;
        float Emp_IT;
        float Emp_NetSalary;
        Emp_Basic = s.nextFloat();
        if(Emp_Basic<0){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(ComputeSalary(Emp_Basic));
    }
}


