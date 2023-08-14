import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static long[] fb = new long[100];

    public static void create() {
        fb[1] = fb[2] = 1L;
        for (int i = 3; i < 100; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }

    public static char sol(int n, long k) {
        if (n == 1) {
            return '0';
        }
        if (n == 2) {
            return '1';
        }
        if (k <= fb[n - 2]) {
            return sol(n - 2, k);
        }
        return sol(n - 1, k - fb[n - 2]);
    }

    public static void main(String[] args) throws Exception {
        create();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(sol(n, k));
        }
    }
}


