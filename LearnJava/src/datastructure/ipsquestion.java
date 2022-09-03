//Design a class named Location for locating a maximal value and its location in a two-dimensional array. The class contains public data fields row, , column and maxValue that store the maximal value and its indices in
//        a two-dimensional array with row and column as int types and maxValue as a double type. As a programmer, Write the following method that returns the location of the largest element in a two-dimensional array:
//
//public static Location locateLargest(double[][] a)
//        The return value is an instance of Location. Write a Java program and subsequent pseudocode that prompts the user to enter row, column and the elements into a two-dimensional array of row X column and displays the location of the largest element in the array
//
//        Input :
//
//        First two lines must read Row and Column
//        Next line onwards read the elements in 2D Array of Row X Column
//        Output :
//
//        Both maxValue and its location in 2D Array
//        Both Row and Column are +Ve, otherwise print "Invalid Dimension"
//        if Row < 0, then Print "Invalid Row"
//        if Column < 0, then Print "Invalid Column"
import java.util.Scanner;

public class ipsquestion {
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        int m, n, i, j;
        double maximum = a[0][0];

        m = a.length;
        n = a[0].length;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] > maximum) {
                    maximum = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }

        }

        return location;

    }


    public static void main(String[] args) {

        int rows, columns, i, j;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        rows = in.nextInt();
        columns = in.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = in.nextDouble();
            }
        }
        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at (" + location[0] + "," + location[1] + ")");

    }
}