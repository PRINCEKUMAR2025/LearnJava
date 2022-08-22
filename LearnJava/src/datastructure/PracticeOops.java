package datastructure;

public class PracticeOops {
    public static void main(String[] args) {
    cellphone mi=new cellphone();
    mi.ring();
    mi.vibrate();
    }
}

class cellphone{
    public void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("vibrating");
    }
}
