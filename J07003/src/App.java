import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static void Solve(String s) {
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }
        while (s.length() > 1) {
            BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
            BigInteger b = new BigInteger(s.substring(s.length() / 2));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0){
            String s = sc.next();
            Solve(s);
        }
    }