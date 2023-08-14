import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int check1(String s){
        for(int i = 1 ; i < s.length() ; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i-1)) != 2) return 0;
        }
        return 1;
    }
    
    public static int check2(String s){
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            res += (s.charAt(i) - '0');
        }
        if(res % 10 == 0 ) return 1;
        return 0;
    }

    public static void Solve(){
        String s = sc.next();
        if(check1(s) == 1 && check2 (s) == 1) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


