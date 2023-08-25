import java.io.*;
import java.util.*;


@SuppressWarnings("unchecked")
public class App {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        Set<String> st = new TreeSet<>();
        for(String s : list){
            String[] a = s.trim().toLowerCase().split("\\s+");
            for(String x : a){
                st.add(x);
            }
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(st.contains(s)){
                System.out.println(s);
                st.remove(s);
            }
        }
    }
}