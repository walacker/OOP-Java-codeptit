import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int[] a = new int[4];
        int[] b = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int res = Math.max(a[3] - a[0], b[3] - b[0]);
        System.out.println(res * res);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


