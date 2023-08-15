import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        int res = 0;
        byte[][] a = new byte[n][3];
        for (int i = 0; i < n; i++) {
            byte dem = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextByte();
                dem += a[i][j];
            }
            if (dem >= 2) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


