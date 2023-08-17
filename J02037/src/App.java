import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static boolean check(String[] a){
        int n = a.length, even = 0 , odd = 0 ;
        for (int i = 0; i < a.length; i++) {
            if (a[i].charAt(a[i].length() - 1) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if ((n % 2 == 0 && even > odd) || (n % 2 == 1 && even < odd)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void Solve() {
        String[] a = sc.nextLine().trim().split("\\s+");
        System.out.println(check(a) ? "YES" : "NO");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}