import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean check1(int[] a) {
        return (a[0] == a[1] && a[0] == a[2] && a[3] == a[4]);
    }

    public static boolean check2(int[] a) {
        for (int i : a) {
            if (i != 6 && i != 8) {
                return false;
            }
        }
        return true;
    }

    public static boolean check3(int[] a) {
        for (int i = 1; i < 5; i++) {
            if (a[i] <= a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[] a) {
        return (check1(a) || check2(a) || check3(a));
    }

    public static void Solve() {
        String s = sc.nextLine();
        int[] a = new int[5];
        a[0] = s.charAt(5) - '0';
        a[1] = s.charAt(6) - '0';
        a[2] = s.charAt(7) - '0';
        a[3] = s.charAt(9) - '0';
        a[4] = s.charAt(10) - '0';
        System.out.println(check(a) ? "YES" : "NO");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}