import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve() {
        String s = sc.next(), x = "";
        char k = 'a';
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= k) {
                k = s.charAt(i);
                x = k + x;
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args) throws Exception {
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0){
            Solve();
        //}
    }
}