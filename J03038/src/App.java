
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve() {
        String s = sc.next();
        int mp[] = new int[130],dem = 0;
        for (int i = 0; i < s.length(); i++) {
            mp[s.charAt(i)]++;
        }
        for(int i = 'a' ; i <= 'z' ; i++) {
            if(mp[i] > 0) dem++;
        }
        System.out.println(dem);
    }

    public static void main(String[] args) throws Exception {
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0)
            Solve();
    }
}
