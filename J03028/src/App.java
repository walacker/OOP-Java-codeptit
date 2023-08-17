import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static char[] chr = new char[26];
    static int[] num = new int['Z' + 1];

    public static void init(){
        for (int i = 0; i <= 'Z' - 'A'; i++) {
            chr[i] = (char) ('A' + i);
            num['A' + i] = i;
        }
    }

    public static void Solve( ){
            String s = sc.nextLine();
            //System.out.println(s);
            char[] s1 = s.substring(0, s.length()/2).toCharArray();
            char[] s2 = s.substring(s.length()/2).toCharArray();
            int value1 = 0, value2 = 0;
            for (int i = 0; i < s1.length; i++) {
                value1 += num[s1[i]];
                value2 += num[s2[i]];
            } 
            for (int i = 0; i < s1.length; i++) {
                s1[i] = chr[(num[s1[i]] + value1) % 26];
                s2[i] = chr[(num[s2[i]] + value2) % 26];
            }
            for (int i = 0; i < s1.length; i++) 
                s1[i] = chr[(num[s1[i]] + num[s2[i]]) % 26];
            System.out.println(String.valueOf(s1));
        }

    public static void main(String[] args) throws Exception {
        init();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            Solve();
        }
    }
}
