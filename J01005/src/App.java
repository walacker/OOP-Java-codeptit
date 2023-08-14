import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        int h = sc.nextInt();
        for (double i = 1.0; i < n; i++) {
            System.out.printf("%.6f ", Math.sqrt(i / n) * h);
        }
        System.out.println();

    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-- >0){
            Solve();
        }
    }
}
