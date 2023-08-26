///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        init();
    }
    
    private static void init(){
        int n = 1000;
        boolean[] check = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
          check[i] = true;
        }
    
        for (int i = 2; i <= n; i++) {
          if (check[i] == true) {
            for (int j = 2 * i; j <= n; j += i) {
              check[j] = false;
            }
          }
        }
        int dem = 0 ;
        for (int i = 2; i <= n; i++) {
          if (check[i] == true && dem <= 50) {
                dem++;
                System.out.print(i + " ");
          }else if(dem > 50) return;
        }
    }
}
