import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> mp = new HashMap<String, Integer>();

    public static void Normalize(String s) {
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].toLowerCase();
        }
        String res = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            res += a[i].charAt(0);
        }
        mp.put(res, mp.get(res) != null ? mp.get(res)+1 : 1);
        res += mp.get(res)==1?"":mp.get(res);
        res += "@ptit.edu.vn";
        System.out.println(res);
    }

    public static void Solve() {
        String s = sc.nextLine().trim();
        // String[] a = s.split("\\s+");
        // System.out.println(String.join(" ", a));
        Normalize(s);
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}