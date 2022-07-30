package datastructure;

public class Methods {
    static int multiplication(int x, int y){
        int z=x*y;
        return z;
    }

    static void joke(){
        System.out.println("u r so funny ");
    }

    static void multiplication(int p,int q,int r){
        int a=p*q*r;
        System.out.println(a);

    }

    static void multiplication(int a,int b,int c,int d){
        int f=a*b*c*d;
        System.out.println(f);
    }

    public static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Methods obj = new Methods();
        int a=obj.multiplication(2,3);
        System.out.println(a);
        joke();
        multiplication(1,2,3);
        multiplication(4,4,4,4);
        int res=sum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(res);
    }

}


