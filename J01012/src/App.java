public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    
    public static void Solve(){
        long x = sc.nextInt();
            int res = 0 ; 
            for(int j = 1 ; j <= Math.sqrt(x);j++){
                if(j % 2 == 0 && x % j == 0)  res ++ ; 
                if((x/j) % 2 == 0 && j != x /j && x%j == 0  ) res ++ ; 
            }
            System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


