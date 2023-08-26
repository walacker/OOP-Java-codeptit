///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int[][] a = createMatrix(n);

        System.out.println("Matrix: ");
        printMatrix(a);

        int[] sumbyColumn = sumbyColumn(a);
        for (int i = 0; i < sumbyColumn.length; i++) {
            System.out.println("Sum column " + i + ": " + sumbyColumn[i]);
        }

        int[] maxRow = maxRow(a);
        for (int i = 0; i < maxRow.length; i++) {
            System.out.println("Max row " + i + ": " + maxRow[i]);
        }

        int[] indexMaxRow = indexMaxRow(a);
        for(int i = 0; i < indexMaxRow.length; i++){
            System.out.println("Index max row " + i + ": " + indexMaxRow[i]);
        }
    }

    private static int[][] createMatrix(int n){
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    private static void printMatrix(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] sumbyColumn(int[][] a){
        int[] sum = new int[a.length];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                sum[j] += a[i][j];
            }
        }
        return sum ; 
    }

    private static int[] maxRow(int[][] a) {
        int[] maxRow = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            maxRow[i] = a[i][0];
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] > maxRow[i]) {
                    maxRow[i] = a[i][j];
                }
            }
        }
        return maxRow;
    }

    private static int[] indexMaxRow(int[][] a) {
        int[] index = new int[a.length];
        for(int i = 0 ; i < a.length ; i++){
            index[i] = 0;
            for(int j = 0 ; j < a.length;j++){
                if(a[i][j] > a[i][index[i]]){
                    index[i] = j;
                }
            }
        }
        return index;
    }

}
