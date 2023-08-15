import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    
    public static void Solve(){
        int n = sc.nextInt();
        int a[] = new int[n+1];
        int d[] = new int[205];
        int max = 0 ,dem = 0; 
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            d[a[i]] = 1;
            if(a[i] > max) max = a[i];
        }
        for(int i = 1 ; i < max ; i++){
            if(d[i]!=1) { 
                System.out.println(i);
                dem++;
            }
        }
        if(dem == 0) System.out.println("Excellent!");
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


