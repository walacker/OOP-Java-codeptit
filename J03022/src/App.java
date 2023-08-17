import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> mp = new HashMap<String, Integer>();

    public static void Solve() {
        int check = 1;
        while(sc.hasNext()){
            String s = sc.next();
            s = s.toLowerCase();
            if(check == 1){
                s = s.substring(0,1).toUpperCase() + s.substring(1);
                check = 0 ; 
            }
            if(s.charAt(s.length()-1) == '.' || s.charAt(s.length()-1)  == '?' || s.charAt(s.length()-1)  == '!' ){
                s = s.substring(0, s.length()-1);
                System.out.println(s);
                check = 1;
            }else System.out.print(s+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0){
            Solve();
        //}
    }
}