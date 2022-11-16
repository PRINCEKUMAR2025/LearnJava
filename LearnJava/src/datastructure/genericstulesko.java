package datastructure;
import java.util.*;

public class genericstulesko {
    public static void main(String[] args) {
    container<Integer> cont=new container<>();
    cont.value=5;
    cont.show();
    }
}

class container<T>{
    T value;
    void show(){
        System.out.println(value);
    }
}
