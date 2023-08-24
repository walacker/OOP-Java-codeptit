import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int max = 0 , min = 0,test = 100000;
        while (test-- > 0) {
            int x = dis.readInt();
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
