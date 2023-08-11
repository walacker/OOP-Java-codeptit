import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int n = sc.nextInt();
            System.out.println(((n+1)*n)/2);
        }
    }
}
