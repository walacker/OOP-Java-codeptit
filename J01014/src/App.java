import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean prime( long n){
        if(n<2) return false;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return false ;
        }
        return true ;
    }
    
    public static void Solve(){
        long n = sc.nextLong();
        long res = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (prime(n / i)) {
                    System.out.println(n / i);
                    return;
                }
                if (prime(i)) {
                    res = i;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) {
            Solve();
        }
    }
}


