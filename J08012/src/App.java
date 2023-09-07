import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = sc.nextInt();
        int[] map = new int[n+2];
        for(int i = 0 ; i < n - 1 ; i++){
            int a = sc.nextInt() , b = sc.nextInt() ;
            map[a]++;
            map[b]++;
        }
        System.out.println(isValid(map, n) ? "Yes" : "No");
    }

    public static boolean isValid(int[] map , int n){
        for(int i = 0 ; i < n ; i++){
            if(map[i] == n-1 ) return true;
        }
        return false;
    }
}
