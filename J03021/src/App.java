import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static Map<String, String> map = new HashMap<String, String>();

    public static void init() {
        map.put("a", "2");
        map.put("b", "2");
        map.put("c", "2");
        map.put("d", "3");
        map.put("e", "3");
        map.put("f", "3");
        map.put("g", "4");
        map.put("h", "4");
        map.put("i", "4");
        map.put("j", "5");
        map.put("k", "5");
        map.put("l", "5");
        map.put("m", "6");
        map.put("n", "6");
        map.put("o", "6");
        map.put("p", "7");
        map.put("q", "7");
        map.put("r", "7");
        map.put("s", "7");
        map.put("t", "8");
        map.put("u", "8");
        map.put("v", "8");
        map.put("w", "9");
        map.put("x", "9");
        map.put("y", "9");
        map.put("z", "9");
    }

    public static boolean reverse(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void Solve() {
        String s = sc.nextLine();
        s = s.toLowerCase();
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            num = num + map.get(String.valueOf(s.charAt(i)));
        }
        System.out.println(reverse(num)?"YES":"NO");
    }

    public static void main(String[] args) throws Exception {
        init();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            Solve();
    }
}
