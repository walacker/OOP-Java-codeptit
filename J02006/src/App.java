import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n+m];
        int mp[] = new int[1005];
        for(int i = 0 ; i < n+m ; i++) {
            a[i] = sc.nextInt();
            mp[a[i]] = 1;
        }

        Arrays.sort(a);

        for(int i = 0 ; i < n+m ; i++) {
            if(mp[a[i]] == 1) {
                System.out.printf("%d ",a[i]);
                mp[a[i]] = 0;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


