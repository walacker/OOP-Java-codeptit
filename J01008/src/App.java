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

    public static void Solve(int t){
        int n = sc.nextInt();
        int res = n ;
        System.out.printf("Test %d: ",t);
        for(int i = 2; i <= Math.sqrt(n); i++){
            int d = 0 ;
            while(res % i == 0){
                d++;
                res/=i;
            }
            if(d!=0) System.out.printf("%d(%d) ", i, d);
        }
        if (res != 1) {
            System.out.printf("%d(%d) ", res, 1);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++){
            Solve(i);
        }
    }
}
