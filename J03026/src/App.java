import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static void Solve() {
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.equals(b) ? -1 : Math.max(a.length(), b.length()));
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}
