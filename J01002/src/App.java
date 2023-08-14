import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i ++){
            long n = sc.nextInt();
            long s = ((n+1)*n)/2;
            System.out.println(s);
        }
    }
}
