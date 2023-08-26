///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.println(indexOfLargestElement(array));
    }
    
    private static int indexOfLargestElement(double[] array) {
        int largestIndex = -1;
        double largest = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= largest) {
                largestIndex = i;
                largest = array[i];
            }
        }
        return largestIndex;
    }

}
