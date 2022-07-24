package datastructure;

/*
****
***
**
*
 */
public class Starsinloop {
    public static void main(String[] args) {
        for (int row=4;row>=1;row--){
            for (int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
