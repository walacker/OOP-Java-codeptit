import java.math.BigInteger;
import java.util.Scanner;

class PhanSo {

    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public static long gcdThing(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }

    public static PhanSo rutGon(PhanSo a) {
        long gcd = gcdThing(a.tuSo, a.mauSo);
        PhanSo ans = new PhanSo(a.tuSo / gcd, a.mauSo / gcd);
        return ans;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void Solve() {
        PhanSo A = new PhanSo(scanner.nextLong(), scanner.nextLong());
        PhanSo B = new PhanSo(scanner.nextLong(), scanner.nextLong());

        PhanSo C = new PhanSo((long) Math.pow(A.getTuSo() * B.getMauSo() + B.getTuSo() * A.getMauSo(), 2),
                (long) Math.pow(A.getMauSo() * B.getMauSo(), 2));
        C = PhanSo.rutGon(C);

        long tuD = (long) (A.getTuSo() * B.getTuSo() * C.getTuSo());
        long mauD = (long) (A.getMauSo() * B.getMauSo() * C.getMauSo());
        PhanSo D = new PhanSo(tuD, mauD);
        D = PhanSo.rutGon(D);
        System.out.println(C + " " + D);
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t-- > 0) {
            Solve();
        }
    }

}