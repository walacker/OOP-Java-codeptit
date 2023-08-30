///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n = new int[10];
        creatArray(n);
        display(n);    
    }
    
    private static void creatArray(int[] a) {
        for(int i = 0 ; i < 10 ; i ++){
            a[i] = sc.nextInt();
        }
    }

    private static void display(int[] a){
        int dem = 0 ;
        for(int i = 0 ; i < 10 ; i++){
            if(a[i] % 2 == 0 ) dem++;
        }
        System.out.println("even number: " + dem);
        dem = 0 ;
        for(int i = 0 ; i < 10; i++){
            if(a[i] % 2 != 0 ) dem++;
        }
        System.out.println("odd number: " + dem);
    }
}
