import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        long n = sc.nextLong();
        if (Math.sqrt(n) == (int)Math.sqrt(n)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-- >0) Solve();
    }
}


