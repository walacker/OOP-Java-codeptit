///NguyenNhatMinhE21CN4/// 

import java.util.Random;
import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int[] arr = creatArray();
        displayArray(arr);
        int[] cnt = countElement(arr);
        countElementDisplay(cnt);

    }
    
    //Creat array from random
    private static int[] creatArray(){
        int[] arr = new int[200];
        Random r = new Random();
        for(int i = 0 ; i < 200 ; i++){
            arr[i] = r.nextInt(9);
        }
        return arr;
    }

    //Displays the array 
    private static void displayArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Count the number of elements
    private static int[] countElement(int[] arr){
        int[] cnt = new int[10];
        for(int i = 0 ; i < arr.length ; i++){
            cnt[arr[i]] ++;
        }
        return cnt;
    }

    //Display count element
    private static int[] countElementDisplay(int[] cnt){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Number " + i + " appears " + cnt[i] + " times");
        }
        return cnt;
    }
}
