import java.util.Scanner;

class ComplexNumber {

    private int r;
    private int i;

    public ComplexNumber(int r, int i) {
        this.r = r;
        this.i = i;
    }

    public int getr() {
        return r;
    }

    public void setr(int r) {
        this.r = r;
    }

    public int geti() {
        return i;
    }

    public void seti(int i) {
        this.i = i;
    }

    public static ComplexNumber sumTwoComplex(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.r + b.r, a.i + b.i);
    }

    public static ComplexNumber mulTwoComplex(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.r * b.r - a.i * b.i,
                a.i * b.r + a.r * b.i);
    }

    @Override
    public String toString() {
        String res = "";
        res += r + " ";
        if (i >= 0) {
            res += "+ " + i + "i";
        } else {
            res += "- " + (-i) + "i";
        }
        return res;
    }
}


public class App {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            ComplexNumber a = new ComplexNumber(sc.nextInt(), sc.nextInt());
            ComplexNumber b = new ComplexNumber(sc.nextInt(), sc.nextInt());

            ComplexNumber sum = ComplexNumber.sumTwoComplex(a, b);
        
            ComplexNumber c = ComplexNumber.mulTwoComplex(sum, a);
        
            ComplexNumber d = ComplexNumber.mulTwoComplex(sum, sum);
            System.out.println(c + ", " + d);
        }
        sc.close();
    }
}
