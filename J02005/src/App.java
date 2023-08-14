import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int mp[] = new int[1005];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            mp[a[i]] = 1;
        }

        for(int i = 0 ; i < m ; i++) b[i] = sc.nextInt();

        Arrays.sort(b);

        for(int i = 0 ; i < m ; i++) {
            if(mp[b[i]] == 1) {
                System.out.printf("%d ",b[i]);
                mp[b[i]] = 0;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


