import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int h = sc.nextInt();
        int w = sc.nextInt(); 

        if(w <= 0 || h <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (w + h) + " " + w * h);
        }
    }
}
