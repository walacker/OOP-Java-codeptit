import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Normalize(String s){
        String[] a = s.split("\\s+");
        for(int i=0; i<a.length; i++){
            a[i] = a[i].toLowerCase();
            a[i] = a[i].substring(0,1).toUpperCase() + a[i].substring(1);
        }
        for(int i = 1;i<a.length-1;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print(a[a.length-1]+", " + a[0].toUpperCase() + "\n");
    }

    public static void Solve(){
        String s = sc.nextLine().trim();
        //String[] a = s.split("\\s+");
        //System.out.println(String.join(" ", a));
        Normalize(s);
    }

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) Solve();
    }
}


