import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean isValid(char c) {
        return c >= '0' && c <= '2';
    }

    public static void check(String s){
        for (int i = 0; i < s.length(); i++){
            if (!isValid(s.charAt(i))) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void Solve(){
        String s = sc.next();
        //System.out.println(s);
        check(s);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


