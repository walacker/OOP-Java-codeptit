import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

    static boolean prime( long n){
        if(n<2) return false;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return false ;
        }
        return true ;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (List<Integer>) ois.readObject();
        Set<Integer> set = new TreeSet<Integer>();
        for (Integer x : list1) {
            if(prime(x)) set.add(x);
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (List<Integer>) ois2.readObject();
        Set<Integer> set2 = new TreeSet<Integer>();
        for (Integer x : list2) {
            if(prime(x)) set2.add(x);
        }

        final int SUM = 1000000;
        for(int i : set){
            if(i * 2 > SUM) break;
            if(set.contains(SUM - i) && !set2.contains(i) && !set2.contains(SUM - i)) System.out.println(i + " " + (SUM - i));
        }
        ois.close();
        ois2.close();
    }
}