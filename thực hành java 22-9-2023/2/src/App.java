import java.math.BigInteger;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Phanso a = new Phanso(new BigInteger(sc.next()), new BigInteger(sc.next()));
        Phanso b = new Phanso(new BigInteger(sc.next()), new BigInteger(sc.next()));
        Phanso c = a.hieu(b);
        if(c.getTu().divideAndRemainder(c.getMau())[1].longValue() == 0){
            System.out.println(c.getTu().divide(c.getMau()));
        }else {
            System.out.println(c.getTu() + "/" + c.getMau());
        }
    }
}

class Phanso{
    private BigInteger tu;
    private BigInteger mau;

    public Phanso(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private void normalize(){
        BigInteger gcd = tu.gcd(mau);
        this.tu = this.tu.divide(gcd);
        this.mau = this.mau.divide(gcd);
    }

    public Phanso hieu(Phanso other){
        BigInteger bcnn = this.tu.multiply(other.mau).divide(other.tu.multiply(this.mau));
        BigInteger temp1 = this.tu.multiply(bcnn.divide(this.mau));
        BigInteger temp2 = other.tu.multiply(bcnn.divide(other.mau));
        return new Phanso(new BigInteger(temp1.subtract(temp2).toString()), new BigInteger(bcnn.toString()));

    }

    public BigInteger getTu() {
        return tu;
    }

    public void setTu(BigInteger tu) {
        this.tu = tu;
    }

    public BigInteger getMau() {
        return mau;
    }

    public void setMau(BigInteger mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}