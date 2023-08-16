import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean check(String s){
            int cnt = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    cnt++;
                }
            }
            if ((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1)) {
                return true;
            } else 
                return false;
    }

    static void Solve() {
        String s = sc.nextLine();
        System.out.println(check(s) ? "YES" : "NO");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}
