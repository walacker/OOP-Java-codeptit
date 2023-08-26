///NguyenNhatMinhE21CN4/// 

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static double[] array = new double[10];
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextDouble();
        }
        Arrays.sort(array);
        while (array[9] > 1) {
            double max = array[9];
            for (int i = 0; i < 10; i++) {
                array[i] /= max;
            }
            Arrays.sort(array);
        }
        for (double e : array) {
            System.out.println(e);
        }
    }
}
