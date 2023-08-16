import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean isDigit(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) > '9' || s.charAt(i) < '0')
                return false;
        return true;
    }

    public static boolean check(String s){
        int even = 0 , odd = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) % 2 == 0) even++;
            else odd++;
        }
        if ((s.length() % 2 == 0 && even > odd) || (s.length() % 2 == 1 && odd > even)) return true;
        return false;
    }

    static void Solve() {
        String s = sc.nextLine();
        if(isDigit(s) == true ) System.out.println(check(s) ? "YES" : "NO");
        else System.out.println("INVALID");
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}
