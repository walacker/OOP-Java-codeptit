import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve( ){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Set<String> se = new HashSet<String>();
            for(int i = 0 ; i < s.length() ; i++){
                se.add(s.substring(i, i + 1));
                //System.out.println(s.charAt(i));
            }
            if(26 - se.size() <= k){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}
