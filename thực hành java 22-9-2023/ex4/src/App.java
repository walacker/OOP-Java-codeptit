import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    static boolean check(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            if((s.charAt(i) != 6 && s.charAt(i) != 8)) return false;
            if(s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }


    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            System.out.println(check(s) ? "YES" : "NO");
        }
    }
}
