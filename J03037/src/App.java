
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve( ){
        String s = sc.nextLine();
        int [] vs = new int [200];
        int [] d = new int [200];
        for (int i = 0; i < s.length(); i++){ 
            vs[s.charAt(i)] = i;
        }
        for (int i = 0; i < s.length(); i++){ 
            if(i != vs[s.charAt(i)])
                d[s.charAt(i)] = i;
        }
        int cnt = 0;
        for(char i = 'A'; i <= 'Z'; i++){
            for(char j = 'A'; j <= 'Z'; j++){
                if(d[j] > d[i] && d[j] < vs[i] && vs[j] > vs[i]) 
                    ++cnt;
                else if(d[j] < d[i] && d[i] < vs[j] && vs[j] < vs[i]) 
                    ++cnt;
            }
        }
        System.out.println(cnt / 2);
        }

    public static void main(String[] args) throws Exception {
        //int t = Integer.parseInt(sc.nextLine());
        //while (t-- > 0){
            Solve();
        //}
    }
}
