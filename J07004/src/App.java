import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int max = 0 , min = 0;
        while (sc.hasNext()) {
            int x = sc.nextInt();
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
    }
}
