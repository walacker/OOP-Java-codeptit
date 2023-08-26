///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[50];
        creatArray(arr);
        display(arr);
    }

    //creat array from keyboard has 50 elements
    private static void creatArray(long[] arr) {
        for (int i = 0; i < 50; i++) {
            arr[i] = sc.nextLong();
        }
    }

    //void find avarage of array
    private static long getavarage(long[] arr) {
        long sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += arr[i];
        }
        return sum / 50;
    }

    //display elements of array that greater than avarage
    private static void display(long[] arr) {
        int dem = 0 ;
        for (int i = 0; i < 50; i++) {
            if(arr[i] > getavarage(arr)) dem++; 
        }
        System.out.println(dem);//number of elements greater than avarage
        
        for (int i = 0; i < 50; i++) {
            if(arr[i] > getavarage(arr)) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
