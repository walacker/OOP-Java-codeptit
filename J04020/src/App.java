
import java.util.Scanner;

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair of(K key, V value) {
        return new Pair<>(key, value);
    }

    public boolean prime( long n){
        if(n<2) return false;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return false ;
        }
        return true ;
    }


    public boolean isPrime() {
        if (prime(Integer.parseInt(key.toString())) && prime(Integer.parseInt(value.toString()))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    public static void main5440608(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
