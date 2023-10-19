import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Pair{
    public int t,d;

    public void input(Scanner sc){
        t = sc.nextInt();
        d = sc.nextInt();
    }
    
}
public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        Vector<Pair> v = new Vector<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Pair x = new Pair();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                if (a.t > b.t) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (res < v.get(i).t) {
                res = v.get(i).t;
            }
            res += v.get(i).d;
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Solve();
        sc.close();
    }
}