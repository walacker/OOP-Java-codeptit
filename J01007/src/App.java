import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static long[] fb = new long[100];

    public static void create() {
        fb[0] = 0L;
        fb[1] = 1L;
        for (int i = 2; i < 100; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }
    
    public static boolean isfb(long n) {
        for (long i : fb) {
            if (i == n) {
                return true;
            } else if (i > n) {
                return false;
            }
        }
        return false;
    }

    public static void Solve(){
        long n = sc.nextLong();
        if(isfb(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        create();
        int t = sc.nextInt();
        while(t-- >0){
            Solve();
        }
    }
}
