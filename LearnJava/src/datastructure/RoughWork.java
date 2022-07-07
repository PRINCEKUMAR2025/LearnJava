package datastructure;

public class RoughWork {


        public static void main(String[] args) {
            int power = poweroftwonumber(2, 3);
            System.out.println(power);
        }

        static int poweroftwonumber(int a, int b) {
            int result = 1;
            for (int i = 0; i < b; i++) {
               result = multiply(result, a);
            }
            return result;
        }

        static int multiply(int a, int b) {
            int result = 0;
            for (int i = 0; i < b; i++) {
                result = result + a;
            }

            return result;
        }
}

/*
            power                        multiply
         a    b   result  i             a    b    result   i
         2   3     1     0             1     2       0     0
               multiply(1, 2)                       0+1=1  1
                    2                               1+1=2  2
               multiply(2, 2)            2    2       2     0
                                                    2+1=3    1
                      4                               3+1=4   2
              multply(4,2)               4     2      4      0
                                                     4+1=5    1
                     6                                5+1=6    2
               multply(6,2)             6      2      6        0
                                                      6+1=7    1
                     8                                7+1=8    2
 */