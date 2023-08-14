import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        long res = 0 , pos = 1;
        for(int i = 1 ; i <= n ; i++){
            pos*=i;
            res+=pos;
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}
