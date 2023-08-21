///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void creatArray(int[] a) {
        for(int i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
        }
    }

    public static void display(int[] a){
        System.out.println("odd array: ");
        for(int i = 0 ; i < 10 ; i++){
            if(a[i] % 2 == 0 ) System.out.printf("%d ", a[i]);
        }
        System.out.println();
        System.out.println("even array:");
        for(int i = 0 ; i < 10; i++){
            if(a[i] % 2 != 0 ) System.out.printf("%d ", a[i]);
        }
    }

    public static void main(String[] args) {
        int[] n = new int[10];
        creatArray(n);
        display(n);    
    }
}
