import java.math.BigInteger;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean is(BigInteger a, BigInteger b){
        if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)) return true;
        return false;
    }

    public static void Solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(is(a, b) ? "YES" : "NO");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}