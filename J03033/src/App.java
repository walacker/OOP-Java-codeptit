import java.math.BigInteger;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = (a.multiply(b)).divide(a.gcd(b));
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}
