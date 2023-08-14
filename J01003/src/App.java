import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = -b/a;
        if (a == 0 && b == 0) System.out.println("VSN");
        else if (a == 0 && b != 0) System.out.println("VN");
        else System.out.printf("%.2f", c);
    }
}
