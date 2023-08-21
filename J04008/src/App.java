import java.util.Scanner;
import static java.lang.Math.*;

import java.text.DecimalFormat;
class Point{
    public double x,y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(Point p){
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    public double distance(Point a, Point b){
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }

    public String toString() {
        return x + " " + y;
    }

}
public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        Point[] arr = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arr[i] = new Point(x, y);
            }
            double a = arr[0].distance(arr[1]);
            double b = arr[1].distance(arr[2]);
            double c = arr[0].distance(arr[2]);
            DecimalFormat decf = new DecimalFormat("#0.000");
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println(decf.format(a+b+c));
            } else {
                System.out.println("INVALID");
            }
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}


