import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> mp = new HashMap<String, Integer>();

    public static boolean check(String s){
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                cnt++;
            }
        }
        if ((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1)) {
            return true;
        } else 
            return false;
}

    public static void Solve() {
        Stack<String> st = new Stack<String>();
        int maxlength = 0, res = 0;
        while(sc.hasNext()){
                String[] a = sc.nextLine().split(" ");
                for(String s:a){
                    if(check(s) && s.length() >= maxlength){
                        maxlength = s.length();
                        st.add(s);
                        mp.put(s, mp.get(s) != null ? mp.get(s)+1 : 1);
                    }
                }
        }
        String s = "";
        while (!st.empty()){
            //System.out.println(st.lastElement()+" "+mp.get(st.lastElement()));
            if(st.lastElement().length() == maxlength && mp.get(st.lastElement()) > res){
                s = st.lastElement();
                res = mp.get(st.lastElement());
            }
            st.pop();
        }
        System.out.println(s+" "+mp.get(s));
    }

    public static void main(String[] args) throws Exception {
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0){
            Solve();
        //}
    }
}