package java_for_android;
import java.io.IOException;
import java.io.PrintWriter;

public class filehandelling {
    public static void main(String[] args) throws IOException
    {
        PrintWriter outputfile=new PrintWriter("Prince.txt");
        System.out.println("hello");
        System.out.println("Prince this side");
        System.out.println("How are you ?");
        outputfile.close();
    }
}
