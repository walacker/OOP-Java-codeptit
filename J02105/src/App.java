import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = sc.nextInt();
        int a[][] = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1 ; i <= n; i++){
            System.out.printf("List(%d) = ",i);
            for(int j = 1 ; j <= n ; j++){
                if(a[i][j] == 1 ){
                    System.out.printf("%d ",j);       
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


