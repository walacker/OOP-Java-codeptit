import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static boolean Solve(String s){
        for(int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) !=  s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.next();
            System.out.println(s.matches("[^014689]+") && Solve(s) ? "YES" : "NO");
        }
    }
}


