import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static void reverse(String s){
        s = new StringBuilder(s).reverse().toString();
        System.out.print(s);
    }

    static void Solve() {
        String[] a = sc.nextLine().split(" ");
        for(int i = 0; i<a.length; i++){
            reverse(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}