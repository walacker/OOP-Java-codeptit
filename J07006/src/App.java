import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream dis = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) dis.readObject();
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int max = 0 , min = 0;
        for (Integer x : list) {
            if(max < x) max = x;
            if(min > x) min = x;
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        for(int i = min; i <= max; i++){
            if(mp.containsKey(i)){
                System.out.println(i + " " + mp.get(i));
            }
        }
        dis.close();
    }
}