import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class App {
    static Vector<String> res = new Vector<>();

    public static void init(int [] a, String s, int j , int n){
        s+= String.valueOf(a[j] + " ");
        res.add(s);
        for (int i = j + 1; i < n; i++) {
            if(a[j] < a[i]) init(a, s, i, n);
        }
    }

    public static void Solve(int[] a,int n){
        for (int i = 0; i < n-1; i++) {
            init(a, "", i, n);
        }
        Collections.sort(res);
        for(String s : res){
            if(s.split(" ").length > 1) System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        int a[] = new int[n+5];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solve(a,n);
    }
}


