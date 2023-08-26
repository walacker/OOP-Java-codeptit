///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.println(average(array));
    }

    private static int average(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum / array.length;
    }

    private static double average(double[] array) {
        double sum = 0;
        for (double e : array) {
            sum += e;
        }
        return sum / array.length;
    }

    
}
