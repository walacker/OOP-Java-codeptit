///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;
 
public class App {
     
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
         
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
         
        int[] maxSquare = findLargestBlock(a);
        System.out.print("The maximum square submatrix is at (" + maxSquare[0] + ", " + maxSquare[1] + ")");
        System.out.println(" with size " + maxSquare[2]);
        sc.close();
    }
     
    public static int[] findLargestBlock(int[][] a) {
        for (int size = a.length; size >=1 ; size--) {
            for (int row = 0; row < a.length; row++) {
                for (int column = 0; column < a[row].length; column++) {
                    if((a.length - row >= size) && (a[row].length - column >= size)) {
                        boolean check = true;
                        for (int i = row; i < row + size; i++) {
                            for (int j = column; j < column + size; j++) {
                                if(a[i][j] != 1) {
                                    check = false;
                                    break;
                                }
                            }
                            if(!check)
                                break;
                        }
                        if(check)
                            return new int[] {row, column, size}; 
                    }
                }
            }
        }
        return new int[] {0};
    }
     
}