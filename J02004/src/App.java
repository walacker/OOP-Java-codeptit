import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int check(int a[], int n){
        for(int i = 0 ; i < n/2 ; i ++){
            if(a[i] != a[n-i-1]) return 0;
        }
        return 1;
    }
    
    public static void Solve(){
        int n = sc.nextInt();
        int a[] = new int[100];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        if(check(a, n) == 1) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


