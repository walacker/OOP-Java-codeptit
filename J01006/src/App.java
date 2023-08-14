import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static long[] fb = new long[100];

    public static void creat() {
        fb[0] = 0L;
        fb[1] = 1L;
        for (int i = 2; i < 100; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }

    public static void Solve(){
        int n = sc.nextInt();
        System.out.println(fb[n]);
    }

    public static void main(String[] args) throws Exception {
        creat();
        int t = sc.nextInt();
        while(t-- >0){
            Solve();
        }
    }
}
