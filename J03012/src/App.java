import java.math.BigInteger;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = (a.add(b)).abs();
        // convert abc to string
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        if(s3.length() < Math.max(s1.length(), s2.length())){
            System.out.printf("0");
        }
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0)
            Solve();
    }
}