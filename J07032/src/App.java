import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static boolean isReverse(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }

        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (List<Integer>) ois.readObject();
        Set<Integer> set = new TreeSet<Integer>(list1);
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (List<Integer>) ois2.readObject();
        Set<Integer> set2 = new TreeSet<Integer>(list2);
        Set<Integer> res = new TreeSet<Integer>();
        for(int x : set){
            if(set2.contains(x) && isReverse(String.valueOf(x))){
                res.add(x);
            }
            if(res.size() == 10){
                break;
            }
        }

        for (int x : res)
            System.out.println(x + " " + (Collections.frequency(list1, x) + Collections.frequency(list2, x)));
        
        ois.close();
        ois2.close();
    }
}
