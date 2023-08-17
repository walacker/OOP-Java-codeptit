import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            a[i] = tmp * tmp;
        }
        Arrays.sort(a);
        boolean check = false;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    check = true;
                    break;
                } else if (a[l] + a[r] < a[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        System.out.println(check == true ? "YES" : "NO");
    }


    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


