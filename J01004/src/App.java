import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static  long prime( long n){
        if(n<2) return 0;
        if(n==2 || n==3) return 1 ;
        if(n%2==0 || n%3==0) return 0 ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return 0 ;
        }
        return 1 ;
    }

    public static void Solve(){
        long n = sc.nextLong();
        if(prime(n)==1) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-- >0){
            Solve();
        }
    }
}
