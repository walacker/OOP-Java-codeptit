import java.util.Scanner;

class Rectangle{
    private double w,h;
    private String color ;

    public Rectangle(){
        w = 1;
        h = 1;
    }

    public Rectangle(double w,double h,String color){
        this.h = h;
        this.w = w;
        this.color = color;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double findArea() {
        return w * h;
    }

    public double findPerimeter() {
        return 2 * (w + h);
    }

    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String color = sc.next();
        if(w > 0 && h > 0){
            Rectangle hcn = new Rectangle(w,h,color);
            System.out.println(hcn);
        } else System.out.println("INVALID");
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


