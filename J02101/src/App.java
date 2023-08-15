import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int i = 0, j = 0, xuoi = 1;
        while (true) {
            System.out.print(a[i][j] + " ");
            if (xuoi == 1) {
                j++;
                if (j == n) {
                    i++;
                    j = n - 1;
                    xuoi = 0;
                }
            } else {
                j--;
                if (j < 0) {
                    i++;
                    j = 0;
                    xuoi = 1;
                }
            }
            if (i == n) {
                break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


