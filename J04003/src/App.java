import java.util.Scanner;

class Fraction{
    private long a,b;

    public Fraction(){
        a = 0;
        b = 1;
    }

    Fraction(long a,long b){
        this.a = a ;
        this.b = b ;
    }

    private long gcd(long x , long y ){
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    @Override
    public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        long a = sc.nextLong();
        long b = sc.nextLong();
        Fraction f = new Fraction(a, b);
        System.out.println(f);
    }

    public static void main(String[] args) throws Exception {
        Solve();
    }
}


