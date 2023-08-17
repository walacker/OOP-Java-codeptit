import java.math.BigInteger;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean is(BigInteger a){
        if(a.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)) return true;
        return false;
    }

    public static void Solve() {
        BigInteger a = sc.nextBigInteger();
        System.out.println(is(a) ? "1" : "0");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}