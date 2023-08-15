import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(int t){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.printf("Test %d:\n", t);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++){
            Solve(i);
        }
    }
}


