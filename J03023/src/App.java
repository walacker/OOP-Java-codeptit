import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static Map<String, String> map = new HashMap<String, String>();

    public static void Solve(String s ){
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                case 'I':
                    a[i] = 1;
                    break;
                case 'V':
                    a[i] = 5;
                    break;
                case 'X':
                    a[i] = 10;
                    break;
                case 'L':
                    a[i] = 50;
                    break;
                case 'C':
                    a[i] = 100;
                    break;
                case 'D':
                    a[i] = 500;
                    break;
                case 'M':
                    a[i] = 1000;
                    break;
            }
        }
        int res = a[s.length() - 1];
        for(int i = s.length() - 1; i > 0; i--){
            if(a[i] > a[i - 1]){
                res -= a[i-1];
            }
            else{ 
                if(a[i] == a[i-1] || a[i] < a[i-1] ) res += a[i-1];
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.next();
            Solve(s);
        }
    }
}
