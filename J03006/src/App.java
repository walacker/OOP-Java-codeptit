import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);


    public static int Solve(String s){
        for(int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) !=  s.charAt(s.length()-1-i)) return 0;
            if((s.charAt(i) -'0') % 2 !=0 ||(s.charAt(s.length()-1-i) - '0' ) % 2 != 0 ) return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.next();
            if(Solve(s) == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}


