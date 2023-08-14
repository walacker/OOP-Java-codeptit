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
    public static void Solve(){
        long a = sc.nextInt();
        long b = sc.nextInt();
        long res = gcd(a, b);
        long pos = (a*b)/res;
        System.out.printf("%d %d",pos,res);
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


