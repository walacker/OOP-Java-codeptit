import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int n = sc.nextInt();
        int a[] = new int[n];
        int mp[] = new int[100005];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            mp[a[i]] ++;
        }

        for(int i = 0 ; i < n ; i++) {
            if(mp[a[i]] > 0) {
                System.out.printf("%s xuat hien %d lan",a[i],mp[a[i]]);
                mp[a[i]] = 0;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        int dem = 1 ;
        while(t-- >0) {
            System.out.printf("Test %d:\n",dem++);
            Solve();
        }
    }
}


