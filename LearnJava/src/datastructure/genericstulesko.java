package datastructure;
import java.util.*;

public class genericstulesko {
    public static void main(String[] args) {
    container<Integer> cont=new container<>();
    cont.value=5;
    cont.show();
//    demo1();
    }
}

class container<T>{

    public T value;
    void show(){
        System.out.println(value);
    }

    public void demo1(T obj){

    }
 public void demo(ArrayList<? extends T>cont){
        cont.get(5);
    System.out.println(cont);
    }
}

