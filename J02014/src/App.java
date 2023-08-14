import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int n = sc.nextInt();
        int a[] = new int[n+5];
        int sum = 0 , sum2 = 0,res = -1;
        for(int i = 1; i <= n; ++i) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for(int i = 1; i <= n; ++i) {
            sum -= a[i];
            if(sum == sum2) {
                res = i ;
                break;
            }
            sum2 += a[i];
        }
        if(res != -1) System.out.println(res);
        else System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


