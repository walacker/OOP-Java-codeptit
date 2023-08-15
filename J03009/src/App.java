import java.util.HashSet;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

   public static void Solve(){
        String[] a = sc.nextLine().split("\\s+");
        String b = sc.nextLine();
        HashSet<String> c = new HashSet<>();
        for (String s : a) {
            if (!b.contains(s)) {
                c.add(s);
            }
        }
        for (String s : c) {
            System.out.print(s + " ");
        }
        System.out.println();
   }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            Solve();
        }
    }
}


