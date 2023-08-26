///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Enter number of elements of the array 
        int n = sc.nextInt();
        double[] arr = new double[100];
        creatArray(arr,n);
        display(arr,n);
        System.out.println("Sum of array : " + sum(arr,n));
        System.out.println("Max of array : " + max(arr,n));
        System.out.println("Min of array : " + min(arr,n));
    }

    //Creat array from keyboard
    private static void creatArray(double[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
    }

    //display array
    private static void display(double[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //calculate sum of array 
    private static double sum(double[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //find max of array
    private static double max(double[] arr, int n) {
        double max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //find min of array
    private static double min(double[] arr, int n) {
        double min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    
}
