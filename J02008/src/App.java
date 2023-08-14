import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static long gcd(long a, long b){
        long i;
        if (a < b)
            i = a;
        else
            i = b;
        for (long j = i; j > 1; j--) {
            if (a % j == 0 && b % j == 0)
                return j;
        }
        return 1;
    }

    static long lcm(long a, long b){
        return (a * b) / gcd(a, b);
    }
    public static void Solve(){
        int n = sc.nextInt();
        long res = 1 ; 
        for(int i = 2 ; i <= n ; i++) {
            res = lcm(res,i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


