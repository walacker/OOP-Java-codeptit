import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> set = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
               int n = Integer.valueOf(s);
            } catch (NumberFormatException e) {
                set.add(s);
            }
        }
        Collections.sort(set);
        for (String s : set) {
            System.out.printf(s + " ");
        }
    }
}
